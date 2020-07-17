package com.strive.lib

import java.math.BigDecimal
import java.time.Duration
import java.time.LocalTime

/**
 * Author:    Xiao_Tian
 * Version    V1.0
 * Date:      2020/7/15 6:30 PM
 * Description:
 * Why & What is modified:
 */
const val maxCount = 100_000
fun main() {
    test1()
    test2()
    test3()
}

fun test1() {
    //Array 方式
    var timeArrayStart = LocalTime.now()
    var array = Array(maxCount) { i -> (i + 1) }
    var totalArray = 0
    array.forEach {
        totalArray += it
    }
    val avgArray = BigDecimal(totalArray).divide(BigDecimal(array.size))
    val durationArray = Duration.between(timeArrayStart, LocalTime.now())
    println("Array 平均值=$avgArray 用时=$durationArray")
}

fun test2() {
    //IntArray 方式
    var timeIntArrStart = LocalTime.now()
    var intArray = IntArray(maxCount) { i -> (i + 1) }
    var totalIntArr = 0
    intArray.forEach {
        totalIntArr += it
    }
    val avgIntArr = BigDecimal(totalIntArr).divide(BigDecimal(intArray.size))
    val durationIntArr = Duration.between(timeIntArrStart, LocalTime.now())
    println("IntArray 平均值=$avgIntArr 用时=$durationIntArr")
}

fun test3() {
    //List
    var timeListStart = LocalTime.now()
    var list = List(maxCount) { i -> (i + 1) }
    var totalList = 0
    list.forEach {
        totalList += it
    }
    val avgList = BigDecimal(totalList).divide(BigDecimal(list.size))
    val durationList = Duration.between(timeListStart, LocalTime.now())
    println("List 平均值=$avgList 用时=$durationList")
}