package sample.hello.kotlin


import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
	println("Hello Kotlin!")
	formatDate()
	
    
}

fun formatDate(){
	var sdf = SimpleDateFormat("yyyy-mm-dd  HH:mm:ss")
	var date:Date = Date()
	println(sdf.format(date))
}