package com.example.jxxy.zll.http.entity;

import java.io.Serializable;

public class HttpResult<T> implements Serializable {
    private int status;
    private String msg;
    private T data;
    public T getData() {
        return data;
    }
    public void setData(T Data) {this.data=data;}
    public String getMsg() {return msg;}
    public void setMsg(String msg) {this.msg=msg;}
    public int getStatus() {return status;}
    public void setStatus(int status) { this.status=status;}
    @Override
    public String toString() {
        return "HttpResult{"+
                "data="+data+
                ",status="+status+
                ",msg='"+msg+'\''+
                '}';
    }
}
