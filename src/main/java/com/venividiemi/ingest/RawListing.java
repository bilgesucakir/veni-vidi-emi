package com.venividiemi.ingest;

import com.venividiemi.listing.Source;

import java.time.Instant;

/**
 * A listing exactly as scraped, before normalization. Everything is a string
 * because the source HTML is messy: prices like "1.250.000 TL", locations like
 * "Kadıköy Mah. / İstanbul".
 *
 * @param source     which scraper produced this
 * @param sourceId   the listing's id on the origin site
 * @param title      raw headline text
 * @param rawPrice   price text as shown, currency and separators included
 * @param thumbnailUrl image URL as found in the markup
 * @param url        listing URL as found in the markup
 * @param rawLocation location text as shown
 * @param scrapedAt  when we fetched it
 */
public record RawListing(
        Source source,
        String sourceId,
        String title,
        String rawPrice,
        String thumbnailUrl,
        String url,
        String rawLocation,
        Instant scrapedAt
) {
}
