package com.yqq.controler;

import com.yqq.entity.UserInfoEntity;
import com.yqq.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<UserInfoEntity> findAll() {

        return userInfoService.findAll();
    }


}
