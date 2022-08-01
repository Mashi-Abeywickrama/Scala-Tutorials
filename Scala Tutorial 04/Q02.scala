import scala.io.StdIn.readInt;

def patternMatch(num:Int) : String = num match {
    case x if x< 0 => "Negative"
    case x if x == 0 => "Zero"
    case x if x%2 == 0 => "Even"
    case _ => "Odd"
}

@main
def run() = {
    printf("Enter a number : ")
    var number = readInt()
    printf ("%d is %s",number,patternMatch(number))
}