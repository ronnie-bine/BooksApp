package com.example.books.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.books.databinding.FragmentBooksToReadBinding

class BooksToReadFragment : Fragment() {

    private var binding: FragmentBooksToReadBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = FragmentBooksToReadBinding.inflate(inflater)
        return binding!!.root
    }
}