import math.Pi

def area (radius : Int) : Double = {
    Pi * radius*radius
}

@main
def run () = {
    printf ("Area is : %.2f",area(4))
}