package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

fun main() {
    val deneme = Odev2()
    //Hazır verdiğimiz değerler için hangi sonuçları alıyoruz test etme aşaması.
    println("25 Derece kac Fahrenheit? " + deneme.soru1(25.0)) //double olarak değer alıyoruz ve double olarak veriyoruz

    println("5.3 ve 9.6 kenarli dikdortgenin cevresi: " + deneme.soru2(5.3, 9.6)) //VİRGÜLLÜ UZUNLUKLARDA ÇEVRE HESAPLAMA

    println("5 faktoriyel: " + deneme.soru3(5))

    println("'Karakalem' kelimesinde kac tane 'a' harfi vardir? " + deneme.soru4("Karakalem"))
}