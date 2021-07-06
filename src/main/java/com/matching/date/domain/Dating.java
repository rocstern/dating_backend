package com.matching.date.domain;

import java.util.Date;

public class Dating {

    private int id;
    private int formMemberId; // fk
    private int toMemberId; // fk
    private Date createAt;
    private int accept; // 0agree 1deny

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFormMemberId() {
        return formMemberId;
    }

    public void setFormMemberId(int formMemberId) {
        this.formMemberId = formMemberId;
    }

    public int getToMemberId() {
        return toMemberId;
    }

    public void setToMemberId(int toMemberId) {
        this.toMemberId = toMemberId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getAccept() {
        return accept;
    }

    public void setAccept(int accept) {
        this.accept = accept;
    }

    public Dating(int id, int formMemberId, int toMemberId, Date createAt, int accept) {
        this.id = id;
        this.formMemberId = formMemberId;
        this.toMemberId = toMemberId;
        this.createAt = createAt;
        this.accept = accept;
    }
}
