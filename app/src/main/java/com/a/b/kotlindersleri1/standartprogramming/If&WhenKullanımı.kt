package com.a.b.kotlindersleri1.standartprogramming

fun main(){
    val  yas = 19
    val isim = "Ahmet"

    if ( yas >= 18){
        println("reşitsiniz")
    }else{
         println("reşit değilsiniz")
    }
    if(isim == "ahmet"){
        println("merhaba ahmet " )
    }else{
         println("tanınmayan kişi")
        }
    val ka = "admin"
    val s = 12345

    if (ka == "admin" && s == 123456) {
        println("hatalı giriş")

    }

    //switch - when

    val gun = 4

    when (gun){

        1 -> println("pazartesi")
        2 -> println("salı")
        3 -> println("çarş")
        4 -> println("perş")
        5 -> println("cuma")
        6 -> println("cumartesi")

        else -> println("böyle bir gün yok ") //default
    }
}