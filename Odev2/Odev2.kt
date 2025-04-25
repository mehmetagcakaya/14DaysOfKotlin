package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

class Odev2 {
    //dereceden fahrenhiet'a dönüştürme sorusu
    fun soru1(derece: Double): Double {
        return derece * 1.8 + 32
    }
    //dikdörtgen çevresi hesaplama sorusu
    fun soru2(kisa_Kenar: Double, uzun_Kenar: Double): Double {
        return 2 * (kisa_Kenar + uzun_Kenar)
    }
    //faktöriyel sorusu
    fun soru3(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }
    //içinde kaç tane bu harften var soru tipi
    fun soru4(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }
    //iç açılar toplamı hesaplama sorusu
    fun soru5(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }
    //maaş hesaplama sorusu
    fun soru6(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        val normalSaat = if (toplamSaat > 160) 160 else toplamSaat
        val mesaiSaat = if (toplamSaat > 160) toplamSaat - 160 else 0
        return (normalSaat * 10) + (mesaiSaat * 20)
    }
    //kota miktarına göre ücret döndürme sorusu
    fun soru7(kullanimGb: Int): Int {
        return if (kullanimGb <= 50) 100
        else 100 + ((kullanimGb - 50) * 4)
    }
}