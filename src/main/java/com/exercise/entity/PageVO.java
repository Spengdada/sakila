package com.exercise.entity;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/23下午6:41
*/
public class PageVO<T> {
    private List<T> list; // 当前页的数据
    private long total;    // 总记录数

    // 构造函数
    public PageVO() {}

    public PageVO(List<T> list, long total) {
        this.list = list;
        this.total = total;
    }

    // Getter 和 Setter 方法
    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}


