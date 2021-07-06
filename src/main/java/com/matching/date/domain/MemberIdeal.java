package com.matching.date.domain;

public class MemberIdeal {
    private int id;
    private int memberId; // FK
    private int idealId; // FK

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getIdleId() {
        return idealId;
    }

    public void setIdleId(int idleId) {
        this.idealId = idleId;
    }

    public MemberIdeal(int id, int memberId, int idleId) {
        this.id = id;
        this.memberId = memberId;
        this.idealId = idleId;
    }
}
