def volume (radius : Double) : Double = {
    math.Pi * radius * radius * radius * 4/3
}

@main
def run () = {
    printf ("Volume is : %.2f",volume(5))
}