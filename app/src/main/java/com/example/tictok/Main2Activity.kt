package com.example.tictok

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
var games=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun btnClick(v:View){
        if(one_game.isChecked)
            games=1
        if(two_games.isChecked)
            games=2
        if(three_games.isChecked)
            games=3
        if(four_games.isChecked)
            games=4
        if(five_games.isChecked)
            games=5

            if(v.id==ready_btn.id)
            {
                startActivity(Intent(this,MainActivity::class.java).putExtra("games",games))
                this.finish()
            }
    }
}
