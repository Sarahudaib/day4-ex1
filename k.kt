package com.example.kotlin

fun main() {
addNumbers(1.2 ,3.5)

addNumbers(.9 , 4.4 , "")
}
fun addNumbers(num1:Double, num2: Double, opra: String= "+" ){
   val result= num1+num2
    println ("result is $result $opra")

}