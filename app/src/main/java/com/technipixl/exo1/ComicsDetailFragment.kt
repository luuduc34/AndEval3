package com.technipixl.exo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.technipixl.exo1.databinding.FragmentComicsDetailBinding
import com.technipixl.exo1.network.MarvelServiceImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ComicsDetailFragment : Fragment() {

    private var binding: FragmentComicsDetailBinding? = null
    private val args: ComicsDetailFragmentArgs by navArgs()
    private val MarvelService by lazy { MarvelServiceImpl() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentComicsDetailBinding.inflate(layoutInflater, container, false)
        binding?.titleView?.text = args.comicsId
        //getCharacterAsync()
        return binding?.root

    }/*
    private fun getCharacterAsync() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = MarvelService.getCharacterDetail()
            withContext(Dispatchers.Main) {
                val characterDetail = response.body()?.data?.results ?: emptyList()
            }
        }
    }*/
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}