package com.strive.lib

/**
 * Author:    Xiao_Tian
 * Version    V1.0
 * Date:      2020/7/13 3:53 PM
 * Description:
 * Why & What is modified:
 */
class People private constructor() {

    var age: Int = 123
    var name: String = ""

    override fun toString(): String {
        return "People(age=$age, name='$name')"
    }

    companion object{
        fun getInstans() : People = People()

    }
}