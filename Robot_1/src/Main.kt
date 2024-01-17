class Robot(val nombre: String) {
    var posX: Int = 0
    var posY: Int = 0
    var dir: Int = 0

    fun mover(movimientos: IntArray) {
        for (valor in movimientos) {
            when (this.dir) {
                0 -> this.posY += valor
                1 -> this.posX -= valor
                2 -> this.posY -= valor
                3 -> this.posX += valor
            }
            if (this.dir < 3) this.dir += 1 else this.dir = 0
        }
    }

    fun mostrarPosicion() {
        val orientacion = orientacionRobot(this.dir)
        println("$nombre está en ($posX, $posY) $orientacion")
    }

    private fun orientacionRobot(dir: Int) = when (dir) {
        0 -> "PositiveY"
        1 -> "NegativeX"
        2 -> "NegativeY"
        3 -> "PositiveX"
        else -> ""
    }
}

fun main() {
    val robot1 = Robot("R2D2")

    val movimientos = arrayOf(
        intArrayOf(10, 2, -2),
        intArrayOf(0, 0, 0),
        intArrayOf(),
        intArrayOf(-10, -5, 2),
        intArrayOf(-10, -5, 2, 4, -8)
    )

    for (movimiento in movimientos) {
        robot1.mover(movimiento)
        robot1.mostrarPosicion()
    }
}
