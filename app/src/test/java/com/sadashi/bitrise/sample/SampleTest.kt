package com.sadashi.bitrise.sample

import org.junit.Test

import org.junit.Assert.*

class SampleTest {

    @Test
    fun testCheckArgument_both_param_is_not_null() {
        val arg1 = "1"
        val arg2 = "2"
        val result = Sample().checkArgument(arg1, arg2)
        assertTrue(result)
    }

//    @Test
//    fun testCheckArgument_arg1_is_null() {
//        val arg2 = "2"
//        val result = Sample().checkArgument(null, arg2)
//        assertFalse(result)
//    }
//
//    @Test
//    fun testCheckArgument_arg2_is_null() {
//        val arg1 = "1"
//        val result = Sample().checkArgument(arg1, null)
//        assertFalse(result)
//    }
}