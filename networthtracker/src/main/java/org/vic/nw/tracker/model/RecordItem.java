package org.vic.nw.tracker.model;

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
}
