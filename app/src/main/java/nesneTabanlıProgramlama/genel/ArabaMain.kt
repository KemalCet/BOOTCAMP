package `nesne tabanlı programlama`.genel

fun main(){
    //nesne oluşturma
    val bmw = Araba( "kırmızı",  0, false)//constracter class a bilgi aktarma ve bir classtan nessne olusturduk demek
    //okuma işlemi
    bmw.bilgiAl()

    //veri atama
    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(14)
    bmw.bilgiAl()

    val sahin = Araba("beyaz", 1000, true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(12)
    sahin.bilgiAl()

}