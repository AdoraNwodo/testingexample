package com.adoranwodo.testingexample

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        onePointTeamA.setOnClickListener { addForTeamA(1) }
        twoPointsTeamA.setOnClickListener { addForTeamA(2)}
        threePointsTeamA.setOnClickListener { addForTeamA(3) }
        resetTeamA.setOnClickListener { teamA.text = "0" }

        onePointTeamB.setOnClickListener { addForTeamB(1) }
        twoPointsTeamB.setOnClickListener { addForTeamB(2) }
        threePointsTeamB.setOnClickListener { addForTeamB(3) }
        resetTeamB.setOnClickListener { teamB.text = "0" }
    }

    fun addForTeamA(score:Int){

        val totalScore = teamA.text.toString().toInt()

        teamA.text = addition(totalScore, score).toString()

    }

    fun addForTeamB(score:Int){

        val totalScore = teamB.text.toString().toInt()

        teamB.text = addition(totalScore, score).toString()

    }


    fun addition(firstNum:Int, secondNum:Int ): Int{

        return firstNum + secondNum

    }
}

