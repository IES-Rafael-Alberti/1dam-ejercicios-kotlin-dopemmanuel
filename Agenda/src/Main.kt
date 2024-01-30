import java.io.File

fun main() {

    /*
    val directorioActual = System.getProperty("user.dir")
    println("Directorio actual: $directorioActual")
    */

    val nombreArchivo = "contactos.csv" //Ruta y nombre del fichero a leer... en este ejemplo lo he ubicado directamente en el directorio actual dónde comienza la ejecución.

    val contactos = mutableListOf<Map<String, Any>>()

    try {
        for (linea in File(nombreArchivo).readLines()){
            val datos = linea.split(";")

            val contacto = mapOf(
                "nombre" to datos[0],
                "apellido" to datos[1],
                "email" to datos[2],
                "telefonos" to datos.subList(3, datos.size)
            )
            contactos.add(contacto)
        }
    } catch (e: Exception) {
        println("Error al leer el archivo: ${e.message}")
    }

    //Otra forma de hacer lo mismo...
    /*
    try {
        File(nombreArchivo).forEachLine { linea ->
            val datos = linea.split(";")
            val persona = mapOf(
                "nombre" to datos.getOrElse(0) { "" },
                "apellido" to datos.getOrElse(1) { "" },
                "email" to datos.getOrElse(2) { "" },
                "telefonos" to datos.subList(3, datos.size)
            )
            contactos.add(persona)
        }
    } catch (e: Exception) {
        println("Error al leer el archivo: ${e.message}")
    }
    */
}