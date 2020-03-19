package jp.techacademy.yoshiaki.myapplication
import android.util.Log
import kotlin.math.log

open class Human :Animal,Thinkable{
    constructor(name:String,age:Int,hobby:String):super(name,age,hobby){
    }

    override fun say() {
        Log.d("kadai","私の名前は"+name+"です。年は"+age+"歳です")
    }

    override fun think() {
        Log.d("kadai","私は"+hobby+"について考える。")
    }
}