package com.yqq.springBoot.service;

import com.querydsl.core.types.Predicate;
import com.yqq.springBoot.entity.UserInfoEntity;
import com.yqq.springBoot.querydsl.ConditionBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

import static com.yqq.springBoot.entity.QUserInfoEntity.userInfoEntity;

public interface UserInfoService {

    public List<UserInfoEntity> findAll();

    public Page<UserInfoEntity> findAll(Condition condition, Pageable pageable);


    public void testQuery();

    class Condition{
        private Long id;

        private Long deptId;

        private Date updateTime;

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

        public Date getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        public Predicate topPredicate() {
            ConditionBuilder builder = ConditionBuilder.create();
            builder.and(id,userInfoEntity.id::eq);
            builder.and(deptId,userInfoEntity.deptInfo.id::eq);
            if (updateTime != null) {
                Date endTime = new Date(updateTime.getTime() + 24 * 60 * 60*1000);
                builder.and(updateTime, userInfoEntity.updateTime::after);
                builder.and(endTime, userInfoEntity.updateTime::before);
            }
            return builder;
        }
    }

}
