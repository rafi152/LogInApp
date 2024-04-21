package org.meicode.recyclerviewinkotlin

import retrofit2.Response
import java.io.IOException

abstract class safeApiRequest {

    suspend fun <T: Any> apirequest(call :suspend () -> Response<T>):T{
        val response=call.invoke()
        if (response.isSuccessful){
            return response.body()!!
        }else{
            throw  ApiExecption(response.code().toString())
        }
    }
}
class ApiExecption( message: String): IOException(message)