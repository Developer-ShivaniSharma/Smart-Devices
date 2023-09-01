package com.myapp.smartdevices

/**
 * we Create a Song Class having primary Constructor val type.As the information of the song will never change.
 * we can use different info of a song by creating new object ref of class in main.
 * @property title represent the title of the song.
 * @property artist represent the artist name.
 * @property yearPublish represent the year the song publish.
 * @property printCount define the total copies printed of that song.
 */
class Song(
    val title: String,
    val artist: String,
    val yearPublish: Int,
    val printCount: Int
) {
    // if the printCount is less and equal to 1000 then the isPopular property gives False value otherwise the value will be true.
    //Function printDescription prints the final result of Song detail and is the song Popular or not.
    fun printDescription() {
        println("$title song by $artist published in $yearPublish and has $printCount copies")
        // isPopular property gives true or false value.
        println("isPopular: ${printCount >= 1000}")
    }
}

// In the main function we define the object Reference of Class Song and call the functions.
fun main() {
    val song: Song = Song("Sad", "KR Rehman", 2000, 1011)
    val song2: Song = Song("Divotionsl", "TT Series", 2012, 10000)
    song.printDescription()
}
