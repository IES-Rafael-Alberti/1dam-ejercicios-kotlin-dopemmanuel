import java.util.*
import kotlin.math.sqrt
import kotlin.math.pow
fun listas04(){
    print("Introduce los números ganadores separados por espacios: ")
    val numerosGanadores = readln()

    val listaNumeros = numerosGanadores.split(" ").map { it.toInt() }.toMutableList()

    listaNumeros.sort()

    println("Números ganadores ordenados de menor a mayor:")
    listaNumeros.forEach { println(it) }
}
fun listas06(){

    val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val asignaturasPendientes = mutableListOf<String>()


    for (asignatura in asignaturas) {
        print("¿Qué nota has sacado en $asignatura? ")
        val nota = readln().toFloatOrNull() ?: 0f
        if (nota < 5.0) {
            asignaturasPendientes.add(asignatura)
        }
    }
    println("Tienes que repetir las siguientes asignaturas:")
    for (asignatura in asignaturasPendientes) {
        println(asignatura)
    }
}
fun listas08(){
    print("Ingresa una palabra: ")
    val palabra = readln()

    if (palabra == palabra.reversed()) {
        println("$palabra es un palíndromo")
    } else {
        println("$palabra no es un palíndromo")
    }
}
fun listas09(){
    val scanner = Scanner(System.`in`)


    println("Por favor, ingresa una palabra: ")
    val palabra = scanner.nextLine().lowercase()

    var contadorA = 0
    var contadorE = 0
    var contadorI = 0
    var contadorO = 0
    var contadorU = 0

    for (letra in palabra) {
        when (letra) {
            'a' -> contadorA++
            'e' -> contadorE++
            'i' -> contadorI++
            'o' -> contadorO++
            'u' -> contadorU++
        }
    }


    println("La vocal 'a' aparece $contadorA veces.")
    println("La vocal 'e' aparece $contadorE veces.")
    println("La vocal 'i' aparece $contadorI veces.")
    println("La vocal 'o' aparece $contadorO veces.")
    println("La vocal 'u' aparece $contadorU veces.")

}
fun listas10(){
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)

    val precioMinimo = precios.minOrNull()
    val precioMaximo = precios.maxOrNull()

    println("El precio más bajo es: $precioMinimo")
    println("El precio más alto es: $precioMaximo")
}
fun listas13(){
    print("Introduce una muestra de números separados por comas: ")
    val input = readln()

    val numeros = input.split(",").map { it.trim().toDouble() }

    val media = numeros.average()

    val desviacionTipica = sqrt(numeros.fold(0.0) { acumulador, siguiente -> acumulador + (siguiente - media).pow(2) } / (numeros.size - 1))

    println("La media es: $media")
    println("La desviación típica es: $desviacionTipica")
}

fun diccionario03(){
    val preciosFrutas = mapOf(
        "Plátano" to 1.35,
        "Manzana" to 0.80,
        "Pera" to 0.85,
        "Naranja" to 0.70
    )

    print("Introduce una fruta: ")
    val fruta = readln()


    if (preciosFrutas.containsKey(fruta)) {
        print("Introduce el número de kilos: ")
        val cantidadKilos = readln().toDoubleOrNull() ?: 0.0


        val precioTotal = preciosFrutas[fruta]!! * cantidadKilos
        println("El precio de $cantidadKilos kilos de $fruta es: $precioTotal")
    } else {
        println("Lo siento, la fruta ingresada no está en la lista.")
    }
}
fun diccionario05(){
    val creditosAsignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)

    for ((asignatura, creditos) in creditosAsignaturas) {
        println("$asignatura tiene $creditos créditos")
    }

    val totalCreditos = creditosAsignaturas.values.sum()
    println("El número total de créditos del curso es: $totalCreditos")
}
fun diccionario06(){

    val infoPersona = mutableMapOf<String, String>()

    while (true) {

        print("Introduce el tipo de información (o 'fin' para terminar): ")
        val clave = readln()


        if (clave.lowercase() == "fin" || clave.lowercase() == "salir") {
            break
        }

        print("Introduce el valor para $clave: ")
        val valor = readln()

        infoPersona[clave] = valor

        println("Contenido del diccionario:")
        for ((k, v) in infoPersona) {
            println("$k: $v")
        }
        println()
    }
}
fun diccionario07(){
    val cestaCompra = mutableMapOf<String, Double>()

    while (true) {
        print("Introduce el nombre del artículo (o 'fin' para terminar): ")
        val articulo = readln()

        if (articulo.lowercase() == "fin") {
            break
        }

        print("Introduce el precio del artículo: ")
        val precio = readln().toDoubleOrNull() ?: 0.0


        cestaCompra[articulo] = precio
    }

    // Mostrar la lista de la compra y el coste total
    println("Lista de la compra:")
    var totalCoste = 0.0

    for ((articulo, precio) in cestaCompra) {
        println("$articulo\t\t$precio")
        totalCoste += precio
    }

    println("\nTotal\t\t$totalCoste")
}
fun diccionario08(){

    val diccionario = mutableMapOf<String, String>()

    print("Introduce las palabras en español e inglés (ejemplo: casa:house, perro:dog): ")
    val entradaUsuario = readln()

    val pares = entradaUsuario.split(',').map { it.trim().split(':') }

    for (par in pares) {
        if (par.size == 2) {
            val palabraEspanol = par[0].trim()
            val palabraIngles = par[1].trim()
            diccionario[palabraEspanol] = palabraIngles
        }
    }

    print("Introduce una frase en español: ")
    val fraseEspanol = readln()

    val palabras = fraseEspanol.split(" ")
    val fraseTraducida = palabras.map { diccionario[it] ?: it }


    println("Frase traducida:")
    println(fraseTraducida.joinToString(" "))
}
fun diccionario10(){
    val baseDatosClientes = mutableMapOf<String, MutableMap<String, Any>>()

    while (true) {
        println("Menú:")
        println("(1) Añadir cliente")
        println("(2) Eliminar cliente")
        println("(3) Mostrar cliente")
        println("(4) Listar todos los clientes")
        println("(5) Listar clientes preferentes")
        println("(6) Terminar")

        print("Selecciona una opción (1-6): ")
        val opcion = readln()

        when (opcion) {
            "1" -> {
                print("Introduce el NIF del cliente: ")
                val nif = readln().takeIf { it.isNotBlank() }
                if (nif != null) {
                    print("Introduce el nombre del cliente: ")
                    val nombre = readln()
                    print("Introduce la dirección del cliente: ")
                    val direccion = readln()
                    print("Introduce el teléfono del cliente: ")
                    val telefono = readln()
                    print("Introduce el correo del cliente: ")
                    val correo = readln()
                    print("¿Es cliente preferente? (Sí/No): ")
                    val preferente = readln().equals("Sí", ignoreCase = true)

                    val datosCliente = mutableMapOf<String, Any>(
                        "Nombre" to nombre,
                        "Dirección" to direccion,
                        "Teléfono" to telefono,
                        "Correo" to correo,
                        "Preferente" to preferente
                    )

                    baseDatosClientes[nif] = datosCliente
                    println("Cliente añadido con éxito.")
                } else {
                    println("NIF no válido. Introduce un valor válido.")
                }
            }
            "2" -> {
                print("Introduce el NIF del cliente a eliminar: ")
                val nifEliminar = readln()
                if (baseDatosClientes.containsKey(nifEliminar)) {
                    baseDatosClientes.remove(nifEliminar)
                    println("Cliente eliminado con éxito.")
                } else {
                    println("Cliente no encontrado en la base de datos.")
                }
            }
            "3" -> {
                print("Introduce el NIF del cliente a mostrar: ")
                val nifMostrar = readln()
                if (baseDatosClientes.containsKey(nifMostrar)) {
                    println("Datos del cliente (NIF: $nifMostrar):")
                    baseDatosClientes[nifMostrar]?.forEach { (clave, valor) ->
                        println("$clave: $valor")
                    }
                } else {
                    println("Cliente no encontrado en la base de datos.")
                }
            }
            "4" -> {
                println("Lista de todos los clientes:")
                baseDatosClientes.forEach { (nif, datosCliente) ->
                    println("NIF: $nif, Nombre: ${datosCliente["Nombre"]}")
                }
            }
            "5" -> {
                println("Lista de clientes preferentes:")
                baseDatosClientes.forEach { (nif, datosCliente) ->
                    if (datosCliente["Preferente"] == true) {
                        println("NIF: $nif, Nombre: ${datosCliente["Nombre"]}")
                    }
                }
            }
            "6" -> {
                println("Programa terminado.")
                return
            }
            else -> {
                println("Opción no válida. Introduce un número del 1 al 6.")
            }
        }
    }
}


fun conjuntos01(compras: List<List<Any>>): List<String>{
    val domicilios = mutableSetOf<String>()
    val clientesDomicilios = mutableMapOf<String, String>()

    for (compra in compras) {
        val cliente = compra[0] as String
        val domicilio = compra[3] as String

        if (!clientesDomicilios.containsKey(cliente)) {
            clientesDomicilios[cliente] = domicilio
            domicilios.add(domicilio)
        }
    }
    return domicilios.toList()
}
fun conjuntos01data(){
    val comprasEjemplo = listOf(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699.0, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958.0, "Mirasol 218")
    )

    val domiciliosFacturacion = conjuntos01(comprasEjemplo)
    println(domiciliosFacturacion)
}
fun conjuntos02(): Set<String> {
    val nombres = mutableSetOf<String>()
    print("Introduce el nombre (o 'x' para finalizar): ")
    var nombre =
        readln().trim().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    while (nombre != "x") {
        nombres.add(nombre)
        print("Introduce el nombre (o 'x' para finalizar): ")
        nombre = readln().trim()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }

    return nombres
}
fun conjuntos02data() {
    println("=== Alumnos de Primaria ===")
    val primaria = conjuntos02()

    println("\n=== Alumnos de Secundaria ===")
    val secundaria = conjuntos02()

    println("\n=== Nombres sin repeticiones ===")
    val todosLosNombres = primaria.union(secundaria)
    println(todosLosNombres)

    println("\n=== Nombres que se repiten ===")
    val nombresRepetidos = primaria.intersect(secundaria)
    println(nombresRepetidos)

    println("\n=== Nombres de Primaria no repetidos en Secundaria ===")
    val nombresPrimariaNoRepetidos = primaria.subtract(secundaria)
    println(nombresPrimariaNoRepetidos)

    println("\n=== Todos los nombres de Primaria están incluidos en Secundaria ===")
    val todosEnSecundaria = primaria.containsAll(secundaria)
    println(todosEnSecundaria)
}
fun conjuntos03(s: Set<Int>): List<Set<Int>>{
    val potencia = mutableListOf<Set<Int>>(emptySet())

    for (elemento in s) {
        val nuevosSubconjuntos = potencia.map { it.union(setOf(elemento)) }
        potencia.addAll(nuevosSubconjuntos)
    }

    return potencia
}
fun conjuntos03data() {
    // Ejemplo de uso:
    val conjuntoEjemplo = setOf(6, 1, 4)
    val resultado = conjuntos03(conjuntoEjemplo)
    println(resultado)
}
fun conjuntos04(){
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    val frutasComunes = setFrutas1.intersect(setFrutas2)

    val frutasSoloEnFrutas1 = setFrutas1.subtract(setFrutas2)

    val frutasSoloEnFrutas2 = setFrutas2.subtract(setFrutas1)

    println("Frutas comunes: $frutasComunes")
    println("Frutas solo en frutas1: $frutasSoloEnFrutas1")
    println("Frutas solo en frutas2: $frutasSoloEnFrutas2")
}
fun conjuntos05(){
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }.toSet()

    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()

    val paresYMultiplosDeTres = pares.intersect(multiplosDeTres)

    println("Conjunto de números pares: $pares")
    println("Conjunto de números múltiplos de tres: $multiplosDeTres")
    println("Intersección entre pares y múltiplos de tres: $paresYMultiplosDeTres")
}
fun conjuntos06(){
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val alfabeto = ('a'..'z').toSet()
    val consonantes = alfabeto.subtract(vocales)

    val letrasComunes = vocales.intersect(consonantes)

    println("Conjunto de consonantes: $consonantes")
    println("Conjunto de letras comunes: $letrasComunes")
}