import scala.io.StdIn.readInt

object  Question {
    class Account(n: String,x: Double) {

    val name = n
    var balance = x

    def transfer(a: Account, x: Int) =
        this.balance = this.balance - x
        a.balance = a.balance + x
    }

    def acc_With_Neg_Balance(y: List[Account]) =
        println("\nAccounts with negative balance")
        for(element<-y) 
            if (element.balance < 0)
                println(element.name + " Balance:" + element.balance+"0")     

    def sum_Of_Acc(y: List[Account]) =
        var sum = 0.00;
        for(element<-y) 
            sum = sum + element.balance

        println("\nTotal Balance is:" + sum +"0") 

    def final_Balance(y: List[Account]) =
        println("\nAccounts and Balances after adding interest")
        for(element<-y) 
            element.balance = element.balance match {
                case x if element.balance > 0 => element.balance + element.balance*0.05
                case _ => element.balance - element.balance*0.1
            }
            println(element.name + " Balance: " + element.balance +"0") 


    def main(args: Array[String]): Unit = {

        var Acc1 = new Account("Acc1",3000)
        var Acc2 = new Account("Acc2",-4000)
        var Acc3 = new Account("Acc3",2000)
        var Acc4 = new Account("Acc4",-1000)
        var Acc5 = new Account("Acc5",5000)
        var Acc6 = new Account("Acc6",10000)
        var Acc7 = new Account("Acc7",-2000)



        val bank = List(Acc1,Acc2,Acc3,Acc4,Acc5,Acc6,Acc7);

        acc_With_Neg_Balance(bank)
        sum_Of_Acc(bank)
        final_Balance(bank)


    }
}