package com.yqq.springBoot.repository;

import com.yqq.springBoot.entity.UserInfoEntity;


public interface UserInfoRepo extends BaseJpaRepo<UserInfoEntity,Long> {

//    @Query
//    List<UserInfoEntity> findDistinctByDeptInfo();

}
