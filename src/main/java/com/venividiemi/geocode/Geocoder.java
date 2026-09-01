package com.venividiemi.geocode;

import java.util.Optional;

/**
 * Turns the location text scraped from a listing (e.g. "Kadıköy / İstanbul")
 * into coordinates. Runs at ingest time, not per request.
 */
public interface Geocoder {

    Optional<Coordinates> geocode(String rawLocation);
}
