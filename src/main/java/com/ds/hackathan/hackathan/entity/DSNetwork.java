package com.ds.hackathan.hackathan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

@Entity
public class DSNetwork implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "address")
    private String address;

    @Column(name = "network")
    private String network;

    @Column(name = "admin_name")
    private String admin_name;

    @Column(name = "admin_mail")
    private String admin_mail;

    @Column(name = "status")
    private String status;

    @Column(name = "server_ram")
    private String server_ram;

    @Column(name = "server_storage")
    private String server_storage;

    @Column(name = "server_cpu_cores")
    private String server_cpu_cores;

    @Column(name = "last_updated_timestamp")
    private String last_updated_timestamp;

    @Column(name = "date_created_timestamp")
    private String date_created_timestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_mail() {
        return admin_mail;
    }

    public void setAdmin_mail(String admin_mail) {
        this.admin_mail = admin_mail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServer_ram() {
        return server_ram;
    }

    public void setServer_ram(String server_ram) {
        this.server_ram = server_ram;
    }

    public String getServer_storage() {
        return server_storage;
    }

    public void setServer_storage(String server_storage) {
        this.server_storage = server_storage;
    }

    public String getServer_cpu_cores() {
        return server_cpu_cores;
    }

    public void setServer_cpu_cores(String server_cpu_cores) {
        this.server_cpu_cores = server_cpu_cores;
    }

    public String getLast_updated_timestamp() {
        return last_updated_timestamp;
    }

    public void setLast_updated_timestamp(String last_updated_timestamp) {
        this.last_updated_timestamp = last_updated_timestamp;
    }

    public String getDate_created_timestamp() {
        return date_created_timestamp;
    }

    public void setDate_created_timestamp(String date_created_timestamp) {
        this.date_created_timestamp = date_created_timestamp;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DSNetwork dsNetwork = (DSNetwork) o;
        return id == dsNetwork.id && Objects.equals(address, dsNetwork.address) && Objects.equals(network, dsNetwork.network) && Objects.equals(admin_name, dsNetwork.admin_name) && Objects.equals(admin_mail, dsNetwork.admin_mail) && Objects.equals(status, dsNetwork.status) && Objects.equals(server_ram, dsNetwork.server_ram) && Objects.equals(server_storage, dsNetwork.server_storage) && Objects.equals(server_cpu_cores, dsNetwork.server_cpu_cores) && Objects.equals(last_updated_timestamp, dsNetwork.last_updated_timestamp) && Objects.equals(date_created_timestamp, dsNetwork.date_created_timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, network, admin_name, admin_mail, status, server_ram, server_storage, server_cpu_cores, last_updated_timestamp, date_created_timestamp);
    }
}
