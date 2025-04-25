package com.example.functions_hw2.functions

fun main() {
    // fahrenheit
    val c = 25
    val result1 = fahrenheit(c)
    println(result1)

    // perimeter
    val a = 5
    val b =3
    val result2 = perimeter(a,b)
    println("Dikdortgenin cevresi : $result2")

    //Factorial
    val number = 5
    val fact = factorial(number)
    println("$number! = $fact")

    // count a
    val word = "Ankara"
    val numberOfA = countA(word)
    println("Kelimenin içinde $numberOfA tane 'a' harfi var.")

    // İnterior Angels
    val angle_count = 3
    val result3 = interior_angles(angle_count)
    println("Interıor angle = $result3")

    // data usage
    val dataUsage = 65.5
    val fee = calculateDataUsageFee(dataUsage)
    println("Fee for $dataUsage GB: $fee ₺")

    println("30 GB fee: ${calculateDataUsageFee(30.0)} ₺")
    println("50 GB fee: ${calculateDataUsageFee(50.0)} ₺")
    println("51 GB fee: ${calculateDataUsageFee(51.0)} ₺")
    println("75 GB fee: ${calculateDataUsageFee(75.0)} ₺")
}

fun fahrenheit(c: Int): Double {
    val f = c * 1.8 + 32
    return f
}

fun perimeter(a:Int, b:Int): Int {
    val perimeter = (a+b)*2
    return perimeter
}

fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun countA(word: String): Int {
    var count = 0
    for (char in word) {
        if (char == 'a' || char == 'A') {
            count++
        }
    }
    return count
}
fun interior_angles(x:Int): Int{
    val interior =  (x - 2)*180
    return interior

}

fun calculateDataUsageFee(usedGB: Double): Double {
    val baseQuota = 50.0
    val baseFee = 100.0
    val overageFeePerGB = 4.0

    if (usedGB <= baseQuota) {
        return baseFee
    } else {
        val overageAmount = usedGB - baseQuota
        return baseFee + (overageAmount * overageFeePerGB)
    }
}
