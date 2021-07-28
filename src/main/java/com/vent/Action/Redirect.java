package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Redirect extends ActionSupport implements SessionAware {
    private int idArt = -1;
    private Map<String, Object> session;

    public int getIdArt() {
        return idArt;
    }

    public void setIdArt(int idArt) {
        this.idArt = idArt;
    }

    @Override
    public String execute() throws Exception {
        if (this.session.containsKey("isConnect")) return "home";
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
