package com.aisgorod.kotlingithubclient.mvp.model

class Model {

    private val counters = mutableListOf(0, 0, 0)

    private fun getCurrent(index: Int): Int {
        return counters[index]
    }

    fun set(index: Int, value: Int) {
        counters[index] = value
    }

    fun next(index: Int): Int {
        counters[index]++
        return getCurrent(index)
    }
}