import java.security.Principal

/**fun main() {
    fun businessEmail(s: String): Boolean {
        return s.contains("@") && s.contains("business.com")
    }


    fun isAnEmail(email: (String) -> Boolean) {
        print("Introduzca su Email:")
        if (email(readln())) {
            println("Email de empresa Correcto")
        } else {
            println("Email Incorrecto")
        }
    }

    isAnEmail(::businessEmail)
}*/

//fun List<Int>.filtrer(filtro:(Int) -> Boolean): list<Int>¨{}

fun main(){
    val lista = listOf(77, 9, -1, 90, -5, 0)

    fun List<Int>.filtrer(filtro:(Int) -> Boolean): List<Int>{
        val
    }
    println(lista.filter{ it > 0 }.joinToString {", "})
}