package ru.pyryanov.lesson2

import scala.io.StdIn.readLine

object EmployeeSalary {
    //b, n
    def main(args: Array[String]): Unit = {
        println("Введите зарплату:")
        val salary = readLine().toInt
        println("Введите размер премии в процентах:")
        val bonus = readLine().toInt
        println("Введите компенсацию питания:")
        val nutrition = readLine().toInt
        println(salaryNet(salary, bonus, nutrition))
    }

    def salaryNet(salary: Int, bonus: Int, nutrition: Int): Int = {
        val annualIncome = salary * 12
        val summaryBeforeTax = annualIncome + (annualIncome * (bonus.toDouble / 100)).toInt + nutrition
        (summaryBeforeTax - summaryBeforeTax / 100 * 13) / 12
    }
}
