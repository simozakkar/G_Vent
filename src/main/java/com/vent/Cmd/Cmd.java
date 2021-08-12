package com.vent.Cmd;

import com.vent.Article.Article;
import com.vent.User.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "Commands")
public class Cmd {

    @Id
    private String codeCmd;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codeArt")
    private Article article;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codeClient")
    private User client;

    private int qteCmd;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCmd;

    // for Liv
    private String fullname;
    private String address;
    private String phone;
    private String city;
    private String state;
    private String zip;
    private String country;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public String getCodeCmd() {
        return codeCmd;
    }

    public void setCodeCmd(String codeCmd) {
        this.codeCmd = codeCmd;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public Cmd() {}

    public Cmd(String codeCmd, Article article, User client, int qteCmd, Date dateCmd, String fullname, String address, String phone, String city, String state, String zip, String country) {
        this.codeCmd = codeCmd;
        this.article = article;
        this.client = client;
        this.qteCmd = qteCmd;
        this.dateCmd = dateCmd;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
}
