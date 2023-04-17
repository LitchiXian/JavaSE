package com.litchi.houserentdemo.domain;

public class House {
    // 编号   房主  电话  地址  月租  状态(未出租/已出租)
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String status;

    public House(int id, String name, String phone, String address, int rent, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.status = status;

    }

    public House() {
    }

    public House(String name, String phone, String address, int rent, String status) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "\t\t" + name + "\t" + phone +
                "\t\t" + address + "\t" + rent + "\t" + status;
    }
}
