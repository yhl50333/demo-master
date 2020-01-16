package com.example.entity;

import java.io.Serializable;
import java.util.List;

public class PageUtil implements Serializable {
    public static PageObject newInstance(Integer pageCurrent, int rowCount, int pageSize, List recordes){
      PageObject po=  new PageObject<>();
      po.setPageCurrent(pageCurrent);
      po.setPageSize(pageSize);
      po.setRecords(recordes);
      po.setRowCount(rowCount);
        int pageCount=(rowCount-1)/pageSize+1;
        po.setPageCount(pageCount);
        return po;

    }
}
