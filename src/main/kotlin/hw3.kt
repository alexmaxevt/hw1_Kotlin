import java.util.*

val scan = Scanner(System.`in`)

fun main() {
    while (true) {
        println("Введите время (сек), которое хотите перевечти в человекопонятное представление, для завершения работы программы введите \'end\':")
        val enter: String = scan.nextLine()
        if ("end" == enter) {
            break;
        }
        else {
            try {
                val seconds: Int = enter.toInt()
                print("Опубликовано")
                println(timeIsWords(seconds))
            }
            catch (nfe: NumberFormatException) {
                println("Введите число секунд")
            }
        }
    }
}

fun timeIsWords (seconds: Int) {
    val months: Int = (((seconds / 60) / 60) / 24) / 30
    val days: Int = ((seconds / 60) / 60) / 24
    val hours: Int = (seconds / 60) / 60
    val minutes: Int = seconds / 60
    val strMonths: String = " $months месяцев назад"
    val strMonth: String = " $months месяца назад"
    val strDays: String = " $days суток назад"
    val strHours: String = " $hours часов назад"
    val strHour: String = " $hours часа назад"
    val strMinutes: String = " $minutes минут назад"
    when (seconds) {
        in 0..59 -> println(" менее минуты назад")
        in 60..119 -> println(" минуту назад")
        in 120..3599 -> println(strMinutes)
        in 3600..7199 -> println(" час назад")
        in 7200..17999 -> println(strHour)
        in 18000..86399 -> println(strHours)
        in 86400..172799 -> println(" сутки назад")
        in 172800..2591999 -> println(strDays)
        in 2592000..5183999 -> println(" месяц назад")
        in 5184000..12959999 -> println(strMonth)
        in 12960000..31103999 -> println(strMonths)
        31104000 -> println(" год назад")
        else -> println(" более года назад")
    }
}