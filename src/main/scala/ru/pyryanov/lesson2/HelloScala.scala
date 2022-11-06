package ru.pyryanov.lesson2

object HelloScala {
    //a
    def main(args: Array[String]): Unit = {
        val hello = "Hello, Scala!"
        val python = " and goodbye python!"
        println(hello)
//        I
        println(hello.reverse)
//        II
        println(hello.toLowerCase())
//        III
        println(hello.replace("!", ""))
//        IV
        println(hello + python)
    }
}
