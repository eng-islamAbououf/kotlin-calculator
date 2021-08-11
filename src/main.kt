fun main() {

    // test main
    try {
        // read first number
        print("Please Enter first number : ")
        var num1 : Double = readLine()!!.toDouble()
        //read the second number
        print("Please Enter second number : ")
        var num2 : Double= readLine()!!.toDouble()
        //read operation
        print("Please Enter operation : ")
        var op :Char = readLine()!![0]
        // calculate result
        calculate(num1,num2,op)
    }catch (e: NumberFormatException){
        println(e)
    }
//    calculate(3.0,5.0,'+')
//    calculate(3.0,5.0,'*')
//    calculate(3.0,5.0,'/')
//    calculate(3.0,5.0,'%')
}

/**
 * This fun should take 3 pram and calculate the result then print it
 *
 * @param number1 the first number
 * @param number2 the second number
 * @param op the operation that can help us to calculate the result
 * @author islam Abououf
 *
 */
fun calculate(number1 : Double,number2 : Double , op : Char){
    when(op){
        '+'->println("($number1) $op ($number2) = ${add(number1,number2)}")
        '-'->println("($number1) $op ($number2) = ${subtract(number1,number2)}")
        '*'->println("($number1) $op ($number2) = ${multiply(number1,number2)}")
        '/'->println("($number1) $op ($number2) = ${division(number1,number2)}")
        '%'->println("($number1) $op ($number2) = ${mod(number1,number2)}")
        else ->println("Invalid Operation")
    }
}

private fun add(number1 : Double,number2 : Double ):Double {return number1+number2}

private fun subtract(number1 : Double,number2 : Double ):Double{return number1-number2}

private fun multiply(number1 : Double,number2 : Double ):Double{return number1*number2}

private fun division(number1 : Double,number2 : Double ):Double{return number1/number2}

private fun mod(number1 : Double,number2 : Double ):Double{return number1%number2}