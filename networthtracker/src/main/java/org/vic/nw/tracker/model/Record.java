package org.vic.nw.tracker.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Record {
    private List<RecordItem> assets = new ArrayList<>();
    private List<RecordItem> liabilities = new ArrayList<>();
    private Date date = new Date();

    public List<RecordItem> getAssets() {
        return assets;
    }

    public Record setAssets(List<RecordItem> assets) {
        this.assets = assets;
        return this;
    }

    public List<RecordItem> getLiabilities() {
        return liabilities;
    }

    public Record setLiabilities(List<RecordItem> liabilities) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        return new EqualsBuilder()
                .append(assets, record.assets)
                .append(liabilities, record.liabilities)
                .append(date, record.date)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(assets)
                .append(liabilities)
                .append(date)
                .toHashCode();
    }
}
