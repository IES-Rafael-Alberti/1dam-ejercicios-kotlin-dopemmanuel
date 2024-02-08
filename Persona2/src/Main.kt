

fun main() {
val persona = Persona("Juan","22")
    persona.cumple().also { println("Happy Birthday!!") }

    println("Persona (nombre = ${persona.nombre}, edad = ${persona.edad})")
    println(persona)

    var estudiante = Estudiante("", "", "Derecho")
    println(estudiante)

}