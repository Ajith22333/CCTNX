package com.cctnx.controller;

import com.cctnx.model.Parcel;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/parcels")
public class ParcelController {

    private final Map<String, Parcel> parcelStore = new HashMap<>();

    @PostMapping
    public Parcel addParcel(@RequestBody Parcel parcel) {
        parcelStore.put(parcel.getId(), parcel);
        return parcel;
    }

    @GetMapping("/{id}")
    public Parcel getParcel(@PathVariable String id) {
        return parcelStore.get(id);
    }

    @GetMapping
    public Collection<Parcel> getAllParcels() {
        return parcelStore.values();
    }
}
