package jp.techacademy.yoshiaki.myapplication

import android.util.Log

open class Dog{
    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(name:String,age:Int) {
        this.name = ""
        this.age = 0
    }

    //メゾット
    open fun say(){
        Log.d("kotolintest",this.name+"("+this.age+"歳)"+"[わんわん]")
    }
}

