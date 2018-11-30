package com.adoranwodo.testingexample

import org.junit.Assert
import org.junit.Test
import kotlin.reflect.full.createInstance

/**
 * Created by adoranwodo on 11/29/18.
 */
class AdditionUnitTest {

    private val instance = MainActivity::class.createInstance()

    @Test
    fun additionOneIsCorrect() {  //Test Case 1: Two positive numbers
        Assert.assertEquals(12, instance.addition(3,9))
    }

    @Test
    fun additionTwoIsCorrect() {  //Test Case 2: Two negative numbers
        Assert.assertEquals(-5, instance.addition(-3,-2))
    }

    @Test
    fun additionThreeIsCorrect() {  //Test Case 3: One positive number and one negative number
        Assert.assertEquals(6, instance.addition(-2,8))
    }

}
