def easyPhase (distance :Int):Int = distance*8
def tempo (d :Int):Int = d*7
@main
def run () = {
    printf ("The total running time is %d",easyPhase(2)+tempo(3)+easyPhase(2))
}