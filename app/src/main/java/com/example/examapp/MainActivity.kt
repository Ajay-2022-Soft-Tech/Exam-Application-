package com.example.examapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView :RecyclerView
    lateinit var examArrayList : ArrayList<Exam>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        val examImageArray = arrayOf(
            R.drawable.maths,
            R.drawable.computerbasics,
            R.drawable.htmlcss,
            R.drawable.python,
            R.drawable.ece,
            R.drawable.softskills,
            R.drawable.mechanics)

        val examNameArray = arrayOf("Maths","Computer Basics","HTML / CSS","Python","ECE","SoftSkills","Mechanics")
        val examTimeArray = arrayOf("9:00 AM","12:00 PM","11:00 AM","2:30 PM","3:00 PM","8:00 AM","10:00 AM")
        val examDateArray = arrayOf("1 Aug 2023","2 Aug 2023","3 Aug 2023","4 Aug 2023","5 Aug 2023","5 Aug 2023","6 Aug 2023")
        val examArrayTopics = arrayOf(
            "Integration (1,2) Matrix, Determinant , ( L.D.E )",
            "Hardware , Software ,Excel",
            "Build A Project Using Responsive (Booking App)",
            "Codes , Debug, Inheritance,Polymorphism",
            "Digital Circuits , Semiconductor , Gates",
            "Personal Ability Test ,\n SWOT Analysis",
            "DC Motor Construction, Refridgerator")

        myRecyclerView.layoutManager = LinearLayoutManager(this)

        examArrayList = arrayListOf<Exam>()

        for (Index  in examImageArray.indices){
            val exam = Exam(examNameArray[Index],examTimeArray[Index],examDateArray[Index],examArrayTopics[Index],examImageArray[Index])
            examArrayList.add(exam)
        }


        myRecyclerView.adapter = ExamAdapter(examArrayList,this)

    }
}