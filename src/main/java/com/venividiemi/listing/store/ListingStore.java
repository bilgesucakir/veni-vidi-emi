package com.venividiemi.listing.store;

import com.venividiemi.listing.BoundingBox;
import com.venividiemi.listing.Listing;

import java.util.Collection;
import java.util.List;

/**
 * Persistence boundary for normalized listings. The first implementation is
 * in-memory; a real datastore (Postgres + PostGIS, or similar) can drop in
 * behind this interface later without touching the pipeline or the web layer.
 */
public interface ListingStore {

    /** Insert new listings, refresh {@code lastSeenAt} on ones already present. */
    void upsertAll(Collection<Listing> listings);

    /** Listings whose location falls inside the given map viewport. */
    List<Listing> findWithin(BoundingBox box);
}
