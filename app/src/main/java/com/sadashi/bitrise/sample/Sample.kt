package com.sadashi.bitrise.sample

class Sample {

    fun checkArgument(arg1: String?, arg2: String?): Boolean {
        arg1 ?: return false
        arg2 ?: return false

        return true
    }
}