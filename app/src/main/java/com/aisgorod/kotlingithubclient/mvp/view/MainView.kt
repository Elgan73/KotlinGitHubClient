package com.aisgorod.kotlingithubclient.mvp.view

import com.aisgorod.kotlingithubclient.mvp.presenter.ButtonCounter

interface MainView {
    fun setButtonText(index: ButtonCounter, text: String)
}