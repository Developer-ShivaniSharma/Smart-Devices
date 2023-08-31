package com.myapp.smartdevices

open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "Online"
    open val deviceType = "Unknown"
    open fun turnOn() {
        deviceStatus = "On"
    }
        open fun turnOf() {
        deviceStatus = "Off"
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }
    override val deviceType = "Smart TV"
    override fun turnOn() {
        super.turnOn()
        println("$name $deviceType is turn On. The speaker volume set to $speakerVolume. The channel no. is set to $channelNumber")
    }

    override fun turnOf() {
        super.turnOf()
        println("$name $deviceType is turn Off. The speaker volume set to $speakerVolume. The channel no. is set to $channelNumber")
    }

    fun increaseVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number incresed to $channelNumber")
    }
}

class SmartLightDevices(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var brightnessLevel = 0
    override val deviceType = "Smart Light"
    override fun turnOn() {
        var deviceStatus = "On"
        brightnessLevel = 2
        println("$name $deviceType turn on $brightnessLevel")
    }

    override fun turnOf() {
        var deviceStatus = "Off"
        brightnessLevel = 0
        println("$name $deviceType turn Off $brightnessLevel")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("The smart light bright increases to $brightnessLevel ")
    }
    }

class SmartHome(
    val smartTvDevice: SmartTvDevice, val smartLightDevices: SmartLightDevices
) {
    fun turnOnTV() {
        smartTvDevice.turnOn()
    }
    fun turnOfTV() {
        smartTvDevice.turnOf()
    }

    fun increseTvVolume() {
        smartTvDevice.increaseVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevices.turnOn()
    }

    fun turnOfLight() {
        smartLightDevices.turnOf()
    }

    fun increseLightBrightness() {
        smartLightDevices.increaseBrightness()
    }

    fun turnOffDevices() {
        turnOfTV()
        turnOfLight()
    }

}

fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("LG", "Entertainment")
    smartDevice.turnOn()
    smartDevice = SmartLightDevices("Philips", "Utility")
    smartDevice.turnOn()


}