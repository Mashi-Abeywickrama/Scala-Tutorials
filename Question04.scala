
def bookPrice ( count : Int) : Double = 
    count * 24.95 //1497

def discountAdded ( price : Double) : Double = 
    price * .4  //598.8

def shippingCost( count :Int):Double=
    3*50 + (count -50) * .75 //157.5

@main
def run () = {
    // println(bookPrice(60))
    // println(discountAdded(bookPrice(60)))
    // println(shippingCost(60))
    printf("Total wholesale cost : Rs.%.2f",bookPrice(60)-discountAdded(bookPrice(60))+shippingCost(60))

}