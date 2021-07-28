package com.vent.Action;


import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Payment extends Product implements SessionAware {


    private Map<String, Object> session;

    @Override
    public String execute() throws Exception {
        if(!this.session.containsKey("isConnect")){
            this.session.put("idArticle", this.getIdArt());
            return "login";
        }
        if(this.session.containsKey("idArticle")){
            this.setIdArt((int) this.session.get("idArticle"));
            this.session.remove("idArticle");
        }
        return super.execute();
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
