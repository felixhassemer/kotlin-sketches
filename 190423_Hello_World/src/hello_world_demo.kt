package demo

import java.util.Random

fun main(args: Array<String>) {
    println("Hello, World")

    // Variable Types
//    variableTypes()

    // Typecasting
//    typeCasting()

    // Strings and String Manipulation
//    stringOperations()

    // Arrays
//    arrayDemo()


    // Conditionals and Looping
//    conditionalDemo()

    // Functions
    functionsDemo()

}

fun variableTypes() {
    val immutableVal = "Felix" //immutable variables
    var mutableVar = 27 //mutable variables

    // Variable Types
    // Int Long Double Float Boolean Short Byte Char String

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("Smallest Int : ${smallInt}")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long : " + bigLong)
    println("Smallest Long : ${smallLong}")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double : " + bigDouble)
    println("Smallest Double : ${smallDouble}")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float : " + bigFloat)
    println("Smallest Float : ${smallFloat}")

    // check Var Type
    if (true is Boolean) {
        println("true is Boolean")
    }

    var letter: Char = 'A'
    println("A is a Char : ${letter is Char}")
}

fun typeCasting() {
    println("3.14 to Int : ${3.14.toInt()}")
    println("A to Int : ${'A'.toInt()}")
    println("65 to Char : ${65.toChar()}")
}

fun stringOperations() {
    val myName = "Felix Hassemer"
    val longString = """This is a long string"""

    var fName: String = "Jane"
    var lName: String = "Doe"

    var fullName = fName + " " + lName
    println("Name : $fullName")
    println("1 + 2 = ${1 + 2}")
    println("String Length : ${longString.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    println("Strings Equal : ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}") //equal:0 , negative: -x, positive: +x
    println("Second Index : ${str1.get(2)}") //or str1[2]
    println("Index 2-7 : ${str1.subSequence(2, 8)}")
    println("Contains random : ${str1.contains("random")}")
}

fun arrayDemo() {
    var myArray = arrayOf(1, 1.23, "Doug")

    println(myArray[2])
    myArray[1] = 3.14
    println("Array Length : ${myArray.size}")
    println("Doug in Array : ${myArray.contains("Doug")}")

    var partArray = myArray.copyOfRange(0, 1)

    println("First : ${myArray.first()}")
    println("Last : ${myArray.last()}")
    println("Doug Index : ${myArray.indexOf("Doug")}")

    var sqArray = Array(5, { x -> x * x }) //index value is index * index
    println(sqArray[3])

    var arr2: Array<Int> = arrayOf(1, 2, 3) //integer only array

    // Ranges
    val oneToTen = 1..10
    val alphabet = "A".."Z"
    println("R in Alphabet : ${"R" in alphabet}")
    val tenToOne = 10.downTo(1)
    val twoToTwenty = 2.rangeTo(20)
//    println(twoToTwenty)
    val rng3 = oneToTen.step(3)

    for (x in rng3) println("rng3 : $x")
    for (x in tenToOne.reversed()) println("Reverse : $x")
}

fun conditionalDemo() {
    val age = 8

//    if (age < 5) {
//        println("Go to Preschool")
//    } else if (age == 5) {
//        println("Go to Kindergarten")
//    } else if ((age > 5) && (age <= 17)) {
//        val grade = age - 5
//        println("Go to Grade $grade")
//    } else {
//        println("Go to College")
//    }

    when (age) {
        0,1,2,3,4 -> println("Go to Preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }

    for (x in 1..10) {
        println("Loop : $x")
    }

    // generate Random numbers from Java Library
    val rand = Random()
    val magicNum = rand.nextInt(50) + 1
    var guess = 0

    while (magicNum != guess) {
        guess += 1
    }
    println("Magic Number was $guess")


    // continue and break inside loops
    for (x in 1..20) {
        if (x % 2 == 0) {
            // skip even numbers
            continue
        }
        println("Odd : $x")
        if (x == 15) break
    }

    var arr3 : Array<Int> = arrayOf(3, 6, 9)

    for (i in arr3.indices) {
        println("Mult 3 : ${arr3[i]}")
    }

    for ((index, value) in arr3.withIndex()) {
        println("Index : $index Value : $value")
    }
}

fun functionsDemo() {
    // arguments with type, function with return type Int
    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5, 4)}")

    // arguments with default values, function without return type
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5, 4)}")

    // arguments in different order
    println("5 - 4 = ${subtract(num2 = 5, num1 = 4)}")
}