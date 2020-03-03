import java.util.*
import kotlin.math.pow
val scanner = Scanner(System.`in`)

fun main() {
    print("Введите ваш рост (в метрах): ")
    val height: Double = scanner.nextDouble()
    print("Введите ваш вес (в килограммах): ")
    val weight: Double = scanner.nextDouble()
    val index: Double = bodyMassIndex(height, weight)
    val verdict = when(index) {
        in 0.0..16.0 -> println("Выраженный дефицит массы тела")
        in 16.0..18.5 -> println("Недостаточная (дефицит) масса тела")
        in 18.5..24.99 -> println("Норма")
        in 25.0..30.0 -> println("Избыточная масса тела (предожирение)")
        in 30.0..35.0 -> println("Ожирение")
        in 35.0..40.0 -> println("Ожирение резкое")
        else -> println("Очень резкое ожирение")
    }
    println(verdict)
}

fun bodyMassIndex (height: Double, weight: Double): Double {
    println("Ваш рост (в метрах): $height")
    println("Ваш вес (в килограммах): $weight")
    val I: Double = weight/height.pow(2.0)
    println("Индекс массы вашего тела равен: $I")
    return I
}