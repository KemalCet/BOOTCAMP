package com.a.b.kotlindersleri1.degiskenler

fun main() {

    var product_id:Int = 3416
    var product_name:String = "Macbook Pro"
    var product_number:Int = 100
    var product_maker = "apple"
    var product_price = 999
    println("product id : $product_id")
    println("product name : $product_name")
    println("product maker : $product_maker")
    println("product price: $product_price ₺ ")


    var a = 10
    var b = 20
    println("$a x $b = ${a*b}")

    // Constants
    // let (ios - swift , final -java)
    var number = 30
    println(number)
    number = 100
    println(number)

    val numara = 90
    println(numara)

    //Type casting

    // sayısaldan sayısala

    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)

    //Sayısaldan metinsele
    val sonuc3 = i.toString() // "42"
    println(sonuc3)

    val sonuc4 = d.toString() //"78.95"
    println(sonuc4)

    // Metinden sayısala dönüşüm
    val yazi = "67.43"

    val sonuc5 = yazi.toDoubleOrNull()


    //yöntem 1

    if (sonuc5 != null) {
        println(sonuc5)

    }else{
        println("dönüşüm hatası")
    }

    //YÖNTEM 2

    sonuc5?.let {
    println(it)
    }


}