package com.fyakut;

public class Main {

    public static void main(String[] args) {
        Araba bm=new Araba();//araba sınıfından nesne tanımlanıp burdan Araba sınıfından veriler çekilir.
       // bm.yili();hata verecektir yili bilgisi gelmesi için veri tipinin ya public ya da set/get metotları eklenmelidir
       bm.setAdi("bmv");
       bm.setRenk("sari");
        System.out.println(bm.getRenk());

        Dikdortgen dk=new Dikdortgen();// dk adında bellkte yeni bir alan ayırıp burda dıkdörtgene ait bilgiler barındırmakta
        dk.setKenar1(5);
        dk.setKenar2(20);

        System.out.println(dk.alanhesapla());

        Dikdortgen d1=new Dikdortgen(5,9);
        System.out.println(d1.alanhesapla());

        StaticFinal cember=new StaticFinal();


        StaticFinal cember1=new StaticFinal();
        System.out.println("oluşturulan cember sayısı:"+StaticFinal.getOlustnCemberSayisi());
cember1.getOlustnCemberSayisi();//nesne üzerinden ulaşım

        StaticFinal cemberHesap=new StaticFinal();
        cemberHesap.setYaricap(4);
        System.out.println("alan:"+cemberHesap.alanHesapla());
        System.out.println("cevre:"+cemberHesap.cevreHesapla());
    }
}
