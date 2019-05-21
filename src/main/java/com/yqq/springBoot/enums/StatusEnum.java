package com.yqq.springBoot.enums;

public enum  StatusEnum implements IBaseDbEnum{

    DELETE(1, "删除"),
    NORMAL(2, "可用"),
    DISABLE(3, "禁用");

    StatusEnum(int value, String describle) {
        this.value = value;
        this.describle = describle;
    }

    private Integer value;

    private String describle;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDescrible() {
        return describle;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    //
//
//    //获取枚举实例
//    public static StatusEnum fromValue(Integer status) {
//        for (StatusEnum statusEnum : StatusEnum.values()) {
//            if (Objects.equals(status, statusEnum.getStatus())) {
//                return statusEnum;
//            }
//        }
//        throw new IllegalArgumentException();
//    }

}
