package com.myapp.smartdevices

fun main() {
    val coin: (Int) -> String = { quantity ->
        "$quantity coins"
    }
    val treatFunction = trickOrTreat(false, coin)
    treatFunction()

    val cupcake: (Int) -> String = { quantity ->
        "Have a $quantity cupcakes"
    }
    val trickFunction = trickOrTreat(true, cupcake)
    trickFunction()
    repeat(4){
        treatFunction()
    }
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null){
            println(extraTreat(6))
    }
        return treats
    }

}

val trick = {
    println("No treats")
}
val treats = {
    println("Have a treat")
}