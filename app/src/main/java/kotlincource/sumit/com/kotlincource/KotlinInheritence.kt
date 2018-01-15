package kotlincource.sumit.com.kotlincource

/**
 * Created by sumitsanjayingewar on 1/11/18.
 */
open class AddMult(){


    fun add(n1:Int,n2:Int):Int{

        return n1+n2

    }

    fun mult(n1:Int,n2:Int):Int{

        return n1*n2
    }
}

class DivSub():AddMult(){

    fun sub(n1:Int,n2:Int):Int{

        return n1-n2
    }

    fun div(n1:Int,n2:Int):Int{

        return n1/n2
    }
}