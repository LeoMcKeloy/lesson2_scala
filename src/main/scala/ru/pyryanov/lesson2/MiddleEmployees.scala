package ru.pyryanov.lesson2

import scala.io.StdIn.readLine

object MiddleEmployees {
    //g
    def main(args: Array[String]): Unit = {
        val employees = List(75, 80, 90, 100, 120, 150, 200, 340, 350)
        println("Введите минимум вилки middle:")
        val min = readLine().toInt
        println("Введите максимум вилки middle:")
        val max = readLine().toInt
        println(middleEmployees(employees, min, max))
    }

    def middleEmployees(employees: List[Int], min: Int, max: Int) : List[Int] = {
        var result = List[Int]()
        for (i <- employees) {
            if (i >= min && i < max) {
                result = employees.indexOf(i) +: result
            }
        }
        result
    }
}
