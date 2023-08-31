package com.myapp.smartdevices

/**
 * we Create a Song Class having primary Constructor
 * @property title represent the title of the song.
 * @property artist represent the artist name.
 * @property yearPublish represent the year the song publish.
 * @property printCount define the total copies printed of that song.
 */
 class Song(
    var title: String,
    var artist: String,
    var yearPublish: Int,
    var printCount: Int
) {
    // isPopular property gives true or false value.
    // if the printCount is less and equal to 1000 then the isPopular property gives False value otherwise the value will be true.
    val isPopular: Boolean = (printCount >= 1000)
    //Function printDescription prints the final result of Song detail and is the song Popular or not.
    fun printDescription() {
        println("$title song by $artist published in $yearPublish and has $printCount copies")
        println("$isPopular")
    }
}
// In the main function we define the object Reference of Class Song and call the functions.
fun main(){
    val song:Song = Song("Sad","KR Rehman",2000,1011)
    song.printDescription()
}
