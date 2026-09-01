package com.venividiemi.ingest;

import com.venividiemi.listing.Source;

import java.util.List;

/**
 * One implementation per marketplace. Expected to break periodically when the
 * source site changes its markup — that's maintenance, not a bug.
 */
public interface MarketplaceScraper {

    /** Which marketplace this scraper handles. */
    Source source();

    /** Fetch and parse listings matching the query. */
    List<RawListing> scrape(ScrapeQuery query);
}
