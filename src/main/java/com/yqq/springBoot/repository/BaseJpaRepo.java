package com.yqq.springBoot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseJpaRepo<T,PK extends Serializable> extends BaseQueryRepo<T> , JpaRepository<T,PK> {
}
