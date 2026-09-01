package com.venividiemi.listing;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * A normalized listing, ready to be shown as a pin on the map.
 * Produced by the ingest pipeline (scrape -> normalize -> geocode), stored,
 * and served to the frontend.
 *
 * @param id           stable id, unique across sources (e.g. "sahibinden:123456")
 * @param source       which marketplace it came from
 * @param title        listing headline
 * @param price        amount; null if the listing hides it
 * @param currency     ISO code, usually "TRY"
 * @param thumbnailUrl small preview image on the origin site
 * @param url          canonical URL of the original listing
 * @param latitude     geocoded, neighborhood-level (fuzzy by design)
 * @param longitude    geocoded, neighborhood-level (fuzzy by design)
 * @param neighborhood human-readable location as resolved by the geocoder
 * @param city         human-readable city
 * @param firstSeenAt  first time our scraper saw this listing
 * @param lastSeenAt   most recent time our scraper saw this listing
 */
public record Listing(
        String id,
        Source source,
        String title,
        BigDecimal price,
        String currency,
        String thumbnailUrl,
        String url,
        double latitude,
        double longitude,
        String neighborhood,
        String city,
        Instant firstSeenAt,
        Instant lastSeenAt
) {
}
