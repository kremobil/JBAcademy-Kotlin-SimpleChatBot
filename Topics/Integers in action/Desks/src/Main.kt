fun main() {
    // put your code here
    val num1: UInt = readln().toUInt()
    val num2: UInt = readln().toUInt()
    val num3: UInt = readln().toUInt()

    val desks: UInt = (num1 % 2u + num1 / 2u) + (num2 % 2u + num2 / 2u) + (num3 % 2u + num3 / 2u)
    println(desks)
}