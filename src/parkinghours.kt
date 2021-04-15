fun main(args:Array<String>) {
    //users input for the packing hours
    println("amount of hours:")
    val hours: Int = readLine()!!.toInt()

    //calculation for five hours or less
    val one = hours * 1

    //calculations for above five hours
    val two = (hours - 5) * 0.5

    //calculations for 24hrs
    val three=15

    //calculations for above 24 hours
    val five = (hours - 24) * 0.5
    val six = 15 + five

    //the conditions
    //if the hours are less or equal to five
    if (hours <= 5) {

        var money = one

        println("amount to be paid:$money$")
    }
    //if the hours are greater than or less than 24 hours
    else if (hours > 5) {

        if (hours < 24) {

            var money = 5 + two

            println("Amount to be paid:$money$")
        }
    }
    //if the hours are equal to 24 hours
    if (hours==24){

        println("Amount to be paid:$three")

    }
    //if the hours are greater than 24 hours
    else if (hours > 24) {

        println("Amount to be paid:$six$")
    }

}


