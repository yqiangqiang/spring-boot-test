package com.yqq.jdk8.function;

@FunctionalInterface
public interface Convert<T,V> {

    public T convert(V v);

}
