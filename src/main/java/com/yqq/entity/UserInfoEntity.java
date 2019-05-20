package com.yqq.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yqq.enums.StatusEnum;
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

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "deptId")//注释本表中指向另一个表的外键。
    private DeptInfoEntity deptInfo;

    @Column(name = "status")
//    @Convert(converter = StatusEnumConvert.class)
    @Type(type = "com.yqq.enums.DbEnumType")
    private StatusEnum status;

    public String getAddColumn() {
        return userName + " ------这个是一个拓展的列";
    }

    public void setAddColumn(String addColumn) {
        this.addColumn = addColumn;
    }

    @Transient
    private String addColumn;

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

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
