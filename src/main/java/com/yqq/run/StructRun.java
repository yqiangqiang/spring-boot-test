package com.yqq.run;

//import com.alibaba.fastjson.JSONObject;

import com.yqq.entity.Dept;
import com.yqq.entity.User;

import java.util.Date;

public class StructRun {

    public static void main(String[] args) {

//         TestMapper testMapper = Mappers.getMapper(TestMapper.class);

        User user = new User();
        user.setUserId("1111");
        user.setUserName("bbb");
        user.setDate(new Date());

        Dept dept = new Dept();
        dept.setDeptName("dept");
        user.setDept(dept);

//        UserDTO userDTO = testMapper.userToUserDTO(user);


//        System.out.println(JSONObject.toJSONString(userDTO));




    }

}
