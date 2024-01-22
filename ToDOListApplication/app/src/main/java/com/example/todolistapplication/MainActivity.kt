package com.example.todolistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.todolistapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var taskViewModel: TaskViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        binding.newTaskButton.setOnClickListener{
            NewTasksheet().show(supportFragmentManager, "newTaskTag")
        }

        taskViewModel.name.observe(this){
            binding.taskName.text =String.format("Task name: %s",it)
        }
        taskViewModel.desc.observe(this){
            binding.taskdesc.text =String.format("Task Desc: %s",it)
        }
    }
}