

fun main() {
    /**Agregar los valores no mutables del triangulo*/
    val rectangulo1 = Rectangulo(5.0, 3.0)
    val rectangulo2 = Rectangulo(7.0, 4.0)
    val rectangulo3 = Rectangulo(12.0, 4.0)

    /**ahora mostrar el area y el perimetro */
    println("$rectangulo1")
    println("Area: ${rectangulo1.calcularArea()}, Perimetro: ${rectangulo1.calcularPerimetro()}")
    println("$rectangulo2")
    println("Area: ${rectangulo2.calcularArea()}, Perimetro: ${rectangulo2.calcularPerimetro()}")
    println("$rectangulo3")
    println("Area: ${rectangulo3.calcularArea()}, Perimetro: ${rectangulo3.calcularPerimetro()}")

    /**Agregar los valores no mutables de persona*/
    val persona1 = Persona(70.0, 1.75)
    val persona2 = Persona("juan",80.0,1.80)
    val persona3 = Persona("Maria",65.0, 1.60)

    persona1.modificarNombre("Pedro")
    println(persona1)

    persona3.mostrarPesoAlturaImc()
    persona3.modificarAltura(1.80)
    persona3.mostrarPesoAlturaImc()

    persona2.modificarAltura(persona3.altura)
    println(persona2)
    println(persona3)
    println("$persona2 es igual a $persona3 ")
}