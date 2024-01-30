/**Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro.
Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.
Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)
En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.*/
class Rectangulo(val base: Double, val altura: Double) {

    init {
        require(this.base > 0){"La base tiene que ser mayor que 0"}
    }
    init {
        require(this.altura > 0){"La altura tiene que ser mayor que 0"}
    }

    fun calcularArea(): Double{
        return base * altura
    }

    fun calcularPerimetro(): Double{
        return 2 *(base + altura)
    }
    override fun toString(): String {
        return "Rectángulo [base=$base, altura=$altura]"
    }

}