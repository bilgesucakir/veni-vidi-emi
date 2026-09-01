package com.venividiemi.geocode;

import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Matches the listing's location text against a bundled table of Turkish
 * neighborhoods (mahalle) and their coordinates. No external service, no rate
 * limit, no cost — and neighborhood-level precision is all we want anyway.
 *
 * A live geocoder (self-hosted Nominatim) can implement {@link Geocoder} too
 * and act as a fallback for strings this table can't match.
 */
@Component
public class StaticNeighborhoodGeocoder implements Geocoder {

    @Override
    public Optional<Coordinates> geocode(String rawLocation) {
        // TODO: load the mahalle table on startup, normalize Turkish casing
        //       and diacritics, fuzzy-match rawLocation against it.
        return Optional.empty();
    }
}
