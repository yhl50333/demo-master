package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
public class PageObject<T> implements Serializable {
    private List<T> records;
    private Integer rowCount=0;
    private Integer pageCurrent=1;
    private Integer pageSize=3;
    private Integer pageCount=0;
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }
}
