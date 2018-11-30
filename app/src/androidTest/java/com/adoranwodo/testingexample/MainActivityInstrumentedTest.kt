package com.adoranwodo.testingexample

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    //@Rule
    private var mActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java, true, true)


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.adoranwodo.testingexample", appContext.packageName)
    }

    @Test
    fun textViewsAreZeroOnLaunch(){
        mActivityTestRule.launchActivity(null)                  //start activity

        //check results
        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))
        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("0")))

    }

    @Test
    fun teamAOnePointIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero
        Espresso.onView(ViewMatchers.withId(R.id.onePointTeamA)).perform(ViewActions.click())              //perform action - add one point
        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("1")))    //check result

    }

    @Test
    fun teamATwoPointsIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero
        Espresso.onView(ViewMatchers.withId(R.id.twoPointsTeamA)).perform(ViewActions.click())              //perform action - add two points
        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("2")))    //check result

    }

    @Test
    fun teamAThreePointsIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero
        Espresso.onView(ViewMatchers.withId(R.id.threePointsTeamA)).perform(ViewActions.click())           //perform action - add three points
        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("3")))    //check result

    }

    @Test
    fun teamA123PointsIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero

        //perform actions
        Espresso.onView(ViewMatchers.withId(R.id.twoPointsTeamA)).perform(ViewActions.click())           //value should be 2
        Espresso.onView(ViewMatchers.withId(R.id.threePointsTeamA)).perform(ViewActions.click())           //value should be 5
        Espresso.onView(ViewMatchers.withId(R.id.onePointTeamA)).perform(ViewActions.click())           //value should be 6

        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("6")))    //check result

    }


    @Test
    fun resetAButtonWorks(){
        mActivityTestRule.launchActivity(null)                  //start activity

        Espresso.onView(ViewMatchers.withId(R.id.resetTeamA)).perform(ViewActions.click())                  //perform action
        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //check result

    }


    @Test
    fun teamBOnePointIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero
        Espresso.onView(ViewMatchers.withId(R.id.onePointTeamA)).perform(ViewActions.click())              //perform action - add one point
        Espresso.onView(ViewMatchers.withId(R.id.teamA)).check(ViewAssertions.matches(ViewMatchers.withText("1")))    //check result

    }

    @Test
    fun teamBTwoPointsIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero
        Espresso.onView(ViewMatchers.withId(R.id.twoPointsTeamB)).perform(ViewActions.click())              //perform action - add two points
        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("2")))    //check result

    }

    @Test
    fun teamBThreePointsIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero
        Espresso.onView(ViewMatchers.withId(R.id.threePointsTeamB)).perform(ViewActions.click())           //perform action - add three points
        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("3")))    //check result

    }

    @Test
    fun teamB123PointsIsCorrect(){
        mActivityTestRule.launchActivity(null)                  //start activity


        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //initial value is zero

        //perform actions
        Espresso.onView(ViewMatchers.withId(R.id.twoPointsTeamB)).perform(ViewActions.click())           //value should be 2
        Espresso.onView(ViewMatchers.withId(R.id.threePointsTeamB)).perform(ViewActions.click())           //value should be 5
        Espresso.onView(ViewMatchers.withId(R.id.onePointTeamB)).perform(ViewActions.click())           //value should be 6

        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("6")))    //check result

    }

    @Test
    fun resetBButtonWorks(){
        mActivityTestRule.launchActivity(null)                  //start activity

        Espresso.onView(ViewMatchers.withId(R.id.resetTeamB)).perform(ViewActions.click())                  //perform action
        Espresso.onView(ViewMatchers.withId(R.id.teamB)).check(ViewAssertions.matches(ViewMatchers.withText("0")))    //check result

    }
}
