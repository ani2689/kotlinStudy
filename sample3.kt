package com.example.kotlinpractice

fun main() {
    forAndWhile()
}

fun forAndWhile(){
    val student = arrayListOf("설희","혜린","예빈","선진")

    for (name in student){
        println("${name}")
    }

    var sum=0
    for(i in 10 downTo 1){
        sum+=i
    }
    println(sum)

    sum=0
    for(i in 10 until  1){
        sum+=i
    }
    println(sum)

    sum=0
    for(i in 1..10 ){
        sum+=i
    }
    println(sum)


    var index = 0

    while(index<10){
        println("current index : ${index}")
        index++
    }

    for((index, name) in student.withIndex()){
        println("${index+1}번째 인덱스값 : ${name}")
    }
}

//Nullable /NorNull

fun nullCheck(){
    //NPE : Null Point Exception
    //자바는 Null을 실행중에 잡는다. 하지만 코틀린은 컴파일 중에 잡아 안전성을 확보한다.

    var name :String = "ani" //null이면 안됨
    //var name :String = null
    var nullName :String? = null //물음표를 붙아면 널 타입이 가능한 변수가 됨.

    var nameInUpperCase = name.toUpperCase()
    var NullNameInUpperCase = nullName?.toUpperCase() //만약 nullName에 null이 들어있다면 널을 반환. 나중에 오류 날 일이 없다.


}
