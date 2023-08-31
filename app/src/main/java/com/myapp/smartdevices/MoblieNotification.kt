package com.myapp.smartdevices

fun main() {
    val morningNotification = 51
    val eveningNotification = 101
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("Message are $numberOfMessages which is less then 100")
    } else {
        println("The notification is more then 100")
    }
}