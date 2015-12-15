/*
 * 作者：孙福生
 *
 * GitHub：https://github.com/sfsheng0322
 *  微博：http://weibo.com/3852192525/profile?topnav=1&wvr=6
 *
 *  Copyright (c) 2015.
 */

package com.sun.study.module.HighQualityCode;

/**
 * Created by sunfusheng on 15/12/11.
 */
public class _1_Methods_and_Rules {

    /**
     * 第一章 Java开发中通用的方法贺准则
     *
     * The reasonable man adapts himself to the world; the unreasonable one
     * persists in trying to adapt the world to himself.
     * 明白事理的人使自己适应世界，不明白事理的人想让世界适应自己。－－萧伯纳
     *
     * 千里之行始于足下之基础
     */


    /**
     * 三元操作符的类型务必一致
     */
    public void suggestion3() {
        int i = 80;
        String s1 = String.valueOf(i < 100? 90:110);
        String s2 = String.valueOf(i < 100? 90:110.0);
        System.out.print("两者是否相等：" + s1.equals(s2)); // false
    }

    /**
     * 避免带有变长参数的方法重载
     *
     * 变长参数的规则：
     * 变长参数必须是方法中最后一个参数
     * 一个方法不能定义多个变长参数
     */

    /**
     * 警惕自增的陷阱，举个例子：看下面比较怪的代码
     * int count = 0;
     * count = count++; //平常我们是不会这么写的吧
     *
     * count++是一个表达式，是有返回值的，返回count自加前的值，这句代码等效如下：
     * int temp = count;
     * count = count + 1;
     * return temp;
     */

    /**
     * SerialVersionUID 也叫做流标识符(Stream Unique Identifier)，即类的版本定义
     * 它可以显示定义，也可以隐式定义。
     * 显示定义：
     * private static final long serialVersionUID = XXXXXL;
     * 隐式定义：
     * 我们不用声明，编译器帮我们声明，生成的依据通过包名、类名、继承关系、非私有的方法和属性、
     * 以及参数、返回值等诸多因子计算得出，极度复杂，基本上计算出的这个值是唯一的。
     */

    /**
     * 易变业务使用脚本语言编写
     *
     * Java世界一值遭受着异种语言的入侵，比如PHP, Ruby, Groovy, JavaScript等，这些脚本语言都是在运行期解释执行的。
     *
     * 为什么Java这种强编译型需要这些脚本语言？因为脚本语言的三大特性：
     * 灵活：脚本语言一般都是动态类型，可以不用声明变量类型而直接使用，可以在运行期改变类型。
     * 便捷：脚本语言是一种解释性语言，不需要编译成二进制代码，也不需要像Java一样生成字节码，它的执行是依靠解释器解释的，
     *      因为在运行期变更代码非常容易，而且不用停止应用。
     * 简单：只能说部分脚本语言简单，比如Groovy，Java程序员若转到Groovy程序语言上，只需要两个小时，
     *      看完语法说明，看完Demo即可使用了，没有太多的技术门槛。
     */
}
