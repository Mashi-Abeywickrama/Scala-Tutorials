case class Point(var x: Int, var y: Int) {
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y)

    def move(dx:Int, dy:Int):Unit = {
        this.x = this.x + dx
        this.y = this.y + dy
    }

    def distance(a:Point) : Double = {
        println("\tCalculating Distance...")
        var xDist:Int = this.x - a.x
        // println(xDist)
        var yDist:Int = this.y - a.y
        // println(yDist)
        var dist: Int = xDist*xDist + yDist*yDist
        // println(dist)
        scala.math.sqrt(dist) //pythagoras relation
    }

    def invert() :Unit = {
        printf("\tSwitching x and y coordinates of "+this+"...\n")
        var temp = this.x
        this.x = this.y
        this.y = temp
    }

}

@main
def run() = {
    var a = Point(1,2)
    var b = Point(7,9)
    println("\n\t"+a)
    println("\t"+b+"\n")

    println("a + b = " + a.add(b))

    a.move(dx = 2, dy = 4)
    println("new position "+a)
    b.move(dx = -1, dy = 3)
    println("new position "+a)

    
    var c = a.distance(b)
    println("Distance between "+ a +" and "+ b + "is "+c)

    a.invert()
    println("After switching,,, "+a)
}