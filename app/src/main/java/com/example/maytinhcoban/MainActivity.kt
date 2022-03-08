package com.example.maytinhcoban

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.maytinhcoban.fragment.Fragment_display
import com.example.maytinhcoban.fragment.Fragment_keyboard

class MainActivity : AppCompatActivity(),Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentKeyboard = Fragment_keyboard()
        supportFragmentManager.beginTransaction().replace(R.id.id_framelayout_keyboard,fragmentKeyboard).commit()
    }
    override fun KetQua(ketqua: String,nhap :String) {
        val bundle = Bundle()
        bundle.putString("tv_KetQua",ketqua)
        bundle.putString("et_Nhap",nhap)
        val transaction = this.supportFragmentManager.beginTransaction()

        val fragmentDisplay = Fragment_display()
        fragmentDisplay.arguments = bundle
        transaction.replace(R.id.id_framelayout_display,fragmentDisplay)
        transaction.commit()
    }
}