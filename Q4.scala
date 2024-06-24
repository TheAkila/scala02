object MovieTheaater{
    def calcullateAttendees(price: Int):Int={
        120 + (15-price)/5*20
    }

    def calculateRevenue(price: Int):Int ={
        calcullateAttendees(price)*price
    }

    def calculateCost(price: Int):Int={
        500+calcullateAttendees(price)
    }

    def totalProfit(price: Int)={
        calculateRevenue(price)-calculateCost(price)
    }

    def main(args: Array[String]):Unit={
        println(s"Total profit when ticket price is Rs.25 : ${totalProfit(25)}")   
        println(s"Total profit when ticket price is Rs.30 : ${totalProfit(30)}")   
        println(s"Total profit when ticket price is Rs.35 : ${totalProfit(35)}")   
        println(s"Total profit when ticket price is Rs.40 : ${totalProfit(40)}")   
        println(s"Total profit when ticket price is Rs.45 : ${totalProfit(45)}")   
    }

}