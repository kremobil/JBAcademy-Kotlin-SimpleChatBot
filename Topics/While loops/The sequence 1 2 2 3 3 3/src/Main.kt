fun main() {
    // put your code here
    var inputNumber: Int = readln().toInt()
    var increment: Int = 0
    while (inputNumber > 0) {
        for (number in 1..++increment) {
            print("$increment ")
            inputNumber--
            if (inputNumber == 0) {
                break
            }
        }
    }
}