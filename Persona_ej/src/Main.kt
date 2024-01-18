import java.util.*

class Persona(var nombre: String, var peso: Double, var altura: Double) {
    var imc: Double = peso / (altura * altura)

    init {
        this.imc = this.peso / (this.altura * this.altura)
    }

    fun obtenerImc() = "%.2f".format(this.imc)

    fun estadoImc(): String {
        val imc = obtenerImc().toDouble()
        return when {
            imc < 18.5 -> "Bajo de peso"
            imc < 24.9 -> "Saludable"
            imc < 29.9 -> "Sobrepeso"
            else -> "Obesidad"
        }
    }

    fun mostrarDesc() {
        val imc = obtenerImc()
        val estado = estadoImc()

        println("$nombre con una altura de $altura m y un peso de $peso kg tiene un IMC de $imc, categorizado como $estado.")
    }

    fun saludar() {
        println("Hola, Soy $nombre ")
    }
}

fun main() {
    /**Constructor primario*/
    val persona1 = Persona("Juan", 70.5, 1.75)
    val persona2 = Persona("María", 65.2, 1.68)

    /**Constructor secundario
     * System.`in`: es como un readln() y pero este va leyendo por letras. Y System.`out`permite que se puedan imprimir dos mensajes de variables separadas imprimirse en la misma linea*/
    val scanner = Scanner(System.`in`)
    print("Ingrese el nombre para persona1: ")
    val nuevoNombre = scanner.nextLine()
    persona1.nombre = nuevoNombre

    /**Información de persona2*/
    println("Persona2: Nombre - ${persona2.nombre}, Peso - ${persona2.peso} kg, Altura - ${persona2.altura} m")

    /**Actualizar el IMC de persona3*/
    val persona3 = Persona("Pedro", 80.0, 1.80)
    println("Persona3: Nombre - ${persona3.nombre}, IMC - ${persona3.imc}")

    persona1.saludar()
    persona2.saludar()

    persona1.mostrarDesc()
    persona2.mostrarDesc()
}
