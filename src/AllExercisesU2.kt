import java.util.*
fun ejCondicion02(): Boolean {
    val contrasenas = mapOf(
        "Usuario_Tarde" to "CORRECTO!!",
        "4358" to "Correcto papu!!",
        "Password" to "Correct yoo got an ice cream",
        "Prog_DAM" to "Incorret- naaaa mentiras, Es CORRECTO",
        "GITHUB" to "cOrEcToOoOoOoOoOoO!!",
        "Porfin emma se aprendio el Pseudocodigo con Python" to "Sii aprendio(le falta aprender), y si acabas de introducir la contraseña correcta"
    )

    while (true) {
        print("Introduzca la contraseña: ")
        val contrasena = readln()

        if (contrasena in contrasenas) {
            println(contrasenas[contrasena])
            return true
        } else {
            println("Incorrecto")
            print("Desea intentarlo de nuevo? (SI/NO): ")
            val continuar = readln().lowercase()

            if (continuar != "si") {
                return false
            }
        }
    }
}
fun ejCondicion03() {
    print("Numero a dividir: ")
    val num1 = readln().toIntOrNull() ?: 0
    print("Segundo numero a dividir: ")
    val num2 = readln().toIntOrNull() ?: 0

    if (num2 == 0) {
        println("ERROR, es imposible dividir entre zero")
    } else {
        val dividir = num1.toDouble() / num2.toDouble()
        println("Es: $dividir")
    }
}
fun ejCondicion06() {
    print("Ingrese su nombre: ")
    val nombre = readln()

    print("Ingrese su sexo (M para Mujer, H para Hombre): ")
    val sexo = readln()

    val mayusculas = nombre.uppercase()

    val grupo = if ((sexo == "M" && mayusculas < "M") || (sexo == "H" && mayusculas > "N")) {
        "A"
    } else {
        "B"
    }
    println("Usted pertenece al grupo $grupo")
}
fun ejCondicion08() {
    while (true) {
        try {
            print("Ingrese la puntuación: ")
            val puntos = readln().toFloatOrNull() ?: continue

            if (puntos <= -1) {
                println("¡Estás Quemao!")
            } else {
                val nivel: String
                val dinero: Float
                if (puntos == 0f) {
                    nivel = "inaceptable"
                    dinero = 0f
                } else if (puntos <= 0.4) {
                    nivel = "Aceptable"
                    dinero = 2400 * puntos
                } else {
                    nivel = "Meritorio"
                    dinero = 4800 * puntos
                }
                println("Tu nivel de rendimiento es $nivel")
                println("Recibirás $dinero €")
                break
            }
        } catch (e: NumberFormatException) {
            println("ERROR: eso no es un formato numérico...")
        }
    }
}
fun ejCondicion10() {
    print("¿Quiere una pizza vegetariana? (Sí/No): ")
    val veggy = readln().lowercase()

    if (veggy == "si") {
        println("Ingredientes vegetarianos disponibles: Pimiento y Tofu")
        print("Elige un ingrediente (Pimiento o Tofu): ")
        val ingrediente =
            readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

        if (ingrediente in listOf("Pimiento", "Tofu")) {
            println("Pizza vegetariana con Mozzarella, Tomate y $ingrediente")
        } else {
            println("Ese ingrediente no está disponible.")
        }
    } else {
        println("Ingredientes no vegetarianos disponibles: Peperoni, Jamón y Salmón")
        print("Elige un ingrediente (Peperoni, Jamón o Salmón): ")
        val ingrediente =
            readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

        if (ingrediente in listOf("Peperoni", "Jamón", "Salmón")) {
            println("Pizza no vegetariana con Mozzarella, Tomate y $ingrediente")
        } else {
            println("Ese ingrediente no está disponible.")
        }
    }
}

fun ejIterativa02() {
    print("Cual es tu edad? ")
    var edad = readln().toIntOrNull() ?: 0

    while (edad <= 0) {
        println("Coloca una edad válida")
        print("¿Cuál es tu edad? ")
        edad = readln().toIntOrNull() ?: 0
    }
    for (a in 1..edad) {
        println("Has cumplido $a años")
    }
}
fun ejIterativa04() {
    print("Ingrese el Numero: ")
    val num2 = readln().toIntOrNull() ?:0

    if (num2 < 0) {
        println("El número ingresado no es positivo")
    } else {
        val cuentaAtras = (num2 downTo 0).toList()
        val atras = cuentaAtras.joinToString(", ")
        println("Cuenta regresiva: $atras")
    }
}
fun ejIterativa06() {
    print("Ingrese el número entero: ")
    val num = readln().toIntOrNull() ?: 0

    for (i in 1..num) {
        println("*".repeat(i))
    }
}
fun ejIterativa07() {
    print("Ingrese el multiplicando (factor): ")
    val num1 = readln()

    if (num1.isNotEmpty()) {
        val multiplicando = num1.toInt()
        println("Tabla de multiplicar del $multiplicando")
        for (i in 1..10) {
            val resultado = multiplicando * i
            println("$multiplicando x $i = $resultado")
        }
    } else {
        for (i in 1..10) {
            println("Tabla de multiplicar del $i")
            for (k in 1..10) {
                val resultado = i * k
                println("$i x $k = $resultado")
            }
        }
    }
}
fun ejIterativa08() {
    print("Ingrese el número entero: ")
    val num = readln().toIntOrNull() ?: 0

    for (i in 1..num) {
        var j = i
        while (j >= 1) {
            print("$j ")
            j -= 2
        }
        println()
    }
}
fun ejIterativa13() {
    while (true){
    print("Ingrese la frase a repetir: ")
        val frase = readln()
        if (frase.lowercase() == "salir") {
            break
        } else {
            println("Eco $frase")
        }
    }
}
fun ejIterativa15() {
    var sumatoriaPositivos = 0

    while (true) {
        try {
            print("Ingresa un número entero (o 0 para terminar): ")
            val entrada = readln()
            val numero = entrada.toInt()

            if (numero == 0) {
                break
            }

            if (numero > 0) {
                sumatoriaPositivos += numero
            }

        } catch (e: NumberFormatException) {
            println("¡Error! Por favor, ingresa un número entero válido.")
        }
    }

    println("La sumatoria de los números positivos ingresados es: $sumatoriaPositivos")
}
fun ejIterativa18() {
    var numerosPares = 0

    while (true) {
        print("Ingresa un número entero positivo (o -1 para terminar): ")
        var numero = readln().toIntOrNull() ?: 0

        if (numero == -1) {
            break
        }

        while (numero <= 0) {
            println("Por favor, ingresa un número entero positivo.")
            print("Ingresa un número entero positivo: ")
            numero = readln().toIntOrNull() ?: 0
        }

        val sumaDigitos = numero.toString().map { it.toString().toInt() }.sum()

        println("La suma de los dígitos de $numero es: $sumaDigitos")

        if (numero % 2 == 0) {
            numerosPares++
        }
    }

    println("Total de números pares ingresados: $numerosPares")

}
fun ejIterativa19() {
    while (true) {
        println("Menú:")
        println("1- Comenzar programa")
        println("2- Imprimir listado")
        println("3- Finalizar programa")

        print("Seleccione una opción (1, 2 o 3): ")
        val opcion = readln()

        when (opcion) {
            "1" -> println("Comenzando el programa...")
            "2" -> println("Imprimiendo listado...")
            "3" -> {
                println("Finalizando programa. ¡Hasta luego!")
                return
            }
            else -> println("Opción incorrecta. Por favor, elija 1, 2 o 3.")
        }
    }
}

fun ejExepciones02() {
    while (true) {
        try {
            print("Ingresa un número entero positivo: ")
            val num1 = readln().toIntOrNull()

            if (num1 != null && num1 > 0) {
                val impares = (1..num1).filter { it % 2 != 0 }.joinToString(", ")
                println("Números impares desde 1 hasta $num1: $impares")
                break
            } else {
                println("El número ingresado no es positivo. Por favor, ingresa un número entero positivo.")
            }

        } catch (e: NumberFormatException) {
            println("ERROR: El dígito ingresado no es válido. (￣︿￣*()")
        }
    }
}
fun ejExepciones03() {
    while (true) {
        try {
            print("Ingrese el número: ")
            val num2 = readln().toIntOrNull()

            if (num2 != null && num2 >= 0) {
                val cuentaRegresiva = (num2 downTo 0).joinToString(", ")
                println("Cuenta regresiva: $cuentaRegresiva")
                break
            } else {
                println("El número ingresado no es positivo. Por favor, ingresa un número entero positivo.")
            }
        } catch (e: NumberFormatException) {
            println("ERROR: Formato no admitido. Inténtalo de nuevo")
        }
    }
}
fun ejExepciones04() {
    val scanner = Scanner(System.`in`)

    while (true) {
        try {
            print("Ingresa el número entero: ")
            val num = scanner.nextInt()
            println("Has ingresado el número: $num")
            break
        } catch (e: InputMismatchException) {
            println("La entrada no es correcta")
            scanner.next() // Limpiar el buffer del scanner
        }
    }
}