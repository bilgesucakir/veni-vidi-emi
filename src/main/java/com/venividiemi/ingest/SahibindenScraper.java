package com.venividiemi.ingest;

import com.venividiemi.listing.Source;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * First source. Sahibinden's URL search params (category / location / page) are
 * the easiest starting point of the three candidate sites.
 */
@Component
public class SahibindenScraper implements MarketplaceScraper {

    @Override
    public Source source() {
        return Source.SAHIBINDEN;
    }

    @Override
    public List<RawListing> scrape(ScrapeQuery query) {
        // TODO: build the search URL from query, fetch each page politely
        //       (rate-limit, real User-Agent), parse rows with jsoup into
        //       RawListing. Add jsoup to pom.xml when starting this.
        return List.of();
    }
}
