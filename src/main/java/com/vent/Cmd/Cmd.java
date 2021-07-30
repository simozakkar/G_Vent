package com.vent.Cmd;

import com.vent.Article.Article;
import com.vent.User.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "Commandes")
public class Cmd {

    @Id
    private int codeCmd;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codeArt")
    private Article article;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codeClient")
    private User client;

    private int qteCmd;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCmd;

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

    public int getCodeCmd() {
        return codeCmd;
    }

    public void setCodeCmd(int codeCmd) {
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
}
