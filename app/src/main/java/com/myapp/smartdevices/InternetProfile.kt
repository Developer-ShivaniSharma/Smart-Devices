package com.myapp.smartdevices

/**
 * We create a [Profile] class having name,age,hobby and referrer as primary constructor.
 * we define the type of all the parameters (defined in constructor)
 * the value of hobby and referrer can be null so we define there dataTypes along with "?".
 */
class Profile(val name:String, val age:Int, val hobby:String?,val referrer:String?){
    //in this class we create showProfile fun which prints the name and age of a person and also check weather a person has any hobby, reference or not.Using "if" condition.
    fun showProfile(){
       println("name: $name")
       println("age: $age")
        if(hobby!=null){
            println("Like to play $hobby")
        }else{
            println("Doesn't have hobby")
        }
        if (referrer!=null){
            println("Wants to refer $referrer")
        }else{
            println("doesn't wants to refer")
        }
    }
}

/**
 * in the main fun we create the reference object of Profile Class and call the functions.
 */
fun main(){
    val profile = Profile("Ram",20,null,"ajay")
    val profile2 = Profile("Sita",16,"tennis",null)
    profile.showProfile()
    println("....................")
    profile2.showProfile()

}