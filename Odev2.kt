package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

class Odev2 {
    fun soru1(derece: Double): Double {
        return derece * 1.8 + 32
    }
    fun soru2(kisa_Kenar: Double, uzun_Kenar: Double): Double {
        return 2 * (kisa_Kenar + uzun_Kenar)
    }
    fun soru3(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }
    fun soru4(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }
}