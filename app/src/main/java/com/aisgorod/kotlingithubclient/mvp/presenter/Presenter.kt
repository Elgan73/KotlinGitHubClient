package com.aisgorod.kotlingithubclient.mvp.presenter

import com.aisgorod.kotlingithubclient.mvp.model.Model
import com.aisgorod.kotlingithubclient.mvp.view.MainView

class Presenter(private val view: MainView) {

    private val model = Model()

    fun counterClick(buttonCounter: ButtonCounter) {

        when (buttonCounter) {
            ButtonCounter.FIRST -> {
                val nextValue = model.next(0)
                view.setButtonText(ButtonCounter.FIRST, nextValue.toString())
            }
            ButtonCounter.SECOND -> {
                val nextValue = model.next(1)
                view.setButtonText(ButtonCounter.SECOND, nextValue.toString())
            }
            ButtonCounter.THIRD -> {
                val nextValue = model.next(2)
                view.setButtonText(ButtonCounter.THIRD, nextValue.toString())
            }
        }
    }
}

enum class ButtonCounter {
    FIRST,
    SECOND,
    THIRD
}