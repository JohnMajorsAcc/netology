package com.company.task43webinar;

import java.util.Objects;

public class Storage {
    private final String name;
    private String address;

    public Storage(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(name, storage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
