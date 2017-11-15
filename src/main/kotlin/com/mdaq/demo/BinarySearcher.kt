package com.mdaq.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BinarySearcher(sorter:SortAlgo){

    @Autowired
    private lateinit var sorter: SortAlgo


    fun search(input: Array<Int>, number: Int): Int {
        sorter!!.sort(input)
        print("\n#######"+sorter)
        return 3
    }

}