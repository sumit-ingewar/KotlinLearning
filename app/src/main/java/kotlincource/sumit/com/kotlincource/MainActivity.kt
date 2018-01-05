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
        koitlinQuiz1()
    }

    private fun kotlinLectureSix() {

        tvText.setText(getString(R.string.welcome_to_kotlin))
        println("Welcome to Kotlin  , print line")

    }

    private fun kotlinLectureEight() {
        var company:String?
        company = "SapientRazorfish"

        println("Name :- " + name);
        println("Age :- " + age)
        println("Company :- " + company)
    }

    // null safety
    private fun kotlinLectureTwelve(){

        var name:String?
        name = null
        println(name!!)

    }

    // type casting in kotlin
    private fun kotlinLectureThirteen(){

        var n1=12
        var n2:Int?
        var n2Str:String = "10"

        n2 = n2Str.toInt();

        var n2Float:Float?
        n2Float = n2.toFloat()


        println("n1 :"+n1)
        println("n2 :"+n2)
        println("n2 String :"+n2Str)
        println("n2 Float :"+n2Float)
    }


    private fun koitlinQuiz1(){
        var i=5;
        println(i++)
        print(i--)
    }
}
