package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

fun main() {
    val deneme = Odev2()
    //Hazır verdiğimiz değerler için hangi sonuçları alıyoruz test etme aşaması.
    println("25 Derece kac Fahrenheit? " + deneme.soru1(25.0)) //double olarak değer alıyoruz ve double olarak veriyoruz

    println("5.3 ve 9.6 kenarli dikdortgenin cevresi: " + deneme.soru2(5.3, 9.6)) //VİRGÜLLÜ UZUNLUKLARDA ÇEVRE HESAPLAMA

    println("5 faktoriyel: " + deneme.soru3(5))

    println("'Karakalem' kelimesinde kac tane 'a' harfi vardir? " + deneme.soru4("Karakalem"))

    // Soru 1: İç açı toplamı
    println("7 kenarli seklin ic acilari toplami: ${deneme.soru5(7)}")

    // Soru 2: Maaş Hesaplama sorusu  (20 günden x 8'er saat = 160 saat, mesaisiz şekilde)
    println("20 gun calisan mesaisiz maasi : ${deneme.soru6(20)} TL")

    // Soru 2: Maaş Hesaplama (22 gün x 8'er saat = 176 saat, 16 saat mesaili şekilde)
    println("22 gun calisan mesaili maasi : ${deneme.soru6(22)} TL")

    // Soru 3: Kota ücreti hesaplama sorusu (45 GB ve aşım yok)
    println("45 GB internet ucreti: ${deneme.soru7(45)} TL")

    // Soru 3: Kota ücreti hesaplama sorusu (60 GB ve 10 GB aşım)
    println("60 GB internet ucreti: ${deneme.soru7(60)} TL")
}