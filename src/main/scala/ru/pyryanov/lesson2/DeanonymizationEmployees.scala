package ru.pyryanov.lesson2

import scala.collection.mutable
import scala.io.StdIn.readLine

object DeanonymizationEmployees {
    def main(args: Array[String]): Unit = {
        val employees = List(75, 80, 90, 100, 120, 150, 200)

        //k
        val result: mutable.Map[String, Int] = mutable.HashMap()
        for (i <- employees ) {
            println("Введите следующее имя и фамилию:")
            val name = readLine()
            result += (name -> i)
        }

        println(result)

        //l
        println("Самая высокая зарплата у сотрудника: " + result.max._1)
        println("Самая низкая зарплата у сотрудника: " + result.min._1)

        //m
        val result2: mutable.Map[String, Int] = mutable.HashMap()
        for ((key, value) <- result) {
            val newKey = key.split(" ")(1).toLowerCase().replaceAll("[аеёиоуыэюя]+", "").reverse
            result2 += (newKey -> value)
        }
        println(result2)
    }
}