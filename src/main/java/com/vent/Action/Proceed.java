package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.vent.Article.Article;
import com.vent.Article.DataArticle;
import com.vent.Stock.DataStock;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Proceed extends ActionSupport implements SessionAware {

    private Map<String, Object> session;

    private int idArt;
    private Article article;
    private int quantity;
    private int qte;
    private String fullname;
    private String address;
    private String phone;
    private String city;
    private String state;
    private int zip;
    private String country;

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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        this.article = DataArticle.getArticle(this.idArt);
        this.quantity = DataStock.getQuntity(getIdArt());
        if (this.quantity == -1 ) return "articleNoMore";
        if (this.article != null ) return "articleNotFound";
        System.out.println(this.toString());
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
                ", quantity=" + quantity +
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
