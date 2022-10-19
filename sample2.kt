package com.example.kotlinpractice

fun main() {
    checkNum(1)
}

fun maxby(a:Int,b:Int):Int {
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxby2(a:Int,b:Int) :Int=if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2 -> println("this is 2 or 3")
        else -> println("i don`t know")
    }

    var b:Int = when(score){
        1->1
        2->2
        else ->3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80-> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement

//1.Expression -> 코틀린의 모든 함수. 값을 반환하면 Expression
//2.Statement -> 반환하지 않고 명령만 내린다면 Statement

fun array(){
    val array = arrayOf(1,2,3) //Array : Int
    val list = listOf(1,2,3)  //List : Int

    val array2 = arrayOf(1,"e",3.4f) //Arrat : Any
    val list2 = listOf(4,"s",2.1f) //list : Any

    array[0]=4 //array는 값 변경이 가능하다
    //list[0]=4
    // 일반 list는 값 변경이 불가능하다
    var result = list.get(0)  //빼올순있다

    //list는 두개의 인터페이스를 상속

    val arrayList = arrayListOf<Int>()
    //속에 들어있는 값은 바뀌더라도 참조변수 안의 주소값은 바뀌지 않기 때문에 val을 써도 무관하다.
    arrayList.add(1)
    arrayList.add(2)

    //arrayList = arrayListOf<Int>()
    //이건 이제 새 객체를 만드는거라서 안된다.(주소값이 바뀌기 때문!!)


}