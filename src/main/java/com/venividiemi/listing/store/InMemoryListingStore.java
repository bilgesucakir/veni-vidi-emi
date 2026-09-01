package com.venividiemi.listing.store;

import com.venividiemi.listing.BoundingBox;
import com.venividiemi.listing.Listing;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Simple in-memory store, keyed by {@link Listing#id()}. Good enough while the
 * dataset is small and freshness matters more than durability.
 */
@Repository
public class InMemoryListingStore implements ListingStore {

    private final Map<String, Listing> byId = new ConcurrentHashMap<>();

    @Override
    public void upsertAll(Collection<Listing> listings) {
        // TODO: merge with existing entries, preserving firstSeenAt and
        //       bumping lastSeenAt.
    }

    @Override
    public List<Listing> findWithin(BoundingBox box) {
        // TODO: filter byId.values() to those inside the box.
        return List.of();
    }
}
