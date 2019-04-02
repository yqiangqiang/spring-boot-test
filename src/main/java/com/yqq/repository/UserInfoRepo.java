package com.yqq.repository;

import com.yqq.entity.DeptInfoEntity;
import com.yqq.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserInfoRepo extends BaseJpaRepo<UserInfoEntity,Long> {

//    List<UserInfoEntity> findDistinctByDeptInfo();

}
