fun sum(num: Int): Int {
    var sum = 0
    var number = num
    while (number > 0) {
        sum += number % 10
        number /= 10
    }
    return sum
}


fun mas(K: Int, N: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 1..N) {
        if (sum(i) == K) {
            result.add(i)
        }
    }

    return result
}

fun main() {
    print("Введите значение K (сумма цифр): ")
    val K = readLine()?.toIntOrNull() ?: 0
    print("Введите значение N (максимальное число): ")
    val N = readLine()?.toIntOrNull() ?: 0
    if (K > 0 && N > 0) {
        val array = mas(K, N)
        println("Числа, сумма цифр которых равна $K и которые не больше $N: ${array.joinToString()}")
    } else {
        println("Ошибка: необходимо вводить положительные целые числа для K и N.")
    }
}
