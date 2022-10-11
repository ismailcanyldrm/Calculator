package com.ismailcan.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        islem1.setOnClickListener {
            var x: Int? = sayi1.text.toString().toIntOrNull()
            var y: Int? = sayi2.text.toString().toIntOrNull()

            if (x == null || y == null) {
                sonuc.text = "Sayı Girmeyi Unutmayınız"
            } else {
                val z = x + y
                sonuc.text = """
                    |************************
                    |Toplama İşlemi
                    |************************
                    |Sonuç : ${z}
                    |************************
                """.trimMargin()

        }
            islem2.setOnClickListener {
                var x: Int? = sayi1.text.toString().toIntOrNull()
                var y: Int? = sayi2.text.toString().toIntOrNull()

                if (x == null || y == null) {
                    sonuc.text = "Sayı Girmeyi Unutmayınız"
                } else {
                    val z = x - y
                    sonuc.text = """
                    |************************
                    |Çıkarma İşlemi
                    |************************
                    |Sonuç : ${z}
                    |************************
                """.trimMargin()}}

                    islem3.setOnClickListener {
                        var x: Int? = sayi1.text.toString().toIntOrNull()
                        var y: Int? = sayi2.text.toString().toIntOrNull()

                        if (x == null || y == null) {
                            sonuc.text = "Sayı Girmeyi Unutmayınız"
                        } else {
                            val z = x * y
                            sonuc.text = """
                    |************************
                    |Çarpma İşlemi
                    |************************
                    |Sonuç : ${z}
                    |************************
                """.trimMargin()}}

                        }
                        islem4.setOnClickListener {
                            var x = sayi1.text.toString().toDoubleOrNull()
                            var y = sayi2.text.toString().toDoubleOrNull()

                            if (x == null || y == null) {
                                sonuc.text = "Sayı Girmeyi Unutmayınız"
                            } else {
                                val z = x / y
                                sonuc.text = """
                    |************************
                    |Bölme İşlemi
                    |************************
                    |Sonuç : ${z}
                    |************************
                """.trimMargin()}}

                            }
                }

        /*
    fun topla(view: View) {
        var x: Int? = sayi1.text.toString().toIntOrNull()
        var y: Int? = sayi2.text.toString().toIntOrNull()

        if (x == null || y == null) {
            sonuc.text = "Sayı Girmeyi Unutmayınız"
        } else {
            val z = x + y
            sonuc.text = "Sonuç : ${z}"
        }*/






