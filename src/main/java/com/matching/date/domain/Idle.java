package com.matching.date.domain;

public class Idle {
    private int id;
    private int type; //0height 1age
    private int rangeStart;
    private int rangeEnd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public Idle(int id, int type, int rangeStart, int rangeEnd) {
        this.id = id;
        this.type = type;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }
}
