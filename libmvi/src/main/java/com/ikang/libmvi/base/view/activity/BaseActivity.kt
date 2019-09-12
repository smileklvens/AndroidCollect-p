package com.ikang.libmvi.base.view.activity

import android.os.Bundle

abstract class BaseActivity : InjectionActivity() {

    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }
}