package `nesne tabanlı programlama`.genel.homework2

import kotlinx.coroutines.runInterruptible

fun main(){

    val x = odev2Fonksiyonlar()

    val havaSicakligiF = x.derecedenFahrenhite(1)
    println("hava sıcaklığı °F  = ${havaSicakligiF} ")

    val dikdörtgenCevresi = x.cevreHesaplama(12,5)

    val faktoriyell = x.faktoriyel(5)
    println(faktoriyell)


    val toplamAcı = x.aciBulma(4)
    println(toplamAcı)

    val maasim = x.maasHesap(28)
    println(maasim)

    val faturam = x.kotaUcreti(200)
    println(faturam)

    val kelimemiz = x.kacTaneA("aaaaAaya")
    println(kelimemiz)
}