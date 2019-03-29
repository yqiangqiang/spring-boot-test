package com.yqq.querydsl;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Visitor;

import javax.annotation.Nullable;

public class ConditionBuilder implements Predicate,Cloneable {
    @Override
    public Predicate not() {
        return null;
    }

    @Nullable
    @Override
    public <R, C> R accept(Visitor<R, C> visitor, @Nullable C c) {
        return null;
    }

    @Override
    public Class<? extends Boolean> getType() {
        return null;
    }
}
