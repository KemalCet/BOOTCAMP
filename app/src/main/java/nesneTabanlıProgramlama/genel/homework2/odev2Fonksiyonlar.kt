package `nesne tabanlı programlama`.genel.homework2

class odev2Fonksiyonlar {


    fun derecedenFahrenhite(derece:Int): Double{

        val fahrenhiet = 1.8 * derece + 32
        return fahrenhiet

    }
    fun cevreHesaplama(x1:Int,x2:Int) {

        val cevre = 2 * (x1 + x2)
        println(cevre)
    }
    fun faktoriyel(sayi:Int): Int {
        var y = 1
        for (i in 1..sayi) {
            y = y * i

        }
        return y
    }

    fun aciBulma(kenarSayisi:Int):Int{
        val aciToplam = (kenarSayisi - 2) * 180
        return aciToplam
    }
    fun maasHesap(gunSayisi:Int):Int{
        var maas = 0
        if (gunSayisi in 1 ..28){

            if (gunSayisi <= 20){
                 maas = gunSayisi * 80

            }else if (gunSayisi > 20){
                 maas = 1600 + (gunSayisi - 20) * 160

            }

        }else{
            println("Bir ay 28 gün olarak belirlenmiştir.")
        }
        return maas
    }
    fun kotaUcreti(gbMiktari:Int): Int {
        var kotaUcret = 0

        if (gbMiktari in 1.. 50 ){
            kotaUcret = 2 * gbMiktari
        }else if (gbMiktari > 50){
            kotaUcret = 100 + (gbMiktari-50) * 4
        }else{
            println("negatif değer giremezsiniz...")
        }

        return  kotaUcret
    }

    fun kacTaneA(kelime : String):Int{
        var kacTane = 0
        for (i in kelime){
            if (i == 'a' || i == 'A'){
                kacTane += 1
            }

        }
        return kacTane
        }
    }

