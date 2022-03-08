package com.example.maytinhcoban.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.maytinhcoban.Communicator
import com.example.maytinhcoban.R

class Fragment_keyboard : Fragment() {

     var tv_kq : Float = 0F
     var et_nhap : String =""
    var dau :String = ""
    var bien:Int = 0
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView =  inflater.inflate(R.layout.fragment_keyboard,container,false)
       // var btn_C = mView.findViewById<Button>(R.id.btn_C)
        //var btn_Phantram = mView.findViewById<Button>(R.id.btn_phantram)
        var btnDelete = mView.findViewById<ImageButton>(R.id.imgbtnDelete)
        var btnChia = mView.findViewById<Button>(R.id.imgbtnChia)
        var btn7 = mView.findViewById<Button>(R.id.btn7)
        var btn8 = mView.findViewById<Button>(R.id.btn8)
        var btn9 = mView.findViewById<Button>(R.id.btn9)
        var btnNhan = mView.findViewById<Button>(R.id.btnNhan)
        var btn4 = mView.findViewById<Button>(R.id.btn4)
        var btn5= mView.findViewById<Button>(R.id.btn5)
        var btn6 = mView.findViewById<Button>(R.id.btn6)
        var btnTru = mView.findViewById<Button>(R.id.btnTru)
        var btn1 = mView.findViewById<Button>(R.id.btn1)
        var btn2 = mView.findViewById<Button>(R.id.btn2)
        var btn3 = mView.findViewById<Button>(R.id.btn3)
        var btnCong = mView.findViewById<Button>(R.id.btnCong)
        //var btn_00 = mView.findViewById<Button>(R.id.btn_00)
        var btn0 = mView.findViewById<Button>(R.id.btn0)
        //var btn_Phay = mView.findViewById<Button>(R.id.btn_phay)
        var btn_KetQua = mView.findViewById<Button>(R.id.btnKQ)

        communicator = activity as Communicator


        btnCong.setOnClickListener {
            dau = "+"
            et_nhap+="+"
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btnTru.setOnClickListener {
            dau = "-"
            et_nhap+="-"
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btnNhan.setOnClickListener {
            dau = "x"
            et_nhap+="x"
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btnChia.setOnClickListener {
            dau = "/"
            et_nhap+="/"
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        btn0.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 0
                "-" -> tv_kq -= 0
                "/" -> tv_kq /= 0
                "x" -> tv_kq *= 0
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 0F
                }
            }
            et_nhap+="0"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        btn1.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 1
                "-" -> tv_kq -= 1
                "/" -> tv_kq /= 1
                "x" -> tv_kq *= 1
                else -> if(bien == 0){
                    bien = 1
                    tv_kq =1F
                }
            }
            et_nhap+="1"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        btn2.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 2
                "-" -> tv_kq -= 2
                "/" -> tv_kq /= 2
                "x" -> tv_kq *= 2
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 2F
                }
            }
            et_nhap+="2"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btn3.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 3
                "-" -> tv_kq -= 3
                "/" -> tv_kq /= 3
                "x" -> tv_kq *= 3
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 3F
                }
            }
            et_nhap+="3"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btn4.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 4
                "-" -> tv_kq -= 4
                "/" -> tv_kq /= 4
                "x" -> tv_kq *= 4
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 4F
                }
            }
            et_nhap+="4"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btn5.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 5
                "-" -> tv_kq -= 5
                "/" -> tv_kq /= 5
                "x" -> tv_kq *= 5
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 5F
                }
            }
            et_nhap+="5"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btn6.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 6
                "-" -> tv_kq -= 6
                "/" -> tv_kq /= 6
                "x" -> tv_kq *= 6
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 6F
                }
            }
            et_nhap+="6"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }
        btn7.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 7
                "-" -> tv_kq -= 7
                "/" -> tv_kq /= 7
                "x" -> tv_kq *= 7
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 7F
                }
            }
            et_nhap+="7"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }


        btn8.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 8
                "-" -> tv_kq -= 8
                "/" -> tv_kq /= 8
                "x" -> tv_kq *= 8
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 8F
                }
            }
            et_nhap+="8"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        btn9.setOnClickListener {
            when(dau){
                "+" -> tv_kq += 9
                "-" -> tv_kq -= 9
                "/" -> tv_kq /= 9
                "x" -> tv_kq *= 9
                else -> if(bien == 0){
                    bien = 1
                    tv_kq = 9F
                }
            }
            et_nhap+="9"
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        btnDelete.setOnClickListener{
            et_nhap ="";
            tv_kq = 0f;
            bien = 0;
            dau =""
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        btn_KetQua.setOnClickListener {
            communicator.KetQua(""+tv_kq,et_nhap)
        }

        return mView
    }
}