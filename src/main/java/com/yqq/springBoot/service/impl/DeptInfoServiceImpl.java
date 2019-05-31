package com.yqq.springBoot.service.impl;

import com.yqq.springBoot.entity.DeptInfoEntity;
import com.yqq.springBoot.entity.UserInfoEntity;
import com.yqq.springBoot.repository.DeptInfoRepo;
import com.yqq.springBoot.service.DeptInfoService;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptInfoServiceImpl implements DeptInfoService {

    @Autowired
    DeptInfoRepo repo;

    @Override
    public Page<DeptInfoEntity> findAll(Condition condition, Pageable pageable) {

        DeptInfoEntity deptInfoEntity = repo.findOne(2L);
        List<UserInfoEntity> userInfoEntityList = deptInfoEntity.getUserInfo();

        System.out.println("userInfo:"+userInfoEntityList.get(0).getClass());
        System.out.println("userInfo:"+userInfoEntityList.get(0).getUserName());
        System.out.println("getClass:"+deptInfoEntity.getClass());
        System.out.println("apoUtils:"+AopUtils.getTargetClass(deptInfoEntity));


        return repo.findAll(condition.topPredicate(), pageable);
    }
}
