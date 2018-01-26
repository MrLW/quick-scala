package com.lw.chapter07

package com {
  package horstmann {
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }
    
    package impatient {
      class TestUtils {
        val s = new collection.mutable.ArrayBuffer
        val salary = 100.0 ;
        def giveRaise(rate:Double){
           Utils.percentOf(salary, rate);
        }
      }
    }
  }
}

/**
 * 作用域
 */
object Package02 {

}