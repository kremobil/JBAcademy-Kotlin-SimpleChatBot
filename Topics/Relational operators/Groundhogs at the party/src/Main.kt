fun main() {
    // write your code here
    val butter: Int = readln().toInt()
    val weekend: Boolean = readln().toBoolean()

    println(!weekend && butter >= 10 && butter <= 20 || weekend && butter >= 15 && butter <= 25)
}
