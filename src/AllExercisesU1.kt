fun ejercicio4() {
    // Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
    print("Dame la temperatura en Celsius: ")
    val num: Int = readln().toInt()

    val temperaturaFahrenheit = (num * 9 / 5) + 32
    println("La temperatura convertida en Fahrenheit es: $temperaturaFahrenheit")
}
fun ejercicio6() {
    print("Ingrese el importe final del artículo: ")
    val importeFinal: Double = readln().toDoubleOrNull() ?: 0.0

    val iva = importeFinal * 0.1

    val sinIVA = importeFinal - iva


    println("Importe sin IVA: $sinIVA")
    println("IVA pagado: $iva")
}
fun ejercicio12(){
    print("Ingrese su peso en kg: ")
    val peso: Double = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese su estatura en metros: ")
    val estatura: Double = readln().toDoubleOrNull() ?: 0.0

    val imc = peso / (estatura * estatura)

    println("Tu índice de masa corporal es: $imc")
}
fun ejercicio15(){
    print("Ingresa la cantidad de dinero ingresado en la cuenta: ")
    val cuenta: Int = readln().toIntOrNull() ?:0

    val intereses = 0.4

    val ahorros1 = cuenta * (1 + intereses)
    val ahorros2 = cuenta * (1 + intereses)
    val ahorros3 = cuenta * (1 + intereses)

    print("Primer año: $ahorros1")
    print("Segundo año: $ahorros2")
    print("Tercer año: $ahorros3")
}
fun ejercicio18(){
    print("Ingrese su nombre: ")
    val nombre: String = readln()

    if(nombre.isNotBlank()) {
        println("En Mayuscula: ${nombre.uppercase()}")
        println("En Minuscula: ${nombre.lowercase()}")
        println("Las iniciales: ${nombre.replaceFirstChar { it.uppercase() }}")

    } else {
        println("No has introducido ningun nombre")
    }
}
fun ejercicio20(){
    print("Ingrese un número de teléfono con formato +34-XXXXXXXXX-XX: ")
    val telefono = readln()

    val numeroSinPrefijoExt = telefono.substring(4, telefono.length - 3)

    println("Número de teléfono sin prefijo ni extensión: $numeroSinPrefijoExt")
}
fun ejercicio21(){
    print("Ingrese una frase: ")
    val frase = readln()

    val fraseInvertida = frase.reversed()

    println("Frase invertida: $fraseInvertida")

}
fun ejercicio22(){
    print("Ingrese una frase: ")
    val frase = readln()

    print("Ingrese una vocal: ")
    val vocal = readln().firstOrNull()

    val fraseModificada = frase.replace(vocal.toString().lowercase(), vocal.toString().uppercase())

    println("Frase con la vocal en mayúscula: $fraseModificada")

}
fun ejercicio24(){
    print("Ingrese el precio del producto en euros (con dos decimales): ")
    val precio = readln().toFloatOrNull() ?: 0.0f

    val euros = precio.toInt()
    val centimos = ((precio - euros) * 100).toInt()

    println("Número de euros: $euros")
    println("Número de céntimos: $centimos")
}
fun ejercicio25(){
    print("Ingrese su fecha de nacimiento en formato dd/mm/aaaa: ")
    val fechaNacimiento = readln()

    val (day, month, year) = fechaNacimiento.split('/')

    println("Día: $day")
    println("Mes: $month")
    println("Año: $year")
}
fun ejercicio26(){

    print("Ingrese los productos de la cesta de compra separados por comas: ")
    val compras = readln()

    val productos = compras.split(",")

    for (producto in productos) {
        println(producto.trim())
    }

}
fun ejercicio27(){
    print("Ingrese el nombre del producto: ")
    val nombreProducto = readln()

    print("Ingrese el precio unitario del producto: ")
    val precioUnitario = readln().toFloatOrNull() ?: 0.0f

    print("Ingrese el número de unidades: ")
    val unidades = readln().toIntOrNull() ?: 0

    val costeTotal = precioUnitario * unidades

    println("Nombre del producto: $nombreProducto")
    println("Precio unitario: $precioUnitario")
    println("Número de unidades: $unidades")
    println("Coste total: $costeTotal")
}