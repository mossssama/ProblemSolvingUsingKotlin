package solution

object ASum {

fun findNb(m: Long):Long {
    var sum=0L
    for (i in 1..m){
        sum+=Math.pow(i.toDouble(),3.0).toLong()
        if (sum>m) break
        else if (sum==m) return i.toLong()
    }
    return -1
}
}