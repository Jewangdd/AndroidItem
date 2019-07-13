package com.example.activity_02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.lang.StringBuilder

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun onClickFindBeer(V: View){

        //转换字符串
        var str:String = spinner.selectedItem.toString()
        //添加到文本框
        var brands = BeerExpert()
        var lists:List<String> = brands.getBrands(str)

        var brandFormat =  StringBuilder()
        lists.forEach(){
            brandFormat.append(it).append("\n")
        }
        textView.setText(brandFormat)
    }
}



