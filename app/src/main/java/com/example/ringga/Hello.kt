package com.example.ringga

fun main(args: Array<String>) {
    biodata("Ringga Dwi Kusuma", 19)
    hobby("main game", "mengisi waktu luang dan meredakan stress")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("*===================================*")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("*===================================*")
}

fun hobby(nama:String, desc:String){
    println("Saya mempunyai hobby $nama")
    println("saya melakukannya untuk $desc")
}