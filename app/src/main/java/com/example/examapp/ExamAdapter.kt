package com.example.examapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ExamAdapter(val examArrayList: ArrayList<Exam> , val context : Activity)
    :RecyclerView.Adapter<ExamAdapter.ExamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamAdapter.ExamViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_exam,parent,false)
        return ExamViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExamAdapter.ExamViewHolder, position: Int) {
        val currentItem = examArrayList[position]
        holder.name.text = currentItem.examName
        holder.time.text = currentItem.examTime
        holder.date.text = currentItem.examDate
        holder.topic.text = currentItem.examTopics
        holder.image.setImageResource(currentItem.examImage)
    }

    override fun getItemCount(): Int {
        return examArrayList.size
    }

    class ExamViewHolder(itemView :View):RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.examName)
        val time = itemView.findViewById<TextView>(R.id.examTime)
        val date = itemView.findViewById<TextView>(R.id.examDate)
        val topic = itemView.findViewById<TextView>(R.id.examTopic)
        val image = itemView.findViewById<ShapeableImageView>(R.id.examImage)



    }

}