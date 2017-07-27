package com.tustar.demo.zjp

/**
 * Created by tustar on 17-7-27.
 */
sealed class Expr {
    class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr() // 对象声明也可以继承密封类
}

class Const(val number: Double) : Expr() // 现在密封类的子类可以定义在类之外的源文件中

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    Expr.NotANumber -> Double.NaN
/*
 * 在这个when表达式中我们不需要else,因为这里面包含了所有case,Expr的子类是有限的,经过测试密封类本身是不能实例化
的。
 */
}

fun main(args: Array<String>) {
    eval(Expr.Sum(Const(2.0), Expr.NotANumber))
}