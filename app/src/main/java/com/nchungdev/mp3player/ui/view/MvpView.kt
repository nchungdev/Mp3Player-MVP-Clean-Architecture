package com.nchungdev.mp3player.ui.view

import androidx.annotation.StringRes

interface MvpView {

    fun showLoading()

    fun hideLoading()

    fun openActivityOnTokenExpire()

    fun openLoginActivity()

    fun onError(@StringRes resId: Int)

    fun onError(message: String?)

    fun showMessage(message: String?)

    fun showMessage(@StringRes resId: Int)

    fun isNetworkConnected(): Boolean

    fun hideKeyboard()
}