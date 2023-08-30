package com.comparar.app.proyectofinal

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.comparar.app.proyectofinal.view.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setupViewModel() {
        viewModel = MainViewModel()
    }

    @Test
    fun testTextComparison() {
        viewModel.compareTexts("hola", "hola")
        assertEquals("Las cadenas de caracteres son iguales", viewModel.resultLiveData.value)

        viewModel.compareTexts("hola", "mundo")
        assertEquals("Las cadenas de caracteres son diferentes", viewModel.resultLiveData.value)
    }
}