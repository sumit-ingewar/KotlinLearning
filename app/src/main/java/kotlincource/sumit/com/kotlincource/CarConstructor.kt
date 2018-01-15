package kotlincource.sumit.com.kotlincource

/**
 * Created by sumitsanjayingewar on 1/11/18.
 */

// may be we can look at this as model class
class CarConstructor(){


    var brandName:String? = null
    var ownerName:String? = null

    constructor(brand:String , owner:String):this(){


        this.brandName = brand
        this.ownerName = owner
        println("Brand : $brandName and Owner $ownerName con1")
    }

    constructor(brand:String):this(){

        this.brandName = brand
        println("Brand : $brandName con2")
    }

// init always executes first thing in the kotlin class , even before constructor also
    init {
        println("from init")
    }
}