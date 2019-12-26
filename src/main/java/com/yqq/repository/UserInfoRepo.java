package com.yqq.repository;

import com.yqq.entity.DeptInfoEntity;
import com.yqq.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserInfoRepo extends BaseJpaRepo<UserInfoEntity,Long> {

//    @Query
//    List<UserInfoEntity> findDistinctByDeptInfo();

}
