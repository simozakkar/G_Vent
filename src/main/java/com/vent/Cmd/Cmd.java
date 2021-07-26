package com.vent.Cmd;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "Commandes")
public class Cmd {

    @Id
    private int codeCmd;

    private int codeArt;

    private int codeClient;

    private int qteCmd;

    private LocalDate dateCmd;

    public int getCodeCmd() {
        return codeCmd;
    }

    public void setCodeCmd(int codeCmd) {
        this.codeCmd = codeCmd;
    }

    public int getCodeArt() {
        return codeArt;
    }

    public void setCodeArt(int codeArt) {
        this.codeArt = codeArt;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    public LocalDate getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(LocalDate dateCmd) {
        this.dateCmd = dateCmd;
    }
}
