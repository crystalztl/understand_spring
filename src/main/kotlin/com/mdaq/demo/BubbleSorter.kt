package com.mdaq.demo

import org.springframework.stereotype.Component

@Component
class BubbleSorter : SortAlgo {
    override fun sort(input: Array<Int>): Array<Int> {
        print("\n#######  BubbleSorter")
        return arrayOf(1,2,3)
    }


}