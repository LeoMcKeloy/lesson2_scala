package ru.pyryanov.lesson2

object InsertElementToList {
    //f
    def main(args: Array[String]): Unit = {
        val salary = 130
        var employees = List(75, 80, 90, 100, 120, 150, 200, 350)
        var index = 0
        for (i <- employees) {
            if (salary > i) {
                index = employees.indexOf(i)
            }
        }
        employees = employees.patch(index + 1, List(salary), 0)
        println(employees)
    }
}
