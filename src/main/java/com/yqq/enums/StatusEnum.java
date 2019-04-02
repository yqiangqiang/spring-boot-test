package com.yqq.enums;

public enum  StatusEnum {

    DELETE(0, "删除"),
    NORMAL(1, "可用"),
    DISABLE(2, "禁用");

    private int status;
    private String describle;

    StatusEnum(int status, String describle) {
        this.status = status;
        this.describle = describle;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }
}
