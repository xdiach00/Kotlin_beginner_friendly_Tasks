import tasks.*

fun main() {
    print("Enter task number: ")
    when (readln().toInt()) {
        1 -> exercise1()
        2 -> exercise2()
        3 -> exercise3()
        4 -> exercise4()
        5 -> exercise5()
        else -> println("No such task")
    }
}
