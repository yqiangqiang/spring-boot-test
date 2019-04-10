package com.yqq.enums;

import java.util.Objects;

public interface IBaseDbEnum {

    Integer getValue();

    String getDescrible();


    static <T extends IBaseDbEnum> T fromValue(Class<T> enumType, Integer value) {
        for (T object : enumType.getEnumConstants()) {
            if (Objects.equals(value, object.getValue())) {
                return object;
            }
        }
        throw new IllegalArgumentException("No enum value " + value + " of " + enumType.getCanonicalName());
    }

}
