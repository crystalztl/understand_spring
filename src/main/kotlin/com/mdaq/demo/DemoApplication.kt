package com.mdaq.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    val context = runApplication<DemoApplication>(*args)
    val bean = context.getBean(BinarySearcher::class.java)
    print("\n#######" + bean.search(arrayOf(1, 3, 2), 2) + "\n")
}
