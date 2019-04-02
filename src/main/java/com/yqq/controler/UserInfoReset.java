package com.yqq.controler;

import com.yqq.entity.DeptInfoEntity;
import com.yqq.entity.UserInfoEntity;
import com.yqq.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse("2019-03-27 12:28:54");
            condition.setUpdateTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        condition.setId(2L);
//        condition.setDeptId(4L);
        Pageable pageable = new PageRequest(0, 3, Sort.Direction.DESC, "id");
        return userInfoService.findAll(condition,pageable);
    }

    @RequestMapping(value = "findDistinct")
    public void findDistinct(){
        userInfoService.testQuery();
    }

}
