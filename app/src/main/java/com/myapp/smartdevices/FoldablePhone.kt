package com.myapp.smartdevices

open class Phone(var isPhoneScreenOn: Boolean) {
    // phoneStatus is class Property which is declared in a constructor
    // phoneStatus is var type means it can be true or false. Value vary always
    //Since phoneStatus can change according to the screen state therefore it is declared as mutable property.
    open fun switchOn() {
        // this fun is called when the phone screen is turned on
        // in this switchOn function we change the phoneStatus to true (on)
        isPhoneScreenOn = true
    }

    open fun switchOff() {
        // this fun is called the phone screen is turned off
        //in this fun we change the phone status to false(off)
        isPhoneScreenOn = false
    }

    fun checkPhoneLight() {
        if (isPhoneScreenOn) {
            println("The screen of the phone is on")
        } else {
            println("Screen of the phone is Off")
        }
    }
}

/**
 * we are creating a phone which is foldable by extending from [Phone] class
 * @property isFolded tells about the current foldable state of the phone. Supply [true] if the phone is folded,[false] otherwise.
 */
class FoldablePhone(var isFolded: Boolean) : Phone(isPhoneScreenOn = !isFolded), Foldable {
    // var: since phone's folded state can change therefore [isFolded] property should be mutable
    // the phone's screen is On when the phone is not folded. therefore, isPhoneScreenOn = not-folded = !isFolded

    // We override the switchOn function to incorporate the changes introduce by foldable functionality.
    // In which we check status that, if the phone is not folded(!isFolded) then the phone is On else Off
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        }
    }

    override fun fold() {
        isFolded = true
        switchOff()
    }

    override fun unfold() {
        isFolded = false
        switchOn()
    }
}

interface Foldable {
    fun fold()
    fun unfold()
}

fun main() {
    val foldedphone = FoldablePhone(true)
    foldedphone.checkPhoneLight() // off

    foldedphone.unfold()
    foldedphone.checkPhoneLight()   // on

    foldedphone.fold()
    foldedphone.checkPhoneLight() // off

}