import java.util.*


fun main() {

    //Condition NOT
    print ("Msukan Nilai anda: ")

    var nilai = Scanner(System.`in`).nextInt()
    println("Condition NOT")
    val kkm = 75
    val tuntas : Boolean = nilai >= kkm

    if(!tuntas){
        println("Nilai anda $nilai, Silahkan remidi")
    }else{
        println("Anda $nilai, Selamat!!")
    }


    //nganu
    val result = if (nilai > 90){
        'A'
    }else if (nilai > 80){
        'B'
    }else if (nilai > 70){
        'C'
    }else if (nilai > 60){
        'D'
    }else {
        'E'
    }

    print("Nilai anda $result")
}


