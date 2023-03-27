package `nesne tabanlı programlama`.genel.paket1

open class A {// hangi class ozellik aktarıyorsa open gelecek

    var varsayilanDegisken = 1 // public : her yerden erişilebilir.
    public var publicDegisken = 2 // ifade silikse kullanılmıyor anlamında
    protected var protectedDegisken = 3 // kalıtım yoluyla kullanılır.
    private var privateDegisken = 4 // sadece bulunduğu classtan erişilebilir.

}