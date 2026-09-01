package com.venividiemi.listing;

import com.venividiemi.listing.store.ListingStore;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Read side: what the map asks for. Kept separate from the ingest pipeline so
 * the two can evolve (and be cached) independently.
 */
@Service
public class ListingService {

    private final ListingStore store;

    public ListingService(ListingStore store) {
        this.store = store;
    }

    /** Listings to draw for the given map viewport. */
    public List<Listing> listingsInView(BoundingBox box) {
        // TODO: delegate to store.findWithin(box), maybe cap the count and
        //       apply a short-lived cache.
        return List.of();
    }
}
