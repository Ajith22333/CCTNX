package com.cctnx.model;

public class Parcel {
    private String id;
    private String sender;
    private String receiver;
    private String status;

    public Parcel() {}

    public Parcel(String id, String sender, String receiver, String status) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    // Getters and Setters
}
