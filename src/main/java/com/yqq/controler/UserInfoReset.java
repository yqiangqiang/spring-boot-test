package com.yqq.controler;

import com.yqq.entity.UserInfoEntity;
import com.yqq.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "userInfo/")
public class UserInfoReset {

    @Autowired
    UserInfoService userInfoService;
//
//
    public UserInfoReset() {
        System.out.println("controler 被加载。。。。。。。。。。。。。");
    }

    @RequestMapping(value = "t")
    public String test() {
        return "hello word!!!";
    }


    @RequestMapping(value = "findAll")
    public Page <UserInfoEntity> findAll() {
        UserInfoService.Condition condition = new UserInfoService.Condition();
//        condition.setId(2L);
        condition.setDeptId(4L);
        Pageable pageable = new PageRequest(0, 3, Sort.Direction.DESC, "id");
        return userInfoService.findAll(condition,pageable);
    }


}
