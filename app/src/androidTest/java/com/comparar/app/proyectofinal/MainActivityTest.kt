package com.comparar.app.proyectofinal

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUI() {
        Espresso.onView(withId(R.id.editText1)).perform(ViewActions.typeText("hola"))
        Espresso.onView(withId(R.id.editText2)).perform(ViewActions.typeText("hola"))
        Espresso.onView(withId(R.id.compareButton)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.resultTextView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Las cadenas de caracteres son iguales")))
    }
}