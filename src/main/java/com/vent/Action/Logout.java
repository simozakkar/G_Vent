package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Logout extends ActionSupport implements SessionAware {

    private Map<String, Object> session;

    @Override
    public String execute() throws Exception {
        this.session.clear();
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
