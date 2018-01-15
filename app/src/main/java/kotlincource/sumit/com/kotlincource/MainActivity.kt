package kotlincource.sumit.com.kotlincource

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    val name = "Sumit";
    val age = 28;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //skotlinLectureSix()
        //kotlinLectureEight()
        //kotlinLectureTwelve()
        // kotlinLectureThirteen()
        //koitlinQuiz1()
        //kotlinLectureNineteen()
        // kotlinIfElse()
        //kotlinWhen()
        //kotlinForLoop()
        //kotlinArray()
        //kotlinArrayList()
        //kotlinHashMap()
        //println(functionInKotlin("Sumit" , "Ingewar"))
        //println(functionInKotlin("Sumit"))
        //kotlinClassFunctions()
        //kotlinConstructor()
        //kotlinInheritance()
        //kotlinOverriding()
        kotlinTypeCasting()
    }

    // example of type casting and polymorphism
    private fun kotlinTypeCasting() {
        var n1: Int = 10
        var n2 = 20

        var addMult = AddMult1()
        println("Add id ${addMult.add(n1, n2)}")
        println("Mult is ${addMult.mult(n1, n2)}")

        var subDiv = DivSub1()

        println("Sub id ${subDiv.sub(n1, n2)}")
        println("Div is ${subDiv.div(n2, n1)}")

        // here object of DivSub1 is type casted to AddMult1 , since DivSub1
        // also has add method , it will execute the method from DivSub1 only

        var subDiv2 = DivSub1() as AddMult1
        println("Inherited Sum is ${subDiv2.add(n1, n2)}")
    }


    // kotlin overriding

    private fun kotlinOverriding() {
        var n1: Int = 10
        var n2 = 20

        var addMult = AddMult1()
        println("Add id ${addMult.add(n1, n2)}")
        println("Mult is ${addMult.mult(n1, n2)}")

        var subDiv = DivSub1()

        println("Sub id ${subDiv.sub(n1, n2)}")
        println("Div is ${subDiv.div(n2, n1)}")


        println("Inherited Sum is ${subDiv.add(n1, n2)}")
    }

    // kotlin inheritance
    private fun kotlinInheritance() {
        var n1: Int = 10
        var n2 = 20

        var addMult = AddMult()
        println("Add id ${addMult.add(n1, n2)}")
        println("Mult is ${addMult.mult(n1, n2)}")

        var subDiv = DivSub()

        println("Sub id ${subDiv.sub(n1, n2)}")
        println("Div is ${subDiv.div(n2, n1)}")


        println("Inherited Sum is ${subDiv.add(n1, n2)}")
    }

    // constructor
    private fun kotlinConstructor() {

        var sumitCar = CarConstructor("Jaguar", "Sumit")
        var asmiCar = CarConstructor("Honda City")
    }

    //  class functions

    private fun kotlinClassFunctions() {

        var sumitCar = Car("Jaguar", "Sumit")
        var asmiCar = Car("Honda City", "Asmi")

        println("Sumit's Car : ${sumitCar.brand}")
        println("Asmi's Car : ${asmiCar.brand}")
    }

    // function in kotlin

    private fun functionInKotlin(s1: String, s2: String = "Ingewar"): String {

        return s1 + s2

    }


    // kotlin HashMap
    private fun kotlinHashMap() {

        var map = HashMap<Int, String>()
        map.put(1, "Sumit")
        map.put(2, "Asmi")
        map.put(3, "Mom")

        println("Mom's name is " + map.get(3))


        map.put(3, "Mit")

        for (key in map.keys) {

            println(map.get(key))
        }
    }


    // kotlin ArrayList
    private fun kotlinArrayList() {

        var arrayList = ArrayList<String>()
        arrayList.add("Sumit")
        arrayList.add("Asmi")
        arrayList.add("Mom")

        println("Wife's name is " + arrayList.get(1))

        for (element in arrayList) {
            println(element)
        }

        arrayList.add(0, "Mit")

        for (index in 0..arrayList.size - 1) {
            println(arrayList.get(index))
        }


    }

    private fun kotlinLectureSix() {

        tvText.setText(getString(R.string.welcome_to_kotlin))
        println("Welcome to Kotlin  , print line")

    }

    private fun kotlinLectureEight() {
        var company: String?
        company = "SapientRazorfish"

        println("Name :- " + name);
        println("Age :- " + age)
        println("Company :- " + company)
    }

    // null safety
    private fun kotlinLectureTwelve() {

        var name: String?
        name = null
        println(name!!)

    }

    // type casting in kotlin
    private fun kotlinLectureThirteen() {

        var n1 = 12
        var n2: Int?
        var n2Str: String = "10"

        n2 = n2Str.toInt();

        var n2Float: Float?
        n2Float = n2.toFloat()


        println("n1 :" + n1)
        println("n2 :" + n2)
        println("n2 String :" + n2Str)
        println("n2 Float :" + n2Float)
    }


    private fun koitlinQuiz1() {
        var i = 5;
        println(i++)
        print(i--)
    }


    /*
    * Logical and decision making
    *
    * */

    private fun kotlinLectureNineteen() {

        val n1 = 10;
        val n2 = 20;
        val isMarried = true;

        println(n1 > 20 && n1 < 30) // should print false
        println(n2 >= 20 || n2 <= 20)// should print true
        println(!isMarried) // should print false

    }


    private fun kotlinIfElse() {
        var score = 63;
        var n = 30;

        if (score >= 90) {

            if (score >= 94) {
                println("You got passed with A+ grade with $score marks")
            } else {
                println("You got passed with A- grade with $score marks")
            }

        } else if (score >= 60) {
            println("You got passed with B grade with $score marks")
        } else {
            println("You got passed with C grade with $score marks")
        }

        var temp = if (score > n) score else n

        println("This is useful if else statement $temp")

    }

    // When in kotlin , this is something new , similar as switch in java
    private fun kotlinWhen() {
        var x = 2;

        when (x) {
            1 -> {
                println("this is 10")
            }
            2 -> {
                println("this is $x")
            }
            else -> {
                println(" Arrrrrgrrr ")
            }
        }

        var temp = when (x) {
            10 -> true
            else -> false

        }

        println("Temp : $temp")
    }

    // for loop
    private fun kotlinForLoop() {

        for (item1 in 1..3) {
            for (item2 in 1..3) {
                println("$item1$item2")
            }
        }
    }

    // arrays in kotlin
    private fun kotlinArray() {

        var arrayInt = Array<Int>(5) { 0 };
        arrayInt[2] = 30;

        for (element in arrayInt) {
            println("Element " + element)
        }

        for (i in 0..4) {
            println("Index value is " + arrayInt[i])
        }

    }


}
