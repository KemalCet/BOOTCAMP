package `nesne tabanlı programlama`.genel

fun main() { // class içine erişmek istiyorsak ilk yapmamız gereken nesne olusturmaktır.
    val f = Fonksiyonlar() //f nesnesi olusturduk.

    f.selamla()

    val gelenSonuc = f.selamla2() //f. selamla2 fonksiyonu bize değer verdi sonuc = merhaba ahmet di gelensonuc= Merhaba Ahmet oldu..
    println("gelen sonuc : $gelenSonuc")

    f.selamla3("zeynep")

    val gelenToplam = f.toplama(10,20)
    println("gelen toplam : $gelenToplam")

    f.carp(3,5,"mehmet")
    //"ali".  dediğinde string class ının fonksiyonlarını kullanabilirsin ve görürsun

    val sonuc = 8.carpi(6)
    println(sonuc)

    var x = 5.carpi(3)//asagıdaki infix sayesinde
    println(x)

}

infix fun Int.carpi(sayi:Int) : Int { // fonksiyon eklemek istediğin sınıfı belirliyosun burada Int // extension fonksiyonu

    return this * sayi
 }// this : bulunduğu sınıf temsil eder , self = swift yani integer i


