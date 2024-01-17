@file:Suppress("NAME_SHADOWING")

fun domicilios(compras: List<List<Any>>): List<String> {
    /*
    val domiciliosNoRep = setOf<String>()
    compras.forEach { domiciliosNoRep.add(it[3].toString())}

    return domiciliosNoRep.toList().sorted()
    */

    compras.map { compras -> compras}
}



fun main() {
    val compras = listOf<List<Any>>(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores355"),
        listOf("Julian rodriguez", 5, 12780.78, "Calle Las Flores355"),
        listOf("Jorge Russo", 5, 12780.78, "Calle Las Flores355"),



    )



}