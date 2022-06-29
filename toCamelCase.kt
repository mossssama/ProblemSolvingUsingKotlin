fun toCamelCase(str:String): String{
    var str=str.replace(Regex("[-,_]")," ")   // Replace _ & -

    var words=str.split(" ").toMutableList()    // Spliting Words
    str=""                                               // Store new String
    var skip=0
    for (word in words) {                                //concatenating words after capitalizing
        if (skip == 0) {str+=word; skip++; continue}     //prevent capitalizing first word
        else str += word.capitalize()
    }
    return str
}