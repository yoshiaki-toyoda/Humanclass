package jp.techacademy.yoshiaki.myapplication
import android.util.Log
import kotlin.math.log

open class Human :Animal,Thinkable{

    var hobby: String

    constructor(name:String, age:Int, hobby:String):super(name,age) {
        this.hobby=hobby
    }

    override fun say() {
        Log.d("kadai","私の名前は"+name+"です。年は"+age+"歳です")
    }

    override fun think() {
        Log.d("kadai","私は"+hobby+"について考える。")
    }
}