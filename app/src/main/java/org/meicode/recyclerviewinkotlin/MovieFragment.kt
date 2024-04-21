package org.meicode.recyclerviewinkotlin

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MovieFragment : Fragment() {


    private lateinit var factory: MoviesViewModelFactory
    private lateinit var viewModel: MovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val api=MoviesApi()
        val repository=MoviesRepository(api)
        factory=MoviesViewModelFactory(repository)

    }


}