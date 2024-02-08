import kotlin.math.pow

/**El pow() permite elevar un numero a la potencia.*/
class Persona(private var nombre: String, private var peso: Double, var altura: Double) {
    private var imc: Double = peso / altura.pow(2)

    constructor(peso: Double, altura: Double) : this("", peso, altura)

    override fun toString(): String {
        return "Nombre:$nombre, Peso:$peso kg, altura: $altura m"
    }

    fun modificarNombre(nuevoNombre: String) {
        require(nuevoNombre.isNotBlank()) { "El nombre no puede ser nulo o vacío." }
        nombre = nuevoNombre
    }

    fun mostrarPesoAltura() {
        println("Nombre: $nombre, Peso: $peso kg, Altura: $altura m")
    }

    fun mostrarPesoAlturaImc() {
        println("Peso: $peso kg, Altura: $altura m, IMC: $imc (${obtenerDescImc()})")
    }

    fun modificarAltura(nuevaAltura: Double) {
        require(nuevaAltura > 0) { "La altura debe ser mayor que 0." }
        altura = nuevaAltura
    }

    fun obtenerDescImc(): String {
        return when {
            imc < 18.5 -> "peso insuficiente"
            imc in 18.5..24.9 -> "peso saludable"
            imc in 25.0..29.9 -> "sobrepeso"
            else -> "obesidad"
        }
    }

    fun saludar(): String {
        return "Hola, soy $nombre."
    }


    fun alturaEncimaMedia(): Boolean {
        return altura >= 1.75
    }

    fun pesoEncimaMedia(): Boolean {
        return peso >= 70
    }

}