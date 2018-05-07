package com.toxicbakery.androidstatemachines

import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    private val activity: MainActivity
        get() = activityTestRule.activity

    @Test
    fun cycleMachine() {
        activity.apply {
            runOnUiThread {
                onNewState(ViewState.ALTERNATE)
                onNewState(ViewState.DEFAULT)
            }
        }
    }

}