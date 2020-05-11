package com.example.sandbox.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serverid;
    private String servername;

    @ManyToOne
    private System system;

    public Long getServerId() {
        return serverid;
    }

    public void setServerid(Long serverid) {
        this.serverid = serverid;
    }

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    @Override
    public String toString() {
        return "Server [serverid=" + serverid + ", servername=" + servername + ", system="
                + ((system != null) ? system.getSystemid() : null) + "]";
    }

}