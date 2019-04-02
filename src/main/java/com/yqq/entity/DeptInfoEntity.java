package com.yqq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "dept_info")
public class DeptInfoEntity extends BaseEntiy{

    @Column(name = "parent_id")
    private long parentId;

    @Column(name = "dept_name")
    private String deptName;

//    @Column(name = "id")
//    @OneToMany(mappedBy = "id")
//    private List<UserInfoEntity> userInfo;

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


}
