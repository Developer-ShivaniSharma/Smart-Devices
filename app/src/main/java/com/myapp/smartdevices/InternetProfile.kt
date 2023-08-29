package com.myapp.smartdevices

class Profile(val name:String, val age:Int, val hobby:String?,val referrer:String?){
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
fun main(){
    val profile = Profile("Ram",20,null,"ajay")
    val profile2 = Profile("Sita",16,"tennis",null)
    profile.showProfile()
    println("....................")
    profile2.showProfile()

}