package com.venividiemi.geocode;

/**
 * Result of resolving a free-text location to a point. Neighborhood-level
 * precision is the goal — exact addresses are neither available nor wanted.
 */
public record Coordinates(
        double latitude,
        double longitude,
        String neighborhood,
        String city
) {
}
