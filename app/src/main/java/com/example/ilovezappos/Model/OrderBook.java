package com.example.ilovezappos.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderBook {

    @SerializedName("date")
    @Expose
    public String timestamp;

    @SerializedName("date")
    @Expose
    public List<List<String>> bids;

    @SerializedName("date")
    @Expose
    public List<List<String>> asks;

    public OrderBook() { }

    public OrderBook(String timestamp, List<List<String>> bids, List<List<String>> asks) {
        this.timestamp = timestamp;
        this.bids = bids;
        this.asks = asks;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<List<String>> getBids() {
        return bids;
    }

    public void setBids(List<List<String>> bids) {
        this.bids = bids;
    }

    public List<List<String>> getAsks() {
        return asks;
    }

    public void setAsks(List<List<String>> asks) {
        this.asks = asks;
    }
}