fun main() {

    var op: Int

    do {

        limpiaConsola()
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarMenu(op)
        }

    } while (op != 0)

}


fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
    var op = -1

    do {
        limpiaConsola()
        when (tipo) {
            1 -> {
                println("1. Ejercicio 04")
                println("2. Ejercicio 06")
                println("3. Ejercicio 12")
                println("4. Ejercicio 15")
                println("5. Ejercicio 18")
                println("6. Ejercicio 20")
                println("7. Ejercicio 21")
                println("8. Ejercicio 22")
                println("9. Ejercicio 24")
                println("10. Ejercicio 25")
                println("11. Ejercicio 26")
                println("12. Ejercicio 27")

                op = pedirOpcion(0, 12)
                when (op) {
                    1 -> ejercicio4()
                    2 -> ejercicio6()
                    3 -> ejercicio12()
                    4 -> ejercicio15()
                    5 -> ejercicio18()
                    6 -> ejercicio20()
                    7 -> ejercicio21()
                    8 -> ejercicio22()
                    9 -> ejercicio24()
                    10 ->ejercicio25()
                    11 ->ejercicio26()
                    12 ->ejercicio27()
                }
            }

            2 -> {
                println("1. EjCondicion 02")
                println("2. EjCondicion 03")
                println("3. EjCondicion 06")
                println("4. EjCondicion 08")
                println("5. EjCondicion 10")
                println("6. EjIterativa 02")
                println("7. EjIterativa 04")

                op = pedirOpcion(0, 7)
                when (op) {
                    1 -> ejCondicion02()
                    2 -> ejCondicion03()
                    3 -> ejCondicion06()
                    4 -> ejCondicion08()
                    5 -> ejCondicion10()
                    6 -> ejIterativa02()
                    7 -> ejIterativa04()
                    8 -> ejIterativa06()
                    9 -> ejIterativa07()
                    10 -> ejIterativa08()
                    11 -> ejIterativa13()
                    12 -> ejIterativa15()
                    13 -> ejIterativa18()
                    19 -> ejIterativa19()
                    20 -> ejIterativa19()
                    21 -> ejExepciones02()
                    22 -> ejExepciones03()
                    23 -> ejExepciones04()
                }
            }

            3 -> {
                println("1. Listas 04")
                println("2. Listas 06")
                println("3. Diccionario 03")

                op = pedirOpcion(0, 3)
                when (op) {
                    1 -> listas04()
                    2 -> listas06()
                    3 -> listas08()
                    4 -> listas09()
                    5 -> listas10()
                    6 -> listas13()

                    7 -> diccionario03()
                    8 -> diccionario05()
                    9 -> diccionario06()
                    10 -> diccionario07()
                    11 -> diccionario08()
                    12 -> diccionario10()

                    13 -> conjuntos01()
                    -13 -> conjuntos01data()
                    14 -> conjuntos02()
                    -14 -> conjuntos02data()
                    15 -> conjuntos03()
                    -15 -> conjuntos03data()
                    16 -> conjuntos04()
                    17 -> conjuntos05()
                    18 -> conjuntos06()
                }
            }
        }
    } while (op != 0)
}

fun conjuntos03() {
    TODO("Not yet implemented")
}

fun conjuntos01() {
    TODO("Not yet implemented")
}

/**
 * Pedir una opción del menú
 * @param min Int - opción mínima
 * @param max Int - opción máxima
 */
fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readln().toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Opción no válida**")
        else -> {
            println("**Error desconocido**")
        }
    }
}

fun limpiaConsola() {
    for (i in 1..10) {
        println()
    }
}

