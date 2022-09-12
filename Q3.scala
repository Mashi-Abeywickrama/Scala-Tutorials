import scala.io.StdIn.readInt

object  Question03 {
    class Account(n: String,x: Int) {

        val name = n
        var balance = x

        def transfer(a: Account, x: Int) =
            this.balance = this.balance - x
            a.balance = a.balance + x
    }
    
    def main(args: Array[String]): Unit = {

        var Acc1 = new Account("x",10000)
        var Acc2 = new Account("y",6000)

        Acc1.transfer(Acc2,5000);
        println(Acc1.name+" : Rs."+ Acc1.balance + ".00")
        println(Acc2.name+" : Rs." + Acc2.balance+ ".00")


    }
}