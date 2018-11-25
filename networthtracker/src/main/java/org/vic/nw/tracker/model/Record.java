package org.vic.nw.tracker.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Record {
    private List<Record> assets = new ArrayList<>();
    private List<Record> liabilities = new ArrayList<>();
    private Date date = new Date();

    public List<Record> getAssets() {
        return assets;
    }

    public Record setAssets(List<Record> assets) {
        this.assets = assets;
        return this;
    }

    public List<Record> getLiabilities() {
        return liabilities;
    }

    public Record setLiabilities(List<Record> liabilities) {
        this.liabilities = liabilities;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Record setDate(Date date) {
        this.date = date;
        return this;
    }
}
