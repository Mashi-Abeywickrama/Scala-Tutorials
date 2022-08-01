def toUpper(text:String):String = {
    text.toUpperCase();
}
def toLower(text:String):String = {
    text.toLowerCase();
}
def formatNames(text:String)(indexlist:Int*)(functionToUse: String=>String):String = {
    if (indexlist.isEmpty){
        return functionToUse(text)
    }
    var result = ""
    var i = 0
    while (i<text.length()){
        if (indexlist.contains(i)) {
            result += functionToUse(text.charAt(i).toString)
        }
        else{
            result += text.charAt(i).toString()
        }
        i += 1
    }
    result
}

@main
def run() = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))

}