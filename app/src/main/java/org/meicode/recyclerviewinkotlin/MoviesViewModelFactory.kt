package org.meicode.recyclerviewinkotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class MoviesViewModelFactory(
    private val repository: MoviesRepository
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(repository) as T
    }
}