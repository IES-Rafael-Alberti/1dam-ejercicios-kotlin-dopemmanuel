class rectangulo(val base: Double, var altura: Double) {

    init {
        require(this.base > 0 && this.altura > 0) { "La Base y la altura deben ser mayores que 0." }
    }

    override fun toString(): String {
        return "Rectangulo con base = ${this.base} y altura = ${this.altura}"
    }

    fun area() = altura * base
    fun perimetro() = 2*base + 2*altura
}


fun main() {
    fun pedirValor(atributo: String, mensaje: String){
        print(mensaje)
        val entrada = readln()

        return try {
            entrada.toDouble()
        }

    }
    fun dameRectangulo():
}