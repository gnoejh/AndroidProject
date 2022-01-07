package com.example.mainviewmodel.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mainviewmodel.R
//TODO 2
import com.example.mainviewmodel.databinding.MainFragmentBinding
//TODO 14
import androidx.lifecycle.Observer

class MainFragment : Fragment() {
    //TODO 3
    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    //TODO 4
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return inflater.inflate(R.layout.main_fragment, container, false)
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    //corrected for new method
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO 6
        //TODO 16
//        binding.textView.text = viewModel.getResult().toString()
        //TODO 6
        binding.button.setOnClickListener {
            if (binding.editText.text.isNotEmpty()){
                viewModel.setAmount(binding.editText.text.toString())
                //TODO 18
//                binding.textView.text = viewModel.getResult().toString()
            } else {
                binding.textView.text = "No value"
            }
        }

        //TODO 15
        val resultObserver = Observer<Float> { result -> binding.textView.text = result.toString()}
        //TODO 17
        viewModel.getResult().observe(viewLifecycleOwner, resultObserver)
    }
    //TODO 5
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}