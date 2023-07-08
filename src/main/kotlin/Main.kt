fun main() {

//Write a loop that prints numbers from 1 to 100, increasing by 2 (so 1, 3, 5...).
// Use two different printing functions for values below 50 and values above 50.

    for (i in 1..100 step 2) {
        if (i > 50) {
            printMajorNumbers(i)
        } else if (i < 50) {
            printMinorNumbers(i)
        }
    }
}

fun printMajorNumbers(majorNumber: Int) {
    println("Major numbers: ${majorNumber}")
}

fun printMinorNumbers(minorNumber: Int) {
    println("Minor numbers: ${minorNumber}")
}

