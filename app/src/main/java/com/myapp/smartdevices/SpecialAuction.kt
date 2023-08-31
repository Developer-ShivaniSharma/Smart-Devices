package com.myapp.smartdevices

fun main() {
    val bid: Bid = Bid(4000, "Ajay")
    val finalAuction = auctionDetail(null, 2000) // represent bid value is null.
    val finalAuction2 = auctionDetail(bid, 2000)// represent bid is not null
    println("The item A sold at $finalAuction")
    println("The item B sold at $finalAuction2")

}
/**
 *We define the data class Bid in which we define all the attributes
 * the attribute represent the amount by bidder.
 * and bidderName defines the name of the bidder
 */
data class Bid(val amount: Int, val bidderName: String)

/**
 * we define the function [auctionDetail].which checks the items has any bidder or not.
 * in the  function we define parameter bid and minimumAmount.
 * @property bid is of nullable Bid type.If the bid is null then it return amount as final value if
 not then miniAmount as final value of item.
 *@property minimumAmount represent the mini amount by the auction house.
 */
fun auctionDetail(bid: Bid?, minimumAmount: Int): Int {
    //if the bid is not null then it returns amount and if bid is null then it returns minimumAmount
    return (bid?.amount) ?: (minimumAmount)
}