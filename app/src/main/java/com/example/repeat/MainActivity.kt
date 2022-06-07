package com.example.repeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun repeat(x: Int, y: Int) : Int{
        var result = x * y
        return result
    }
    //repet(x: Int, y:Int) kısmında fonksiyonumuzun alacağı değişkenleri ve türlerini tanımlıyoruz.
    //: Int kısmında ise fonksiyonumuzun bize ne türde bir değişken döneceğini tanımlıyoruz.

    //IntArrayler sadece int türünde değişkenler alan arrayledir.
    var intAr = IntArray(5)
    //Multitablelist
    //Öğrelerin eklenmesini ve çıkarılmasının desteklendiği veri koleksyonu yapılarıdır.
    var mlt = mutableListOf<Int>()


}