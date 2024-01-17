class Perro(var nombre: String, peso: Int) {

    var raza: String = ""
        get() = field.uppercase()
        set(value) {
            require(value.isNotEmpty()) { "Raza no puede estar vacía" }
            field = value.lowercase()
        }

    var peso: Int = 0

    init {
        this.peso = peso
    }

    private var color: String = ""

    constructor(nombre: String, raza: String, peso: Int) : this(nombre, peso) {
        this.raza = raza
    }

    constructor(nombre: String, raza: String) : this(nombre, 0) {
        this.raza = raza
    }
}

fun main() {
    val perro1 = Perro("Dobby", 10)
    val perro2 = Perro("Fido", "Golden Retriever")
    val perro3 = Perro("Buddy", "German Shepherd", 15)

    println("Perro 1: ${perro1.nombre}, Raza: ${perro1.raza}, Peso: ${perro1.peso}")
    println("Perro 2: ${perro2.nombre}, Raza: ${perro2.raza}, Peso: ${perro2.peso}")
    println("Perro 3: ${perro3.nombre}, Raza: ${perro3.raza}, Peso: ${perro3.peso}")
}
