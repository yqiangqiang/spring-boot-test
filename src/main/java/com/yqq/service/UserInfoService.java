package com.yqq.service;

import com.querydsl.core.types.Predicate;
import com.yqq.entity.DeptInfoEntity;
import com.yqq.entity.UserInfoEntity;
import com.yqq.querydsl.ConditionBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static com.yqq.entity.QUserInfoEntity.userInfoEntity;

public interface UserInfoService {

    public List<UserInfoEntity> findAll();

    public Page<UserInfoEntity> findAll(Condition condition, Pageable pageable);

    class Condition{
        private Long id;

        private Long deptId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getDeptId() {
            return deptId;
        }

        public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Predicate topPredicate() {
            ConditionBuilder builder = ConditionBuilder.create();
            builder.and(id,userInfoEntity.id::eq);
            builder.and(deptId,userInfoEntity.deptInfo.id::eq);
            return builder;
        }
    }

}
