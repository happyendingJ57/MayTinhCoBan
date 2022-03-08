package com.example.maytinhcoban.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.maytinhcoban.R

class Fragment_display : Fragment() {

    var displayKetQua :String? = ""
    var displayEditext :String? = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_display,container,false)
        displayKetQua = arguments?.getString("tv_KetQua")
        displayEditext = arguments?.getString("et_Nhap")
        var tvKetQua = mView.findViewById<TextView>(R.id.tvKetQua)
        var etNhap = mView.findViewById<EditText>(R.id.etNhap)

        tvKetQua.text = displayKetQua.toString()
        etNhap.setText(displayEditext.toString())
        return mView
    }
}