package com.fyakut;

public class Dikdortgen {
    private int kenar1;
    private int kenar2;

    public Dikdortgen() {

    }

    public Dikdortgen(int kenar1, int kenar2) {// nesne oluşturulduğunda parametre tipleri bundan olsun
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    public int alanhesapla() {
        return kenar1*kenar2;

    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }
}
