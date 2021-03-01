package com.example.expandlistneww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
     val header:MutableList<String> = ArrayList()
    val body:MutableList<MutableList<String>> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "FlowerCorner"


        var chude:MutableList<String> = ArrayList()
        chude.add("Ngày của mẹ")
        chude.add("Hoa sinh nhật")
        chude.add("Hoa chúc mừng")
        chude.add("Hoa khai trương")
        chude.add("Tình yêu")
        chude.add("Văn phòng")
        chude.add("Hoa cưới")
        chude.add("Quốc tế phụ nữ")
        chude.add("Giáng sinh")
        chude.add("Tết âm lịch")
        chude.add("Lễ tình nhân")


        var thietke:MutableList<String> = ArrayList()
        thietke.add("Bó hoa")
        thietke.add("Bình hoa")
        thietke.add("Hộp hoa")
        thietke.add("Lẵng hoa")
        thietke.add("Kệ hoa")

        var hoatuoi:MutableList<String> = ArrayList()
        hoatuoi.add("Hoa hồng")
        hoatuoi.add("Hoa ly")
        hoatuoi.add("Hoa lan")
        hoatuoi.add("Hoa sen")
        hoatuoi.add("Hoa đồng tiền")
        hoatuoi.add("Hoa cẩm dương")
        hoatuoi.add("Hoa hướng dương")
        hoatuoi.add("Hoa tulip")
        hoatuoi.add("Hoa mẫu đơn")


        var quatang:MutableList<String> = ArrayList()
        quatang.add("Gấu bông")
        quatang.add("Socola")
        quatang.add("Bánh kem")
        quatang.add("Giỏ trái cây")
        quatang.add("Giỏ quà tặng")
        quatang.add("Hoa giỏ")



        header.add("Chủ đề")
        header.add("Thiết kế")
        header.add("Hoa tươi")
        header.add("Quà tặng")

        body.add(chude)
        body.add(thietke)
        body.add(hoatuoi)
        body.add(quatang)
        expandlist.setAdapter(expandadapter(this,expandlist,header,body))

    }
}
