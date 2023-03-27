package `nesne tabanlı programlama`.genel

class Fonksiyonlar {
    //void (geri dönüş değeri olmayan)
    fun selamla(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return geri dönüş şeklinde olan

    fun selamla2() : String{ // bu fonksiyon string bir deger verecek iletecek aktaracak anlamında
        val sonuc = "Merhaba Ahmet"
        return sonuc // sonuc Un string deger olması gerekir.
    }

    //parametre (dışarıdan değer alabiliriz )
    fun selamla3(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1:Int,sayi2:Int) : Int{

        val toplam = sayi1 + sayi2
        return toplam
    }

    //overloading bir fonksiyonu aynı isimde kullanılması cok sayıda aynı ismi tekrar kullanmak istediğinde yapacaksın
    fun carp(sayi1: Int,sayi2: Int){
        println("Çarpma = ${sayi1*sayi2}")
    }

    fun carp(sayi1: Double,sayi2: Double){
        println("Çarpma = ${sayi1*sayi2}")
    }
    fun carp(sayi1: Int,sayi2: Int,isim: String){// çok kullanımla farklı obsiyonlar değerler ekelyerek file dosyasından istediğin fonk işlemini seçebilirsin
        println("Çarpma = ${sayi1*sayi2} - işlem yapan = $isim")
    }
}