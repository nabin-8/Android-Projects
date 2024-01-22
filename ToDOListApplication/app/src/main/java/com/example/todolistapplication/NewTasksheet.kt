package com.example.todolistapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.todolistapplication.databinding.FragmentNewTasksheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NewTasksheet : BottomSheetDialogFragment()
{
    private lateinit var binding: FragmentNewTasksheetBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            super.onCreate(savedInstanceState)
            val activity =requireActivity()
            taskViewModel= ViewModelProvider(activity).get(TaskViewModel::class.java)
            binding.saveButton.setOnClickListener{
                saveAction()
            }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewTasksheetBinding.inflate(inflater,container,false)
        return binding.root
    }

    private  fun saveAction()
    {
        taskViewModel.name.value = binding.name.text.toString()
        taskViewModel.desc.value = binding.desc.text.toString()
        binding.name.setText("")
        binding.desc.setText("")
        dismiss()
    }
}
