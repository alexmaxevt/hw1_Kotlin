fun main() {
    val amount = 200
    val total = 11_000
    println("% с продаж с флагом эксклюзивности: " + calculateFee(amount, total, true))
    println("% с продаж без флага эксклюзивности: " + calculateFee(amount, total, false))
}

fun calculateFee ( amount: Int, total: Int, exclusive: Boolean): Int {
    if (exclusive) {
        when (total) {
            in 0..1000 -> return (amount/100)*25
            in 1001..10000 -> return (amount/100)*20
            in 10001..50000 -> return (amount/100)*15
            else -> return (amount/100)*10
        }
    }
    else {
        when (total) {
            in 0..1000 -> return (amount/100)*30
            in 1001..10000 -> return (amount/100)*25
            in 10001..50000 -> return (amount/100)*20
            else -> return (amount/100)*15
        }
    }
}