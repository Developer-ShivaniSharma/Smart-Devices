package com.myapp.smartdevices

open class SmartDevices(val name: String, val category: String, val type: String) {
    var deviceStatus = "Online"
    open fun turnOn() {
        deviceStatus = "On"
    }

    open fun turnOff() {
        deviceStatus = "Off"
    }

    open fun printDeviceInfo() {
        println("$name device , $category,$type")
    }
}

class SmartTvDevices(deviceName: String, deviceCategory: String, deviceType: String) :
    SmartDevices(name = deviceName, category = deviceCategory, type = deviceType) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channel = 3
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        println("$name device is turn $deviceStatus and channel no set to $channel on volume at $speakerVolume ")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name device is turn $deviceStatus and channel no set to $channel on volume at $speakerVolume")
    }

    override fun printDeviceInfo() {
        println("$name device of $type and $category")
    }

    fun decreaseVolume() {
        speakerVolume--
        println("$name device volume decreases to $speakerVolume")
    }

    fun previousChannel() {
        channel--
        println("$name device channel decreases to $channel")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String, deviceType: String) :
    SmartDevices(name = deviceName, category = deviceCategory, type = deviceType) {
    var brightness = 2
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        println("$name device brightness turnOn to $brightness")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name device brightness turnoff")
    }

    override fun printDeviceInfo() {
        println("$name device of $type and $category")
    }


    fun decreaseBrightness() {
        brightness--
        println("$name device brightness decreases to $brightness")
    }
}

class SmartHomes(val smartTvdevices: SmartTvDevices, val smartLightdevice: SmartLightDevice) {
    fun turnOnTV() {
        smartTvdevices.turnOn()
    }

    fun turnOfTV() {
        smartTvdevices.turnOff()
    }

    fun decreaseTvVolume() {
        smartTvdevices.decreaseVolume()
    }

    fun changeTvChannelToPrevious() {
        smartTvdevices.previousChannel()
    }

    fun printSmartTvInfo() {
        smartTvdevices.printDeviceInfo()
    }

    fun turnOnLight() {
        smartLightdevice.turnOn()
    }

    fun turnOfLight() {
        smartLightdevice.turnOff()
    }

    fun decreaseBrightness() {
        smartLightdevice.decreaseBrightness()
    }

    fun printSmartLightInfo() {
        smartLightdevice.printDeviceInfo()
    }

    fun turnOnAllDevices() {
        turnOnLight()
        turnOnTV()
    }

    fun turnOfAllDevices() {
        turnOfLight()
        turnOfTV()

    }
}

fun main() {
    val smartTv: SmartTvDevices = SmartTvDevices("LG  TV", "Entertainment", "Smart TV")
    val smartLight = SmartLightDevice("Philips", "Brightness", "Smart Light")
    var smartHome:SmartHomes = SmartHomes(smartTv, smartLight)
    smartHome.turnOnAllDevices()
//    smartdevices.turnOff()

    println(".................................")
    smartHome.turnOfAllDevices()
//smartdevices = SmartLightDevice("Philips", "Brightness", "Smart Light")
//    smartdevices.turnOn()
//    smartdevices.turnOff()

    execute(::add)

    val addFunc: (Int, Int) -> Int = { first, second -> (first + second) }
    execute(addFunc)
    val concat:(Int,String) -> String = {first,second -> ("$first$second")}
    val value:String = concat(3,"4")
    println("concat (3,4)= $value")

}

fun add(first: Int, second: Int): Int {
    return first + second
}


fun execute(myFunc: (Int, Int) -> Int) {
    val text: Int = myFunc(2, 3)
    println("myFunc(2, 3) = $text")
}



