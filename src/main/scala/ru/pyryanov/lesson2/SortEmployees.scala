package ru.pyryanov.lesson2

object SortEmployees {
    //e
    def main(args: Array[String]): Unit = {
        var employees = List(100, 150, 200, 80, 120, 75)
        employees = 350 +: employees
        employees = 90 +: employees
        employees = employees.sorted
        println(employees)
    }
}