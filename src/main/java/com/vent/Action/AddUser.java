package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.vent.User.DataUser;
import com.vent.User.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class AddUser extends ActionSupport implements SessionAware {

    private String name;

    private String username;

    private String psw;

    private boolean exist;
    private Map<String, Object> session;

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String execute() throws Exception {
        if (this.username.equals("") || this.name.equals("") || this.psw.equals("")) return ERROR;
        if (DataUser.isExistUser(this.username)){
            this.exist = true;
            return ERROR;
        }
        User user = new User(this.name, this.username, this.psw);
        DataUser.insertUser(user);
        this.session.put("isConnect", true);
        this.session.put("user", user);
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
