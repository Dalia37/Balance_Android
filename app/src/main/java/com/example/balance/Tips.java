package com.example.balance;

public class Tips {
    private int img;
    private String name;
    private String des;

    public Tips(int img, String name, String des) {
        this.img = img;
        this.name = name;
        this.des = des;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}


