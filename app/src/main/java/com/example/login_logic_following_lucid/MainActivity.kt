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




        }


        contentPW.setOnClickListener {
            Log.d("메인화면로그","비밀번호 입력 시도")




        }


        clickBtn.setOnClickListener {
            Log.d("메인화면로그","로그인 시도")

//            아이디 입력값, 비번 입력값을 각각의 변수에 저장

            val inputID = contentID.text.toString()

            val inputPW = contentPW.text.toString()

//            두개의 변수에 들어있는 값 검사(맞는 아이디, 비번)
//            맞을 때, 틀릴 때 분기 처리(if문 활용)

//            ID도 맞고, 비번도 맞아야 함

             if (inputID  == "admin@test.com" && inputPW == "qwer") {

//                 관리자 이름을 변수에 임시 저장
            val name = "민세원"

//                 둘다 맞다면 => 민세원 관리자입니다.

                Toast.makeText(this, "${name}관리자 로그인", Toast.LENGTH_SHORT).show()

                Log.d("관리자 로그인","로그인 성공")

            }
            else {
                Log.d("관리자 로그인","로그인 실패")
                 Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()



            }


        }


    }
}