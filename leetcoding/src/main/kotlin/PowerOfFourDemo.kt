
fun findPowerOfFour( n: Int):Boolean {
    var temp = n
    if(n==0) return false
    while (temp==1) {
        if(temp % 4 !=0) return false
        temp = n / 4
    }
    return true
}

fun main(args: Array<String>) {
    println(findPowerOfFour(5))
}