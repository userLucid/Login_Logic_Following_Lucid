package com.example.login_logic_following_lucid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contentID.setOnClickListener {
            Log.d("메인화면로그", "아이디 입력 시도")

            val inputID = contentID.toString()


        }


        contentPW.setOnClickListener {
            Log.d("메인화면로그","비밀번호 입력 시도")

            val inputPW = contentPW.toString()


        }


        clickBtn.setOnClickListener {
            Log.d("메인화면로그","로그인 시도")

            val inputID = contentID.toString()

            val inputPW = contentPW.toString()

             if (inputID  == "admin@test.com" && inputPW == "qwer") {

                Toast.makeText(this, "관리자 로그인", Toast.LENGTH_SHORT).show()

                Log.d("관리자 로그인","로그인 성공")
            }


        }


    }
}