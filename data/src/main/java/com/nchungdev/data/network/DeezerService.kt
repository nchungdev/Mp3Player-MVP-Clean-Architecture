package com.nchungdev.data.network

import com.nchungdev.domain.Track
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface DeezerService {

    @GET("/search/:q")
    fun search(@Query("q") query: String): Single<List<Track>>
}
