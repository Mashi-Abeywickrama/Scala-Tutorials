import scala.io.StdIn.readInt;

def interest (amount:Double) : Double = amount match{
    case x if x <= 0 => 0
    case x if x <20000 => x*.02
    case x if x <200000 => x*.04
    case x if x <2000000 => x*.35
    case _ => amount*.65
}

@main
def run() = {
    printf("Enter deposit amount : ")
    var number = readInt()
    printf ("Interest for Rs.%d is %.2f",number,interest(number))
}