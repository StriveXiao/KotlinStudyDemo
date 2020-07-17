package com.strive.lib

/**
 * Author:    Xiao_Tian
 * Version    V1.0
 * Date:      2020/7/13 9:37 AM
 * Description:
 * Why & What is modified:
 */
fun main() {
    val b: Byte = 2;
    val c: Int = b.toInt();

    val str = "abcd";
    for (c in str) {
        print(c)
    }

    // ⏬

    val trimIndent = """
            |1231242
        |ewrewr
        |啊哈哈哈
        |🌙🌞
    """.trimMargin()

    println(str[2])
    println(str + "def" + (1 + 0.6f))
    println("""str + "def" + (1 + 0.6f)""")
    println(trimIndent)

    println("testIf:${testIf(1, 2)}")
    println("testIf:${testIf(4, 2)}")

    val array = arrayOf("a", "b", "c", "d")
    for ((index, value) in array.withIndex()) {
        println("数组的第$index 值是$value")
    }

    var aa = 1
    var bb = 2
    aa = bb.also { bb = aa }

    println("aa --> $aa ,bb --> $bb")


    testReturn()


    var people: People = People.getInstans()

    people.age = 30
    people.name = "aaaa"


    println(people.toString())


    sayHi()
    sayHi(name = "dudu")
    sayHi(age = 12)
    sayHi("qqq",28)
    sayHi(name = "wawa",age = 20)


}

fun testIf(a: Int, b: Int) = if (a > b) "$a" else "$b"


fun testReturn() {
    for (i in 1..100) {
        for (j in 1..100) {
            if (i * j == 24)
                println("i-->$i j-->$j")

        }
    }
    println("test----->")
}

fun sayHi(name: String = "hgahaha", age: Int = 16) {
    println("name----> $name age----> $age")
}



