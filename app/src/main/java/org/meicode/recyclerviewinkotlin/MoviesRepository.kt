package org.meicode.recyclerviewinkotlin

class MoviesRepository(
    private val api: MoviesApi
) : safeApiRequest(){
    suspend fun getMovies()=apirequest { api.getMovies() }
}