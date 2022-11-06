package ru.pyryanov.lesson2

object SalaryIndexing {
    //h
    def main(args: Array[String]): Unit = {
        val employees = List(75, 80, 90, 100, 120, 150, 200, 340, 350)
        var result = List[Int]()
        for (i <- employees) {
            result = indexing(i) +: result
        }
        println(result.reverse)
    }

    def indexing(salary: Int) : Int = {
        (salary + (salary.toDouble / 100 * 7)).toInt
    }
}
