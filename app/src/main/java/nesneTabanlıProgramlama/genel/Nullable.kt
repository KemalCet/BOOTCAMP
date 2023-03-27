package `nesne tabanlı programlama`.genel

fun main(){
    //Nullable ,Null safety ,Optional(swift) belirsizliktir
    // bir yaının null olmasını kontrol eder. mobil uygulama geliştirme dilinde kullanılır.
    //uygulamaların kapanıp çökmemesi için kullanılır android tarafından durduruldu dyıe hata gelmesi
    // mobil uygulamalarda çökmeye neden olur.
    //amac null cıkacak yapılarda uyarı vermek ve 2. bir kontrol yapısı olusturmak için kullanılır.
    //Null , NaN,nil

    // TANIMLAMA AŞAMASI
   // var mesaj = " Hello" // null olma ihtimali yok tanımladık çünku peki silersek ;
    //değeri olmayan değişken olusturamıyoruz.
    var mesaj:String? = null //mesaj null olabilir dikkatli ol demek

    mesaj = "     merhaba     "

    //YÖNTEM 1

    println("Yöntem 1 = ${mesaj?.trim()}")// trim white space başında ve sonunda yer alan bosluları siler.
    // ? burada sorun olursa hata vermeyecek, sorun yoksa çalışır, ÇÖKME İHTİMALİ YOK.

    //YÖNTEM2
    //println("Yöntem 2 = ${mesaj!!.trim()}")// !! SORUN OLURSA UYGULAMA ÇÖKER, SORUMLULUK BİZDE SORUN OLMAYAAAK DİYORUZ.

    //YÖNTEM 3
    if (mesaj != null ){
        println("Yöntem 3 = ${mesaj!!.trim()}")
    }else{
        println("Yöntem 3 :sonuç null 'dur.")
    }

    //YÖNTEM 4
    mesaj.let {
        println("Yöntem 4 = ${it.trim()}")
    }// if(mesaj !=null)
}
