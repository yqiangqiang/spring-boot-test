package com.yqq.springBoot.service;

import com.querydsl.core.types.Predicate;
import com.yqq.springBoot.entity.DeptInfoEntity;
import com.yqq.springBoot.querydsl.ConditionBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import static com.yqq.springBoot.entity.QDeptInfoEntity.deptInfoEntity;

public interface DeptInfoService {

    public Page<DeptInfoEntity> findAll(Condition condition, Pageable pageable);


    class Condition{
        private Long id;

        private String userName;

        public Predicate topPredicate() {
            ConditionBuilder builder = ConditionBuilder.create();
            builder.and(id, deptInfoEntity.id::eq);
            if (userName != null && userName != "") {
                builder.and(deptInfoEntity.userInfo.any().userName.like("%"+userName+"%"));
            }
            return builder;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

}
