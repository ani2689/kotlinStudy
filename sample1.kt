package com.example.kotlinpractice

fun main() {
    helloWorld()
    add(1,3);

    val myName="Ani"
    val yourName="sh"

    println("My naame Is ${myName+yourName}! ")
    println("Is this True${1==0}")
    println("this is 2\$a")
}

fun helloWorld(){
    println("helloWorld!");
}

fun add(a:Int,b:Int):Int{
    return a+b
}

fun hi(){
    val a:Int = 10 //바뀌지 않는 상수 val
    var b:Int =10 //바꿀수 있는 변수 var

    b=100 //

    val c=100 //변수 선언 시 타입을 생략해도 된다
    var d=200 //        ``

    var name = "hi"
}

