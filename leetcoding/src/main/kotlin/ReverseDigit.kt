fun reverseDigit(digit: Int): Int {
    var result= ""
    var tempStore = digit
    while (tempStore!=0){
        result += "${tempStore % 10}"
        tempStore /= 10
    }
    return result.toInt()
}

fun main(args: Array<String>) {
    println(reverseDigit(654993))
}