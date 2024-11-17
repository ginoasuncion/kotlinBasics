package ginoasuncion.com.kotlinbasics

// numeric operators
//fun main() {
//    println(1 + 1)
//    println(53 - 3)
//    println(50 / 10)
//    println(1.0 / 2.0)
//    println(2.0 / 3.5)
//    print(6*50)
//    print(6.0*50.0)
//    print(6.0*50)
//    print(2.times(3))
//    print(3.5.plus(4))
//    print(2.4.div(2))
//}

// Practice using types
//fun main() {
//    val i: Int = 6
//    println(i)
//    val b1 = i.toByte()
//    println(b1)
//
//    val b2: Byte = 1
//    println(b2)
//
////    val i1: Int = b2
////
////    val i2: String = b2
////
////    val i3: Double = b2
//
//    val i4: Int = b2.toInt() // OK!
//    println(i4)
//
//    val i5: String = b2.toString()
//    println(i5)
//
//    val i6: Double = b2.toDouble()
//    println(i6)
//
//    val oneMillion = 1_000_000
//    println(oneMillion)
//    val socialSecurityNumber = 999_99_9999L
//    println(socialSecurityNumber)
//    val hexBytes = 0xFF_EC_DE_5E
//    println(hexBytes)
//    val bytes = 0b11010010_01101001_10010100_10010010
//    println(bytes)
//}


//  Learn the value of variable types
//fun main() {
////    val aquarium = 1
//    var aquarium = 1
//    aquarium = 2
//    var fish: Int = 12
//    var lakes: Double = 2.5
//    println(fish)
//    println(lakes)
//}

//fun main() {
//    val numberOfFish = 50
//    val numberOfPlants = 23
//
//    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
//
//    if (numberOfFish > numberOfPlants) {
//        println("Good ratio!")
//    } else {
//        println("Unhealthy ratio")
//    }
//}

//
//fun main() {
//    val numberOfFish = 50
//    val numberOfPlants = 23
//
//    if (numberOfFish == 0) {
//        println("Empty tank")
//    } else if (numberOfFish < 40) {
//        println("Got fish!")
//    } else {
//        println("That's a lot of fish!")
//    }
//
//    when (numberOfFish) {
//        0  -> println("Empty tank")
//        in 1..39 -> println("Got fish!")
//        else -> println("That's a lot of fish!")
//    }
//
//
//}

// Nullability
//fun main() {
//    var rocks: Int = null
//    var marbles: Int? = null
//
////    var fishFoodTreats = 6
////    if (fishFoodTreats != null) {
////        fishFoodTreats = fishFoodTreats.dec()
////    }
//
////    var fishFoodTreats = 6
////    fishFoodTreats = fishFoodTreats?.dec() ?: 0
//
////    val len = s!!.length   // throws NullPointerException if s is null
////
//}

//fun main() {
////    val school = listOf("mackerel", "trout", "halibut")
////    println(school)
////
////    val myList = mutableListOf("tuna", "salmon", "shark")
////    myList.remove("shark")
//
////    val school = arrayOf("shark", "salmon", "minnow")
////    println(java.util.Arrays.toString(school))
//
////    val mix = arrayOf("fish", 2)
////    val numbers = intArrayOf(1,2,3)
//
////    val numbers = intArrayOf(1,2,3)
////    val numbers3 = intArrayOf(4,5,6)
////    val foo2 = numbers3 + numbers
////    println(foo2[5])
//
//    val numbers = intArrayOf(1, 2, 3)
//    val oceans = listOf("Atlantic", "Pacific")
//    val oddList = listOf(numbers, oceans, "salmon")
//    println(oddList)
//
//    val array = Array (5) { it * 2 }
//    println(java.util.Arrays.toString(array))
//
//    val school = arrayOf("shark", "salmon", "minnow")
//    for (element in school) {
//        print(element + " ")
//    }
//
//    for ((index, element) in school.withIndex()) {
//        println("Item at $index is $element\n")
//    }
//}

//fun main() {
//    for (i in 1..5) print(i)
//    for (i in 5 downTo 1) print(i)
//    for (i in 3..6 step 2) print(i)
//    for (i in 'd'..'g') print (i)
//}

fun main() {
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}