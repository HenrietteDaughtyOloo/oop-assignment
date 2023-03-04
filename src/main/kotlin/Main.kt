fun main() {
    var one = Human("Allison", 20, 45.20)
    one.eat(1)
    println( one.weight)
    one.speak("You clearly do remember what a desert is right?")
    one.birthday()
    println()
    println()
    var person1 = User("Mellania", "Obama", "abcdef@gmail.com", "+254756432568", "gordowner@#145")
    println(person1.lastName)
    println(person1.email)
    println(person1.phoneNumber)

}

            /*Create a class called Human with these attributes: name, age, weight. It has
            the following functions:
                - eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
                  and increments the human’s weight by the weight of the food eaten
                  (3 points)*/

class Human(var name:String, var age:Int, var weight:Double){
    fun eat(foodWeight:Int){
        println("Iam eating $foodWeight kgs of food")
        weight += foodWeight
    }
                /*- speak(speech: String) :Prints the string passed to it (2points)*/
    fun speak(speech:String){
        println(speech)
    }
                /*- birthday( ) :Increments the human’s age by 1 (2POINTS*/
    fun birthday(){
        age +=1
                    println(age)


    }
/*
Create an instance of this human class and invoke all its functions*/
}

/*Create a data class User with these fields: firstName, lastName, email,
phoneNumber, password. Create an instance of User and print out any 2
attributes*/

data class User(var firtName:String, var lastName:String, var email:String, var phoneNumber:String, var passWord:String,){


}