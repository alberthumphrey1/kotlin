    fun main(){
        if(18 > 20){
            println("20 is greater than 18")
        }else{
            print("18 is lesser than 20")
        }

        val time = 5
        if(time < 10){
            println("Good Morning")
        }else if (time < 20){
            println("Good day")
        }else{
            println("Good Evening")
        }
        val day = 4
        val result = when (day){
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day"
        }
        println("result")
    }