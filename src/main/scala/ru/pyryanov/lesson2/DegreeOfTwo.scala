package ru.pyryanov.lesson2

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object DegreeOfTwo {
    //o
    def main(args: Array[String]): Unit = {
        println("Введите степень двойки:")
        val n = readLine().toInt
        println(degreeWithRec(n))
        println(degreeWithTailRec(n))
    }

    //I
    def degreeWithRec(n: Int) : Int = {
        if (n <= 1) 2
        else 2 * degreeWithRec(n - 1)
    }

    //II
    def degreeWithTailRec(n: Int) : Int = {
        @tailrec
        def loop(n: Int, acc: Int) : Int = {
            if (n < 1) acc
            else loop(n - 1, 2 * acc)
        }

        loop(n, 1)
    }
}
