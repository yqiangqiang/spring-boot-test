package com.yqq.entity;

import com.yqq.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity //hibernate 注解，必须与@Id注解 结合使用。否则  No identifier specified for entity:
@Table(name="user_info") //spring @Table注解  作用是 ： 声明此对象映射到数据库的数据表，通过它可以为实体指定表(talbe)
public class UserInfoEntity extends BaseEntiy {


    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

//    @Column(name = "dept_id")
//    private long deptId;

    @OneToOne
    @JoinColumn(name = "deptId")//注释本表中指向另一个表的外键。
    private DeptInfoEntity deptInfo;

//    @Column(name = "status")
//    @Type(type = "com.yqq")
//    private StatusEnum status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DeptInfoEntity getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(DeptInfoEntity deptInfo) {
        this.deptInfo = deptInfo;
    }
}
