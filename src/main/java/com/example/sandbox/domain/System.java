package com.example.sandbox.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class System {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemid;
    private String systemname;
    private String department;

    @OneToMany(mappedBy = "system")
    private List<Server> servers;

    public Long getSystemid() {
        return systemid;
    }

    public void setSystemid(Long systemid) {
        this.systemid = systemid;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemid(String systemname) {
        this.systemname = systemname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    @Override
    public String toString() {
        return "SystemEntity [systemid=" + systemid + ", systemname=" + systemname + ", department=" + department
                + ", servers=" + servers + "]";
    }

}