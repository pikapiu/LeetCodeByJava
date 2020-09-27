package main.code.array

import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

/**
 * @Author: zs
 * @Date: 2020/5/15 10:45
 *
 */
var stores =
 """两碗香面
黄焖鸡米饭
沙县小吃
食堂
稻草人快餐
千里香混沌
烧汁虾
小炖鸡"""

val store: List<String> = stores.split("\n")
fun main() {
    println("今天去: " + store[(store.indices).random()])
}