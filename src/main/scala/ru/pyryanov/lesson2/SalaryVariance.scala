package ru.pyryanov.lesson2


object SalaryVariance {
    //c
    def main(args: Array[String]): Unit = {
        val employees = List(100, 150, 200, 80, 120, 75)
        println(getVariance(employees, getAverage(employees)))
    }

    def getVariance(employees: List[Int], average: Int): List[Int] = {
        var result = List[Int]()
        for (i <- employees) {
            val cur = ((average - i).toDouble / i) * 100
            result = cur.toInt +: result
        }
        result
    }

    def getAverage(employees: List[Int]): Int = {
        employees.sum / employees.size
    }
}
