package com.vent.User;

import com.vent.Cmd.Cmd;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Users")
public class User {

    @Id
    private int codeUser;

    private String username;

    private String psw;

    private String name;

    //mapping**************************************************
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL )
    private List<Cmd> cmds;

    public User() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }

    public List<Cmd> getCmds() {
        return cmds;
    }

    public void setCmds(List<Cmd> cmds) {
        this.cmds = cmds;
    }

    public User(String fullname, String userName, String userPsw) {
        this.name = fullname;
        this.username = userName;
        this.psw = userPsw;
    }
}