package com.mdaq.demo

import org.springframework.stereotype.Component

@Component
class QuickSorter : SortAlgo {
    override fun sort(input: Array<Int>): Array<Int> {
        print("\n#######  QuickSorter")
        return arrayOf(1,2,3)
    }
}