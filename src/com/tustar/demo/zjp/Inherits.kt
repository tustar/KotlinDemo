package com.tustar.demo.zjp

/**
 * Created by tustar on 17-7-27.
 */
open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B") // 接口的成员变量默认是 open 的
    }

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    /* 编译器会要求复写 f(),可以同时从 A 和 B 中继承方法,而且 C 继承 a() 或 b()
     的实现没有任何问题,因为它们都只有一个实现。但是 f() 有两个实现,因此我们在 C 中必须复写 f() 并且提供自己的实现来消除歧义。

     */
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}

fun main(args: Array<String>) {
    C().f()
}