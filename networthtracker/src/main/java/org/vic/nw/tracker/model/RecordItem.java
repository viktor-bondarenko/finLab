package org.vic.nw.tracker.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


public class RecordItem {
    private String name = "";
    private Double value = 0.0;
    private Double contribution = 0.0;

    public String getName() {
        return name;
    }

    public RecordItem setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public RecordItem setValue(Double value) {
        this.value = value;
        return this;
    }

    public Double getContribution() {
        return contribution;
    }

    public RecordItem setContribution(Double contribution) {
        this.contribution = contribution;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        RecordItem that = (RecordItem) o;

        return new EqualsBuilder()
                .append(name, that.name)
                .append(value, that.value)
                .append(contribution, that.contribution)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(value)
                .append(contribution)
                .toHashCode();
    }
}
