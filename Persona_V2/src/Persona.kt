class Persona(var nombre: String, var edad: Int) {
    constructor(nombre: String, edad: String) : this(nombre, edad.toInt())

    fun celebrarCumple(){
        edad++
        println("$nombre ha celebrado su cumpleaños. Ahora tiene $edad años.")
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
}