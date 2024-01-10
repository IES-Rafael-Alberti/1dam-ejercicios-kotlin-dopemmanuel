fun main() {





    var r2d2pos: List<Int> = moverRobot(10, 5, -2)
    println("X: ${r2d2pos[0]}, Y: ${r2d2pos[1]}, dir: ${orientacionrobot(r2d2pos[2])}")

    r2d2pos = moverRobot(0, 0, 0)
    println("X: ${r2d2pos[0]}, Y: ${r2d2pos[1]}, dir: ${orientacionrobot(r2d2pos[2])}")

    r2d2pos = moverRobot()
    println("X: ${r2d2pos[0]}, Y: ${r2d2pos[1]}, dir: ${orientacionrobot(r2d2pos[2])}")

    r2d2pos = moverRobot(10, -5, -2)
    println("X: ${r2d2pos[0]}, Y: ${r2d2pos[1]}, dir: ${orientacionrobot(r2d2pos[2])}")

    r2d2pos = moverRobot(-10, -5, 2, 4, -8)
    println("X: ${r2d2pos[0]}, Y: ${r2d2pos[1]}, dir: ${orientacionrobot(r2d2pos[2])}")
}

fun orientacionrobot(dir: Int) = when (dir) {

    0 -> "POSITIVOY"
    1 -> "NEGATIVOX"
    2 -> "NEGATIVOY"
    3 -> "POSITIVOX"
    else ->""
}

//Descripcion:
//@param movs List<Int> lista de movimientoms que debe realizar el robot.
fun moverRobot(vararg movs: Int): List<Int> {

    var posX = 0
    var posY = 0
    var dir = 0


    for (pasos in movs) {

        when (dir) {
            0 -> posY += pasos
            1 -> posX -= pasos
            2 -> posY -= pasos
            3 -> posX += pasos
        }
        if (dir == 3) dir = 0 else dir++

    }
    return listOf(posX, posY, dir)

}
/**object R2D2 {
    var posX = 0
    var posY = 0
}*/
