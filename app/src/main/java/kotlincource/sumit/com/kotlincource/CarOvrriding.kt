package kotlincource.sumit.com.kotlincource

/**
 * Created by sumitsanjayingewar on 1/11/18.
 */
open class AddMult1(){


    open fun add(n1:Int,n2:Int):Int{

        return n1+n2

    }

    fun mult(n1:Int,n2:Int):Int{

        return n1*n2
    }
}

class DivSub1():AddMult1(){


     override fun add(n1: Int,n2: Int):Int{
         return n1+n2*3
     }
    fun sub(n1:Int,n2:Int):Int{

        return n1-n2
    }

    fun div(n1:Int,n2:Int):Int{

        return n1/n2
    }
}