package sample.hello.kotlin


fun main(args: Array<String>) {

    println("Hello Kotlin!")
	println(sum(1,2))
	
}

//定义函数
fun sum(a: Int, b: Int): Int {

    return a + b
}