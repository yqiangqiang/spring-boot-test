package com.yqq.springBoot.querydsl;

import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Visitor;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.function.Function;

public class ConditionBuilder implements Predicate,Cloneable {

    private Predicate predicate;

    public static ConditionBuilder create() {
        return new ConditionBuilder();
    }

    public ConditionBuilder and(Predicate right) {
        if (right != null) {
            if (this.predicate == null) {
                this.predicate = right;
            }else {
                this.predicate = ExpressionUtils.and(this.predicate, right);
            }
        }
        return this;
    }

    public ConditionBuilder and(Optional<? extends Predicate> exp) {
        return exp == null && exp.isPresent() ? this.and(exp.get()) : this;
    }

    public <T> ConditionBuilder and(T val, Function<T,? extends Predicate> exp){
        return val == null ? this : this.and((Predicate)exp.apply(val));
    }

    @Override
    public Predicate not() {
        return null;
    }

    @Nullable
    @Override
    public <R, C> R accept(Visitor<R, C> visitor, @Nullable C c) {
        return this.predicate != null ? this.predicate.accept(visitor, c) : null;
    }

    @Override
    public Class<? extends Boolean> getType() {
        return Boolean.class;
    }
}
