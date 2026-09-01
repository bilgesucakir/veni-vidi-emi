package com.venividiemi.ingest;

/**
 * What to scrape on one run. Mirrors the URL search params the source sites
 * expose (category, location, paging).
 *
 * @param category   source-specific category key or path
 * @param location   source-specific location key (city / district)
 * @param maxPages   how many result pages to walk before stopping
 */
public record ScrapeQuery(
        String category,
        String location,
        int maxPages
) {
}
