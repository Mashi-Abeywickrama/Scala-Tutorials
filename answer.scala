//Encryption
def E(c:Char,shifts:Int,a:String) : Char= {
    a((a.indexOf(c.toUpper)+shifts)%a.size)
}

//Decription
def D(c:Char,shifts:Int,a:String) : Char = {
    a(((a.indexOf(c.toUpper)-shifts)%a.size))
}
//Cipher function which takes Encryption and Decryption functions to process
def Cipher (algo:(Char,Int,String) => Char,s:String,shifts:Int,a:String) = {
    s.map(algo(_,shifts,a))
}


@main
def run() = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val s = "Mashi"
    var encryptMsg=Cipher(E,s,2,alphabet)
    println(encryptMsg)
    val decryptMsg=Cipher(D,encryptMsg,2,alphabet)
    println(decryptMsg)
}