package com.strive.lib

import java.lang.IllegalArgumentException
import javax.print.attribute.standard.JobOriginatingUserName

/**
 * Author:    Xiao_Tian
 * Version    V1.0
 * Date:      2020/7/16 3:01 PM
 * Description:
 * Why & What is modified:
 */

fun login(userName: String, password: String, illegalStr: String) {
    fun validate(userName: String) {
        if (userName.isEmpty()) {
            throw IllegalArgumentException(illegalStr)
        }
    }
}

fun login1(userName: String, password: String, illegalStr: String) {
    require(userName.isNotEmpty()) { illegalStr }
    require(password.isNotEmpty()) { illegalStr }
}