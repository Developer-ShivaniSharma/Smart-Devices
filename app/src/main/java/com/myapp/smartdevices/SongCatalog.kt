package com.myapp.smartdevices

open class Song(
    var title: String,
    var artist: String,
    var yearPublish: Int,
    var printCount: Int
) {
    val isPopular: Boolean = (printCount >= 1000)
    fun printDescription() {
        println("$title song by $artist published in $yearPublish and has $printCount copies")
        println("$isPopular")
    }
}
fun main(){
    val song:Song = Song("Sad","KR Rehman",2000,1011)
    song.printDescription()
}
