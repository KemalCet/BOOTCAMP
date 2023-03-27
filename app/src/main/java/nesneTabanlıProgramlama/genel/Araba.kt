package `nesne tabanlı programlama`.genel

class Araba(var renk:String,var hiz:Int,var calisiyorMu:Boolean) { // ilk defa yapıyorsan var yazacaksın önceden tanıttıysan var yazmadan renk:String de kabul edilir
    init {//constructor classta nesne olusturdugumuzdan gelecek her nesne olusumunda çalısır.1 kere calısır
        println("Araba sınıfından nesne olusturuldu")
    }
    fun calistir(){//bu fonksiyon ile class in değerlerini değiştiriyorsak buna side effect (yan etki) denir.
        calisiyorMu = true
        hiz = 5

    }
    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){ // parametre girişi
        hiz = hiz + kacKm //kısası hiz+=kacKm
    }

    fun yavasla(kacKm:Int){
        hiz -= kacKm
    }


    fun bilgiAl(){
        println("------------------------------")
        println("Renk : ${renk}")
        println("Hız : ${hiz}")
        println("çalısıyor mu = ${calisiyorMu}")

    }
}