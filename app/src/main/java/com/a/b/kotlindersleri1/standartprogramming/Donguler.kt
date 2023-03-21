package com.a.b.kotlindersleri1.standartprogramming

fun main(){
    //1,2,3
    for (i in 1..3){ // i in 1...3(swift ) for each [loop name]

        println("Döngü 1 :$i")

    }

    //10 ile 20 arasında 5 er artacak

    for (a in 10..20 step 5){//step : infix function

        println("Döngü 2 : $a")
    }

    //20 ile 10 arasında 5 er azalan

    for (b in 20 downTo  10 step 5){
        println("Döngü 3 : $b")
    }

    //1,2,3,4,5
    var sayac = 1

    while(sayac < 6){
        println("Döngü 4: $sayac")
        sayac++
    }

    //break - continue
    //break dögüyü tamamen durdurur contınue ise döngüyü başa çıkartır.
    for (i in 1..5){
        if (i == 3){
            break
        }
        println("Döngü 5 : $i")

    }
    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Döngü 6 : $i")

    }
}