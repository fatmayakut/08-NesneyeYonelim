package com.fyakut;


import org.jetbrains.annotations.Contract;

/**
 *çemberin alanı ve çevresiü
 * çevre 2pi r
 * alan pi*r*r
 */
public class StaticFinal {

private final double pi=3.14d;//final olarak atanan değer değişmeyen her zaman aynı değer olan veridir.
    private double yaricap;
    private static int olustnCemberSayisi;

    public StaticFinal() {// bellkte cember olusturur
        olustnCemberSayisi++;
    }


    @Contract(pure = true)
    public static int getOlustnCemberSayisi() {//static metotlara nesne oluşturulmadan da ulaşılabilir.
        return olustnCemberSayisi;
    }

    public static void setOlustnCemberSayisi(int olustnCemberSayisi) {
        StaticFinal.olustnCemberSayisi = olustnCemberSayisi;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if(yaricap>=1)
        this.yaricap = yaricap;
        else
            this.yaricap=1;
    } public double cevreHesapla(){
        return 2*pi*yaricap;
    }
    public double alanHesapla(){
        return pi*yaricap*yaricap;
    }
}
