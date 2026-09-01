package com.venividiemi.web;

import com.venividiemi.listing.BoundingBox;
import com.venividiemi.listing.Listing;
import com.venividiemi.listing.ListingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The only API the frontend needs so far: give me the listings in this box.
 * No auth — the app is public and anonymous by design.
 */
@RestController
@RequestMapping("/api/listings")
public class ListingController {

    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    /**
     * Listings inside the current map viewport.
     * Example: {@code /api/listings?minLon=28.9&minLat=40.9&maxLon=29.1&maxLat=41.1}
     */
    @GetMapping
    public List<Listing> listingsInView(
            @RequestParam double minLon,
            @RequestParam double minLat,
            @RequestParam double maxLon,
            @RequestParam double maxLat
    ) {
        BoundingBox box = new BoundingBox(minLon, minLat, maxLon, maxLat);
        return listingService.listingsInView(box);
        // TODO: probably return GeoJSON (FeatureCollection) once the map needs
        //       clustering; a plain list is fine to start.
    }
}
