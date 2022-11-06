package ru.pyryanov.lesson2

import scala.io.StdIn.readLine

object NewSalary {
    //d
    def main(args: Array[String]): Unit = {
        var employees = List(100, 150, 200, 80, 120, 75)
        println("Введите зарплату нового сотрудника:")
        var salary = readLine().toInt
        println("Как себя ввел?")
        val behaviour = readLine()
        val variance = getVariance(salary, getAverage(employees))
        if (behaviour.toLowerCase().equals("хорошо")) {
            salary = (salary * (1 + variance)).toInt
        } else if (behaviour.toLowerCase().equals("плохо")) {
            salary = (salary - (salary * variance)).toInt
        }
        employees = salary +: employees

        println(employees.max)
        println(employees.min)
    }

    def getVariance(employee: Int, average: Int): Double = {
        (average - employee).toDouble / employee
    }

    def getAverage(employees: List[Int]): Int = {
        employees.sum / employees.size
    }
}
