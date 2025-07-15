package com.example.shapes;

import java.awt.*;

/**
 * 円を表すクラス。
 * 中心座標と半径、色を持つ。
 */
public class Circle extends Shape {
    private int radius;

    /**
     * コンストラクタ。
     * @param x 中心のX座標
     * @param y 中心のY座標
     * @param radius 半径
     * @param color 描画色
     */
    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    /**
     * 円を描画する。
     * @param g Graphicsオブジェクト
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
