package com.njnu.bean;

import java.io.Serializable;

/**
 * 图书分类 实体类
 * @author lmy
 * @version 1.0.0
 */
public class Category implements Serializable {
    private Integer id;
    private String category;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
