package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var student: Student


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        
        binding.btnSetValue.setOnClickListener(){
            student = Student("AAA" ,20 ,"RSD")
            binding.studentData = student
        }

        binding.btnDisplay.setOnClickListener(){
            binding.tvName.text = student.name
            binding.tvAge.text = student.age.toString()
            binding.tvProgramme.text = student.programme
        }
        binding.apply {
            invalidateAll()
        }
    }
}