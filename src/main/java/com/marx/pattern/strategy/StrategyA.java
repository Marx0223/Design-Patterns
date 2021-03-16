package com.marx.pattern.strategy;

/**
 * @version v1.0
 * @ClassName: StrategyA
 * @Description: 具体策略类，封装算法
 * @Author: Marx
 */
public class StrategyA implements Strategy {

    public void show() {
        System.out.println("买一送一");
    }
}
