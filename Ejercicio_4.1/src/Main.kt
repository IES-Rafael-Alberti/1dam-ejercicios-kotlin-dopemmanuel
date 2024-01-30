

fun main() {

    val rectangulo1 = Rectangulo(5.0, 10.0)
    val rectangulo2 = Rectangulo(8.0, 6.0)
    val rectangulo3 = Rectangulo(12.0, 4.0)


    println("$rectangulo1")
    println("$rectangulo2")
    println("$rectangulo3")

    // Mostrar áreas y perímetros
    println("Área del rectángulo 1: ${rectangulo1.calcularArea()}")
    println("Perímetro del rectángulo 1: ${rectangulo1.calcularPerimetro()}")

    println("Área del rectángulo 2: ${rectangulo2.calcularArea()}")
    println("Perímetro del rectángulo 2: ${rectangulo2.calcularPerimetro()}")

    println("Área del rectángulo 2: ${rectangulo2.calcularArea()}")
    println("Perímetro del rectángulo 2: ${rectangulo2.calcularPerimetro()}")
}