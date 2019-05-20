package com.yqq.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.yqq.enums.StatusEnum;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dept_info")
public class DeptInfoEntity extends BaseEntiy{

    @Column(name = "parent_id")
    private long parentId;

    @Column(name = "dept_name")
    private String deptName;


//    @Column(name = "id")
    @OneToMany(mappedBy = "deptInfo")
    private List<UserInfoEntity> userInfo;

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<UserInfoEntity> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfoEntity> userInfo) {
        this.userInfo = userInfo;
    }
}
