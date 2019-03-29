package com.yqq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dept_info")
public class DeptInfoEntity extends BaseEntiy{

    @Column(name = "parent_id")
    private long parentId;

    @Column(name = "dept_name")
    private String deptName;

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
