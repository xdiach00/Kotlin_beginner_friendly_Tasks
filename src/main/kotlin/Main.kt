import tasks.*

fun main() {
    print("Enter task number: ")
    when (readln().toInt()) {
        1 -> exercise1()
        2 -> exercise2()
        3 -> exercise3()
        4 -> exercise4()
        5 -> exercise5()
        6 -> exercise6()
        7 -> exercise7()
        8 -> exercise8()
        9 -> exercise9()
        10 -> exercise10()
        11 -> print(exercise11())
        12 -> print(exercise12())
        13 -> print(exercise13())
        14 -> print(exercise14())
        15 -> print(exercise15())
        16 -> print(exercise16())
        17 -> exercise17()
        18 -> exercise18()
        19 -> print(exercise19())
        20 -> exercise20()
        21 -> exercise21()
        22 -> exercise22()
        23 -> exercise23()
        24 -> exercise24()
        25 -> exercise25()
        26 -> exercise26()
        27 -> exercise27()
        28 -> exercise28()
        29 -> exercise29()
        30 -> exercise30()
        31 -> exercise31()
        33 -> exercise33()
        34 -> exercise34()
        35 -> exercise35()
        36 -> exercise36()
        // exercise37 added to the Unit Tests
        38 -> exercise38()
        39 -> exercise39()
        40 -> exercise40()
        41 -> exercise41()
        42 -> exercise42()
        43 -> exercise43()
        44 -> exercise44()
        45 -> exercise45()
        46 -> exercise46()
        else -> println("No such task")
    }
}
