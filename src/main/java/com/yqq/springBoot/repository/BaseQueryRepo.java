package com.yqq.springBoot.repository;

import com.querydsl.core.types.Predicate;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseQueryRepo<T> extends QueryDslPredicateExecutor<T> {

    List<T> findAll(Predicate predicate);

}
