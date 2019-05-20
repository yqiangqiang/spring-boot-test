package com.yqq.service.impl;

import com.yqq.entity.DeptInfoEntity;
import com.yqq.repository.DeptInfoRepo;
import com.yqq.service.DeptInfoService;
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
