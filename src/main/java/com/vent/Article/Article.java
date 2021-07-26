package com.vent.Article;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Articles")
public class Article {
    @Id
    private int codeArt;

    private String nomArt;

    private String genderArt;

    private int prixArt;

    private String descArt;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return codeArt == article.codeArt &&
                prixArt == article.prixArt &&
                Objects.equals(nomArt, article.nomArt) &&
                Objects.equals(genderArt, article.genderArt) &&
                Objects.equals(descArt, article.descArt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeArt, nomArt, genderArt, prixArt, descArt);
    }
}
