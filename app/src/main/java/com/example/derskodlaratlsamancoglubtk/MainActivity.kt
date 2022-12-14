package com.example.derskodlaratlsamancoglubtk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // Degiskenler ve sabitler
        println("nabıyon bea")
        println(5*10)
        // yorum satırı
        var a =5
        var b=10
        println(a*b)
        var yas=50
        println(yas/5*8)
        yas=60
        println(yas/5*8)
        //val sabit tanımlamalarda kullanılır
        val x=10
        println(yas*x)
        //tanımlama(defining)
        println("------------int---------")
        val benimInterim : Int
        //baslatma degerini atama (initializing,initialization)
        benimInterim=5
        var yeniInteger : Int = 20
        println(yeniInteger)
        println("------------long---------")
        var longDeger1 : Long =100
        println(longDeger1)
        val pi=3.14
        println(pi*2)
        val floatpi :Float =3.14f
        println(floatpi)
        val yeniDouble = 5.0
        println(yeniDouble/2)
        println("------------String---------")
        val benimString = "benim yeni metnim"
        println(benimString.length)
        val isim="berkan"
        val soyisim="olgun"
        val tamisim=isim+" "+soyisim
        println(tamisim)
        val yeniBirString : String
        yeniBirString="100"
        val baskaString = "101"
        println(yeniBirString+baskaString)
        println("------------Boolean-----")
        var benimBoolean = true
        benimBoolean = false
        println(benimBoolean)
        // < kücüktür
        // > buyuktur
        // == eşittir
        // != esit degildir
        //>= buyuk esittir
        // <= kucuk esittir
        //&& ve
        // || veya
        println(3<5)
        println(4!=4)
        val benInt = 10
        val londCevirilen=benInt.toLong()
        println(londCevirilen)
        println("------------Diziler/Koleksiyonlar---------")
        val benimDizi = arrayOf("berkan","olgun","beescp7","beescp71",isim,soyisim)
       println( benimDizi[0])
       println( benimDizi[1])
       println( benimDizi[2])
       println( benimDizi[3])
        println(benimDizi.get(1))
        benimDizi.set(1,"soyisim")
        println(benimDizi.get(1))
        val numaraDizisi= doubleArrayOf(1.0,2.0)
        val karisikDizi= arrayOf("berkan",2,true ,false,2.0)
        println("------------ArrayList---------")
        val isimListesi= arrayListOf<String>("berkan")
        isimListesi.add("olgun")
        isimListesi.add("deneme")
        println(isimListesi.get(1))
        println(isimListesi.get(2))
        val karisikArrayList= arrayListOf<Any>()
        karisikArrayList.add(3)
        karisikArrayList.add("deneme")
        karisikArrayList.add(true)
        println("------------Set---------")
        //aynı veriden bir tane barındırır ex 2 tane 5 olamaz veri tekrarını gg
        val ornDizi= arrayOf(1,12,2,3,1,2,1,1)
        println("index 2 : ${ornDizi[2]}")
        println("index 3 : ${ornDizi[3]}")
        val ornSet= setOf<Int>(1,2,3,1,1,1,2,3,4)
        println(ornSet.size)
        //For each
        ornSet.forEach {
            println(it)
        }
        val ornHashSet= HashSet<String>()
        ornHashSet.add("berkan")
        ornHashSet.add("berkan")
        ornHashSet.add("berkan")
        ornHashSet.add("olgun")
        ornHashSet.forEach {
            println(it)
        }
        println("------------Map---------")
        //Anahtar Kelime-Deger (Key Values Pairing)
        val yemekDizi= arrayOf("elma","et","tavuk")
        val kaloriDizi= arrayOf(100,300,200)
        println("${yemekDizi[0]} ' nin kalorisi : ${kaloriDizi[0]}")
        val yemekKaloriMap= hashMapOf<String,Int>()
        yemekKaloriMap.put("elma",100)
        yemekKaloriMap.put("et",300)
        yemekKaloriMap.put("tavuk",200)
        yemekKaloriMap.forEach {
            println(it)
        }
        val ornHasMap2=HashMap<String,String>()
        ornHasMap2.put("1","1")
        val yeniMap= hashMapOf<String,Int>("berkan" to 30)
        println("------------Matematiksel İslemler---------")
        var sayi=8
        println(sayi)
        sayi=sayi+1
        sayi++
        println(sayi)
        sayi--
        println(sayi)
        val digerSayi=10
        println(digerSayi>sayi && 2>3 )
        println(digerSayi>sayi || 2>3 )
        //Remainder-kalanı bulmak mod almak
        println(10%3)
        println("------------If Statements(eger kontrolleri)---------")
        val skor=80
        if (skor<10){
            println("oyunu kaybettin")
        }
        else if (skor>=10 && skor<20)
        {
            println("devamke")
        }
        else if (skor>=20 && skor<30)
        {
            println("eyisin eyi eyi")
        }
        else
        {
            println("skorun cok ustunde efsanesın kırvem")
        }
        println("------------When/Switch---------")
        var notRakami=6
        var notString=" "
       /* if(notRakami==0){
            notString="gecersiz"
        }
        else if (notRakami==1){
            notString="zayif"
        }
        else if (notRakami==2){
            notString="kötü"
        }
        else if (notRakami==3){
            notString="orta"
        }
        else if (notRakami==4){
            notString="iyi"
        }
        else if (notRakami==5){
            notString="pek iyi"
        }
        */

        when(notRakami){
            0-> notString="gecersiz not"
            1-> notString="zayif not"
            2-> notString="kötü not"
            3-> notString="orta not"
            4-> notString="iyi not"
            5-> notString="pek iyi not"
            else-> notString="gecersizzz not"
        }
        println(notString)
        println("------------For Döngüsü---------")
        val nmrDizi= arrayOf(1,2,3,4,5,6,43,33,22,44,55,66)
        val q= nmrDizi[0]/5+3
        println(q)
        println("düngü basladı")
        for (num in nmrDizi){
            println(num/5+3)
        }
        println("dongu bitti")
        for (index in nmrDizi.indices){
            println(index)
            println(nmrDizi[index]/5+3)
        }
        for (b in 0..9){
            println(b)
        }
        val ynDizi=ArrayList<String>()
        ynDizi.add("berkan")
        ynDizi.add("gg")
        ynDizi.add("gg")
        for (str in ynDizi)
        {
            println(str)
        }
        ynDizi.forEach{
            println(it)
        }
        println("------------While Döngüsü---------")
        var j=0
        while (j<10){
            println(j)
            j++
        }

    }

    fun degistir(view : View){
       textView.text="deneme kirvem"

    }


}