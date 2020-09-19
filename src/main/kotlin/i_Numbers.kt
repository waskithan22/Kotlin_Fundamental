fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    val v = hitungVolume(panjang.toDouble(),lebar,tinggi.toDouble())
    volume = v.toDouble()
    println("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi ini adalah $volume")
}

fun hitungVolume(p : Double, l : Double, t: Double) : Float
{
    val v = p * l * t
    return v.toFloat();
}