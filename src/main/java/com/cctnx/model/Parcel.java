package com.cctnx.model;

public class Parcel {
    private Long id;
    private String name;

    // ✅ Add this
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
