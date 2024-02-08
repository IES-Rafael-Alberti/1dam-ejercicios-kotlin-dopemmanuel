class Persona(var nombre: String, var peso: Double, var altura: Double) {
    var imc: Double = peso / (altura * altura)

    init {
        this.imc = this.peso / (this.altura * this.altura)
    }
    constructor(nombre: String) : this(nombre,0.0, 0.0)

    override fun toString(): String {
        return "Persona(nombre='$nombre', peso=$peso kg, altura=$altura m, IMC=$imc)"
    }
    constructor(nombre: String, peso: Int, altura: Int) : this(nombre,peso.toDouble(), altura.toDouble())
}