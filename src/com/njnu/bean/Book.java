package com.njnu.bean;

import java.io.Serializable;

/**
 * category 1-n book
 * class属性中包含class
 */
public class Book implements Serializable {
    private Integer id;
    private String bookName;
    private String auth;
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBoonName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
