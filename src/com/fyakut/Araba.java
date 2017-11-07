package com.fyakut;

public class Araba {
    private String adi;
    private int yili;
    private String renk;
    private boolean vitesTipi;

    public Araba() {//default constructor
        //
    }

    public String getAdi(String adi) {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYili() {
        return yili;
    }

    public void setYili(int yili) {
        this.yili = yili;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(boolean vitesTipi) {
        this.vitesTipi = vitesTipi;
    }}


