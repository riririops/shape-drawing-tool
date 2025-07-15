package com.example.shapes;

import java.awt.*;

/**
 * 図形の抽象基底クラス。
 * 座標を持ち、描画メソッドをサブクラスで実装する。
 */
public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;

    /**
     * コンストラクタ。
     * @param x 図形の基準X座標
     * @param y 図形の基準Y座標
     * @param color 図形の描画色
     */
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * 図形を描画する抽象メソッド。
     * @param g Graphicsオブジェクト
     */
    public abstract void draw(Graphics g);
}
