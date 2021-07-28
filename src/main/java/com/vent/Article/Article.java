package com.vent.Article;

import com.vent.Cmd.Cmd;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Articles")
public class Article {
    @Id
    private int codeArt;

    private String nomArt;

    private String  categ;

    private String genderArt;

    private int prixArt;

    private String descArt;

    private String rating;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL )
    private List<Cmd> cmds;

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getCodeArt() {
        return codeArt;
    }

    public void setCodeArt(int codeArt) {
        this.codeArt = codeArt;
    }

    public String getNomArt() {
        return nomArt;
    }

    public void setNomArt(String nomArt) {
        this.nomArt = nomArt;
    }

    public String getGenderArt() {
        return genderArt;
    }

    public void setGenderArt(String genderArt) {
        this.genderArt = genderArt;
    }

    public int getPrixArt() {
        return prixArt;
    }

    public void setPrixArt(int prixArt) {
        this.prixArt = prixArt;
    }

    public String getDescArt() {
        return descArt;
    }

    public void setDescArt(String descArt) {
        this.descArt = descArt;
    }

    public int getStars(){
        return Integer.parseInt(String.valueOf(this.rating.charAt(0)));
    }
    public int getStarsHalfEmpty(){
        return Integer.parseInt(String.valueOf(this.rating.charAt(1)));
    }
    public int getStarsEmpty(){
        return Integer.parseInt(String.valueOf(this.rating.charAt(2)));
    }

    public List<Cmd> getCmds() {
        return cmds;
    }

    public void setCmds(List<Cmd> cmds) {
        this.cmds = cmds;
    }
}
