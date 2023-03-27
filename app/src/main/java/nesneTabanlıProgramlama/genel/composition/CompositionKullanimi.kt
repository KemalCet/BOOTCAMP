package `nesne tabanlı programlama`.genel.composition

fun main(){

    val k1 = Kategoriler(1,"dram")
    val k2 = Kategoriler(2,"bilim kurgu")

    val y1 = Yonetmenler(1,"Christopher")
    val y2 = Yonetmenler(2,"quentin tarantino")

    val f1 = Filmler(1,"Django",2013,k1,y2)

    println("film id : ${f1.film_id}")
    println("film ad : ${f1.film_ad}")
    println("film yil : ${f1.film_yil}")
    println("film kategori : ${f1.kategori.kategori_ad}")
    println("film kategori : ${f1.yonetmen.yonetmen_ad}")

}