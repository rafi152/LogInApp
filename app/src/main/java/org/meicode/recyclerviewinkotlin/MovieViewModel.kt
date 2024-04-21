package org.meicode.recyclerviewinkotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel(
    private val repository: MoviesRepository
) : ViewModel() {

    private val _movies=MutableLiveData<MoviesResponse>()
    val movies : LiveData<MoviesResponse>
    get() = _movies

    suspend fun getMovies(){
       val movies= repository.getMovies()
        _movies.value=movies
    }
}