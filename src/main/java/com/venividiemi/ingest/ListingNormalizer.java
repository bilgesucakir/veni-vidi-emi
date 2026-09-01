package com.venividiemi.ingest;

import com.venividiemi.geocode.Geocoder;
import com.venividiemi.listing.Listing;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * RawListing -> Listing: parse the price, build a stable id, and attach
 * coordinates via the {@link Geocoder}. Returns empty when the listing can't be
 * placed on the map (e.g. location text didn't resolve).
 */
@Component
public class ListingNormalizer {

    private final Geocoder geocoder;

    public ListingNormalizer(Geocoder geocoder) {
        this.geocoder = geocoder;
    }

    public Optional<Listing> normalize(RawListing raw) {
        // TODO: parse rawPrice -> BigDecimal + currency, id = source + ":" +
        //       sourceId, geocoder.geocode(raw.rawLocation()) for the point.
        return Optional.empty();
    }
}
