import scala.io.StdIn.readInt

object  Question02 {
    class Rational(x: Int, y: Int) {

        // define a gcd method  to simplify rationals
        private def gcd(a: Int, b: Int): Int = Math.abs(if (b == 0) a else gcd(b, a % b))       
        
        val g = gcd(x, y)       
        val numerator = x / g
        val denominator = y / g

        def neg = new Rational(-numerator, denominator)
        def unary_- : Rational = neg

        def add(r: Rational): Rational =
        new Rational(numerator * r.denominator + r.numerator * denominator, denominator * r.denominator)
        def +(r: Rational): Rational = add(r)       
        
        
        def sub(r: Rational): Rational = add(r.neg)
        def -(r: Rational): Rational = sub(r)       
    }
    
    def main(args: Array[String]): Unit = {

        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)

        val res = x-y-z
        println(res.numerator + "/" + res.denominator)


    }
}