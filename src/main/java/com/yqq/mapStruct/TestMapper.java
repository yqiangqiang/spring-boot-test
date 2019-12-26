package com.yqq.mapStruct;

import com.yqq.dto.UserDTO;
import com.yqq.entity.Dept;
import com.yqq.entity.User;

//@Mapper(uses = DateMapper.class)
public interface TestMapper {

//    @Mappings({
//            @Mapping(source = "userName", target = "userName"),
//            @Mapping(source = "userId", target = "userId"),
//            @Mapping(source = "date",target = "date")
//    })
    UserDTO userToUserDTO(User user);


    default Dept dept(Dept dept) {
        dept.setDeptName("aaa");
        return dept;

    }



}
