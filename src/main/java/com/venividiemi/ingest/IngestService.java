package com.venividiemi.ingest;

import com.venividiemi.listing.store.ListingStore;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Drives the write side: for each scraper, scrape -> normalize -> store.
 * Meant to be triggered on a schedule (and/or an admin endpoint) once the
 * pieces are implemented.
 */
@Service
public class IngestService {

    private final List<MarketplaceScraper> scrapers;
    private final ListingNormalizer normalizer;
    private final ListingStore store;

    public IngestService(List<MarketplaceScraper> scrapers,
                         ListingNormalizer normalizer,
                         ListingStore store) {
        this.scrapers = scrapers;
        this.normalizer = normalizer;
        this.store = store;
    }

    /** Run every scraper with the given query and persist what comes back. */
    public void ingestAll(ScrapeQuery query) {
        // TODO: for each scraper -> scrape(query) -> normalizer.normalize(...)
        //       -> collect present() -> store.upsertAll(...). Handle one
        //       scraper failing without aborting the rest.
    }
}
