package com.yigitbalbasi.simplecalculator.ui.viewmodel

import com.yigitbalbasi.simplecalculator.util.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val result: String = "",
    val operation: CalculatorOperation?=null
)