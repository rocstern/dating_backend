package com.matching.date.domain;

public class MemberIdle {
    private int id;
    private int memberId; // FK
    private int idleId; // FK

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
        return idleId;
    }

    public void setIdleId(int idleId) {
        this.idleId = idleId;
    }

    public MemberIdle(int id, int memberId, int idleId) {
        this.id = id;
        this.memberId = memberId;
        this.idleId = idleId;
    }
}
