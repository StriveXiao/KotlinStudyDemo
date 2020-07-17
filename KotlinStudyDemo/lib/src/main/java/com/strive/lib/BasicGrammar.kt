package com.strive.lib

class MyClass

const val PI = 3.14
var x = 3

fun sum(a: Int, b: Int) {
    print(a + b)
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(s1: String, s2: String) {
    val x = parseInt(s1)
    val y = parseInt(s2)
    if (x != null && y != null) {
        println(x * y)

    } else {
        println("'$s1'或者'$s2'不是数字")
    }
}

/**
 * is 运算符可以检查一个表达式的值是不是某个类型的实例
 */
fun getStringLenth(obj: Any): Int? {
    return if (obj is String) obj.length else null
}

/**
 * 在 && 运算符的右侧 obj类型会被自动转换成 String
 */
fun getStringLenth1(obj: Any): Int? {
    return if (obj is String && obj.length > 0) obj.length else null
}

/**
 * for循环
 * 快捷键 iter
 */
fun testFor() {
    val items = listOf("a", "b", "c")
    for (item in items) {
        println(item)
    }
}

/**
 * indices为集合的有效索引范围
 */
fun testFor1() {
    val items = listOf("a", "b", "c")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun testWhile() {
    val items = listOf("a", "b", "c")
    var x = 0
    while (x <= items.size - 1) {
        println("testWhile:索引${x}对应数组中的${items[x]}")
        x++
    }
}

fun testWhen(obj: Any): String =
    when (obj) {
        is String -> obj
        "test" -> "success"
        1 -> "one"
        is Long -> "Long"
        !is String -> "不是字符串"
        else -> "unknown"
    }

fun testInRange() {
    val a = 9
    val b = 10
    if (a in 0..b) {
        println(true)
    }
}

fun testIterRange() {

    for (x in 0..9 step 3) {
        print(x)

    }
    println()
    for (i in 9 downTo 0 step 2) {
        print(i)
    }
    println()
    val items = listOf("a","b","c")
    items.filter {  it.startsWith("a")}

    //使用in运算符检查一个集合是否包含某个对象
    when{
        "v" in items -> println(false)
        "a" in items -> println(true)
    }

}

fun main() {
    //val 只能赋值一次
    val a: Int = 3;
    val b = 2   //自动推断数据类型为Int
    val c: Int
    c = 5
    println("a=$a,b=$b,c=$c")

    //var 可赋值多次
    var i = 6
    i += 2
    println("i=$i")

    println("PI=$PI,x=$x")

    var a1 = 1
    var s1 = "a1 is $a1"
    a1 = 2
    var s2 = "${s1.replace("is", "was")},but now is $a1"
    println(s2)

    println("2和3的最大值是${maxOf(2, 3)}")

    printProduct("2", "4")
    printProduct("a", "4")
    printProduct("2", "b")

    println(getStringLenth("123"))
    println(getStringLenth(123))
    println(getStringLenth1("123"))
    println(getStringLenth1(123))

    testFor()
    testFor1()

    testWhile()

    println(testWhen(1))
    println(testWhen(1231231231231233222))
    println(testWhen("test"))
    println(testWhen(""))
    println(testWhen(Any()))

    testInRange()
    testIterRange()

}

