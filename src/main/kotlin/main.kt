import com.sun.prism.PixelFormat
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage
import java.io.DataInput
import java.util.ArrayList

fun main(args: Array<String>) {
    println("enter  qq to end")
 var num1: Int = 0
 var num2 :Int = 0
 var op:String = ""
    var x=1
    while (true) {
        try {
            when (x) {

                1 -> {
                    println("plz enter 1st value")
                    num1 = readLine()!!.toInt()
                    x++
                }
                2 -> {
                    println("plz enter 2nd value")
                    num2 = readLine()!!.toInt()
                    x++
                }
                3 -> {
                    println("plz enter a operation (+,-,%,*,/)")
                    op = readLine()!!
                    if (op == "+" || op == "-" || op == "*" || op == "/" || op == "%") {
                        break
                    } else
                        throw Exception()
                }
            }

        } catch (e: Exception) {
            when (x) {
                1 -> {
                    println("this input not  a number")
                }
                2 -> {
                    println("this input  not  a number")
                }
                3 -> {

                    println("this's not a operation")
                }
            }
        }
    }

println(calc(num1,num2,op))

 /*   for (i in 1..x){
        println("plz enter 1st value:")
       var n1= readLine()
        if ( n1==null){
            x++
        }else{
            num1=n1.toInt()
            x=1
            for (i in 1..x){

                println("plz enter  a operation:")
                 var opin= readLine()!!.toString()
                if (opin==null){
                    x++
                }else{x=1
                    op=opin
                    for (i in 1..x){
                        x=1
                        println("plz enter 2nd value:")
                          var n2= readLine()
                        if (n2==null){
                            x++
                        }else{
                            num2=n2.toInt()
                        }
                    }
                }
            }
        }
    }*/

}
fun calc(n1:Int,n2:Int,op:String):String{
    when(op){
        "+"->{return "($n1 $op $n2 )= ${n1+n2}" }
        "-"->{return "($n1 $op $n2 )= ${n1+n2}" }
        "*"->{return "($n1 $op $n2 )= ${n1+n2}" }
        "/"->{return "($n1 $op $n2 )= ${n1.toDouble()/n2}" }
        "%"->{return "($n1 $op $n2 )= ${n1%n2}" }
        else->
            return "Not true"
    }
}