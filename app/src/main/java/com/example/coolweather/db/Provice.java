package com.example.coolweather.db;

public class Provice {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {

        this.provinceName = provinceName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getProvinceCode() {

        return provinceCode;
    }

    public String getProvinceName() {

        return provinceName;
    }
}
