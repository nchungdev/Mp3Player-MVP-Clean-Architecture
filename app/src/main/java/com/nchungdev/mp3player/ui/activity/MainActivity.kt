package com.nchungdev.mp3player.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.nchungdev.mp3player.R
import com.nchungdev.mp3player.utils.RetrofitUtil
import com.nchungdev.data.DeezerService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        RetrofitUtil().invoke(DeezerService::class.java).search("Happy New year")
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                it.forEach {
//                    Log.e("Track", it.title)
//                }
//            }, {})
    }
}
