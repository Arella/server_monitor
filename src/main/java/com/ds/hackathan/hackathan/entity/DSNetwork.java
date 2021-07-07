package com.ds.hackathan.hackathan.entity;

import javax.persistence.*;
import java.io.Serializable;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DSNetwork)) return false;
        DSNetwork dsNetwork = (DSNetwork) o;
        return getId() == dsNetwork.getId() && Objects.equals(getAddress(), dsNetwork.getAddress()) && Objects.equals(getNetwork(), dsNetwork.getNetwork());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAddress(), getNetwork());
    }
}
