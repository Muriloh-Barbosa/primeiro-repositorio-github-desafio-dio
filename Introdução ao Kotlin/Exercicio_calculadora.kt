import com.sun.jdi.Value
import java.util.*

fun main(args:Array<String>){
    print("Enter number 1:")
    var number1:Float = readLine()!!.toFloat() // readLine() is used to accept the String value and ".toInt()" will convert the string to  Int.
    print("Enter number 2:")
    var number2:Float = readLine()!!.toFloat()


    val scanner = Scanner (System.`in`)
    print( "Enter operator (* , / , + , -): ")
    val operator  = scanner.nextLine()[0]

    val result: Float

    when (operator) {
       '*' -> result = number1 * number2
       '/' -> result = number1 / number2
       '+' -> result = number1 + number2
       '-'-> result = number1 - number2
        else -> {
            print("Operador não exite!")
            return
        }
    }
    println( "O resultado entre a operacao dos numeros $number1 e $number2 = $result ")

}