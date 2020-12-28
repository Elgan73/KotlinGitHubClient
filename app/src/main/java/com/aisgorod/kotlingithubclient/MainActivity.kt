package com.aisgorod.kotlingithubclient

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.aisgorod.kotlingithubclient.mvp.presenter.ButtonCounter
import com.aisgorod.kotlingithubclient.mvp.presenter.Presenter
import com.aisgorod.kotlingithubclient.mvp.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, MainView {

    private var presenter: Presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_counter1.setOnClickListener(this)
        btn_counter2.setOnClickListener(this)
        btn_counter3.setOnClickListener(this)

    }

    override fun setButtonText(index: ButtonCounter, text: String) {
        when(index) {
            ButtonCounter.FIRST -> btn_counter1.text = text
            ButtonCounter.SECOND -> btn_counter2.text = text
            ButtonCounter.THIRD -> btn_counter3.text = text
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_counter1 -> presenter.counterClick(ButtonCounter.FIRST)
            R.id.btn_counter2 -> presenter.counterClick(ButtonCounter.SECOND)
            R.id.btn_counter3 -> presenter.counterClick(ButtonCounter.THIRD)
        }
    }
}