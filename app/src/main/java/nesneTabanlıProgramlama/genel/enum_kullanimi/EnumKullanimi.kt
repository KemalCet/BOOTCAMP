package `nesne tabanlı programlama`.genel.enum_kullanimi

fun main(){
    ucretHesapla(100,KonserveBoyut.ORTA)

}

fun ucretHesapla(adet:Int,boyut:KonserveBoyut){

    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam maaliyet : ${30 * adet} ₺")
        KonserveBoyut.ORTA -> println("Toplam maaliyet : ${80 * adet} ₺")
        KonserveBoyut.BUYUK -> println("Toplam maaliyet : ${140 * adet} ₺")

    }
}