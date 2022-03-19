package com.arash.altafi.views.kotlin.ext

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun <T> Fragment.runCoroutineUI(work: (() -> T)): Job {
    return viewLifecycleOwner.lifecycleScope.launch {
        work()
    }
}

fun <T> runCoroutineIO(work: suspend (() -> T)): Job {
    return GlobalScope.launch(Dispatchers.IO) {
        work()
    }
}