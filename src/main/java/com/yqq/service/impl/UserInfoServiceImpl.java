package com.yqq.service.impl;

import com.querydsl.core.types.ConstantImpl;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.Expressions;
import com.yqq.entity.UserInfoEntity;
import com.yqq.repository.UserInfoRepo;
import com.yqq.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepo userInfoRepo;

    @Override
    public List<UserInfoEntity> findAll() {
        List<UserInfoEntity> queryResult = userInfoRepo.findAll();

//        Long id = 1L;
//        Expression expression = (Expression) ConstantImpl.create(id);
//
//
//
//        Predicate predicate =
        return queryResult;
    }


}
