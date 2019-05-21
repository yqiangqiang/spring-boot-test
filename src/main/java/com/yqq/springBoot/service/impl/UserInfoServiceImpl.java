package com.yqq.springBoot.service.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.yqq.springBoot.entity.DeptInfoEntity;
import com.yqq.springBoot.entity.QDeptInfoEntity;
import com.yqq.springBoot.entity.QUserInfoEntity;
import com.yqq.springBoot.entity.UserInfoEntity;
import com.yqq.springBoot.repository.UserInfoRepo;
import com.yqq.springBoot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@SuppressWarnings("JpaQlInspection")
@SuppressWarnings("ALL")
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    UserInfoRepo userInfoRepo;

    @Override
    public List<UserInfoEntity> findAll() {
        List<UserInfoEntity> queryResult = userInfoRepo.findAll();
        return queryResult;
    }

    @Override
    public Page<UserInfoEntity> findAll(Condition condition, Pageable pageable) {
//        List<UserInfoEntity> userInfoEntityList = userInfoRepo.findAll();
        Page<UserInfoEntity> queryResult = userInfoRepo.findAll(condition.topPredicate(),pageable);
        return queryResult;

    }

    public void testQuery() {
//        List l =  em.createQuery("select deptInfo from UserInfoEntity u left join deptInfo ").getResultList();

        QUserInfoEntity userInfoEntity = QUserInfoEntity.userInfoEntity;
        QDeptInfoEntity deptInfoEntity = QDeptInfoEntity.deptInfoEntity;

        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(em);
//        List l = jpaQueryFactory.select(deptInfoEntity).from(deptInfoEntity)
//                .leftJoin(userInfoEntity)
//                .on(deptInfoEntity.id.eq(userInfoEntity.deptInfo.id)).distinct().fetch();

        List<DeptInfoEntity> l = jpaQueryFactory.select(userInfoEntity.deptInfo).distinct().from(userInfoEntity).fetch();



        System.out.println(l);
    }

}
