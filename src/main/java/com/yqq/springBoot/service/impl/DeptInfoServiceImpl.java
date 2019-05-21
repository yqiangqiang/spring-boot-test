package com.yqq.springBoot.service.impl;

import com.yqq.springBoot.entity.DeptInfoEntity;
import com.yqq.springBoot.repository.DeptInfoRepo;
import com.yqq.springBoot.service.DeptInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DeptInfoServiceImpl implements DeptInfoService {

    @Autowired
    DeptInfoRepo repo;

    @Override
    public Page<DeptInfoEntity> findAll(Condition condition, Pageable pageable) {
        return repo.findAll(condition.topPredicate(), pageable);
    }
}
