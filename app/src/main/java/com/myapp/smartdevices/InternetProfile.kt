package com.myapp.smartdevices

/**
 * We create a [PersonProfile] class having name,age,hobby and referrer as primary constructor.
 * we define the type of all the parameters (defined in constructor)
 * the value of hobby and referrer can be null so we define there dataTypes along with "?".
 * @property name it repersent the name of the current Profile person,
 *@property age it represent the age of the current profile person,
 * @property hobby it represent the hobby of the current profile person,
 * @property referrer represent the person name who referred the current profile person.
 */
class PersonProfile(val name:String, val age:Int, val hobby:String?,val referrer:PersonProfile?){
    //in this class we create showProfile fun which prints the name and age of a person
    // And it also Check that a person has any hobby, refer by any other person or not.Using "if" condition.
    fun showProfile(){
       println("name: $name")
       println("age: $age")
        if(hobby!=null){
            println("Like to play $hobby")
        }else{
            println("Doesn't have hobby")
        }
        if (referrer!=null){
            println("refered by ${referrer.name}")
        }else{
            println("Person not referred by anybody")
        }
    }
}

/**
 * in the main fun we create the object reference of Profile Class and call the functions.
 */
fun main(){
    val profile = PersonProfile("Ram",20,"Football",null)
    val profile2 = PersonProfile("ajay",16,"tennis",profile)
    profile.showProfile()
    println("....................")
    profile2.showProfile()

}