package jp.techacademy.yoshiaki.myapplication

abstract class Animal {
    //プロパティ
    var name:String
    var age:Int


    constructor(name:String,age:Int){
        this.name=name
        this.age=age

    }
    abstract fun say()

}