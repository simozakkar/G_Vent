package com.vent.Stock;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit_stock")
public class Stock {
    @Id
    private int codeProd;

    private int qteProd;

    private String nomProd;

    private String typeProd;

    private String genderProd;

    private int prixProd;

    private String descrProd;

    public int getCodeProd() {
        return codeProd;
    }

    public void setCodeProd(int codeProd) {
        this.codeProd = codeProd;
    }

    public int getQteProd() {
        return qteProd;
    }

    public void setQteProd(int qteProd) {
        this.qteProd = qteProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getTypeProd() {
        return typeProd;
    }

    public void setTypeProd(String typeProd) {
        this.typeProd = typeProd;
    }

    public String getGenderProd() {
        return genderProd;
    }

    public void setGenderProd(String genderProd) {
        this.genderProd = genderProd;
    }

    public int getPrixProd() {
        return prixProd;
    }

    public void setPrixProd(int prixProd) {
        this.prixProd = prixProd;
    }

    public String getDescProd() {
        return descrProd;
    }

    public void setDescProd(String descrProd) {
        this.descrProd = descrProd;
    }
}
