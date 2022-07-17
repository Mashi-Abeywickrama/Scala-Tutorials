def CelciusToFahrenheit (temp : Int) : Double = {
    temp * 1.8000 + 32.00
}

@main
def run () = {
    printf("35`C = %.2fF",CelciusToFahrenheit(35))
}