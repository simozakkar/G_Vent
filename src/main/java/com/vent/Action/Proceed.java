package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.vent.Article.Article;
import com.vent.Article.DataArticle;
import com.vent.Cmd.Cmd;
import com.vent.Cmd.DataCmd;
import com.vent.Stock.DataStock;
import com.vent.User.DataUser;
import com.vent.User.User;
import org.apache.struts2.interceptor.SessionAware;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

public class Proceed extends ActionSupport implements SessionAware {
    private String idCmd;
    private Map<String, Object> session;

    private int idArt;
    private Article article;
    private int qte = 0;
    private String fullname;
    private String address;
    private String phone;
    private String city;
    private String state;
    private String zip;
    private String country;

    public String getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(String idCmd) {
        this.idCmd = idCmd;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

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

    public int getIdArt() {
        return idArt;
    }

    public void setIdArt(int idArt) {
        this.idArt = idArt;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String execute() throws Exception {
        // return error if there is empty fields
        if (this.fullname.equals("") || this.address.equals("") || this.phone.equals("") || this.city.equals("") || this.state.equals("")  || this.zip.equals("") || this.country.equals("") || this.qte == 0) return ERROR;

        this.article = DataArticle.getArticle(this.idArt);
        User user = (User) this.session.get("user");
        user = DataUser.getUser(user.getUsername(), user.getPsw());
        // check if the quantity of product is fine
        if (this.article == null  || user == null) return ERROR;
        if(!DataStock.sustractionQte(this.idArt, this.qte)) return ERROR;
        // insert thd CMD
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        System.out.println(formatter.format(date));
        Date date = new Date();
        this.idCmd = String.valueOf(this.idArt)+System.currentTimeMillis();
        DataCmd.insertCmd(new Cmd(this.idCmd, this.article, user, this.qte, date, this.fullname, this.address, this.phone, this.city, this.state, this.zip, this.country));
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    @Override
    public String toString() {
        return "Proceed{" +
                "idArt=" + idArt +
                ", article=" + article +
                ", qte=" + qte +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", country='" + country + '\'' +
                '}';
    }
}
