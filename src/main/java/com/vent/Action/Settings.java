package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.vent.User.DataUser;
import com.vent.User.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Settings extends ActionSupport implements SessionAware {
    private String change;
    private String oldPassword;
    private String newPassword;
    private String newName;

    private Map<String, Object> session;

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public String execute() throws Exception {
        if(this.oldPassword != null) {
            if (this.newPassword != null){
                User user = (User) this.session.get("user");
                user = DataUser.getUser(user.getUsername(), this.oldPassword);
                if (user != null){
                    user.setPsw(this.newPassword);
                    DataUser.updateUser(user);
                    this.session.put("user", user);
                    return SUCCESS;
                }
            }else if(this.newName != null){
                User user = (User) this.session.get("user");
                user = DataUser.getUser(user.getUsername(), this.oldPassword);
                if (user != null){
                    user.setName(this.newName);
                    DataUser.updateUser(user);
                    this.session.put("user", user);
                    return SUCCESS;
                }
            }
            return ERROR;
        }
        return ERROR;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
