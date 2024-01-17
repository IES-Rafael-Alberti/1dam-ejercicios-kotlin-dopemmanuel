import java.util.*

class Persona(var nombre: String, var peso: Double, var altura: Double) {
    var imc: Double = peso / (altura * altura)
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
}