import scala.io.StdIn.readInt

object  Question01 {
    class Rational(x: Int, y: Int) {

        // define a gcd method to simplify rationals
        private def gcd(a: Int, b: Int): Int = Math.abs(if (b == 0) a else gcd(b, a % b))

        val g = gcd(x, y)

        val numerator = x / g
        val denominator = y / g


        def neg = new Rational(-numerator, denominator)
        def unary_- : Rational = neg

    }
    
    def main(args: Array[String]): Unit = {

        val A = new Rational(1,3)
        println(A.numerator + "/" + A.denominator)

        val B = A.neg
        println(B.numerator + "/" + B.denominator)

        val C = -A
        println(C.numerator + "/" + C.denominator)

    }
}