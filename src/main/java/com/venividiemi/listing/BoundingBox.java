package com.venividiemi.listing;

/**
 * The rectangle currently visible on the user's map, sent by the frontend so we
 * only return listings in view. Coordinates are WGS84 degrees.
 */
public record BoundingBox(
        double minLongitude,
        double minLatitude,
        double maxLongitude,
        double maxLatitude
) {
}
