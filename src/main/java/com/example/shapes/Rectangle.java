package com.example.shapes;

import java.awt.*;

/**
 * 長方形を表すクラス。
 * 左上座標、幅、高さ、色を持つ。
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    /**
     * コンストラクタ。
     * @param x 左上のX座標
     * @param y 左上のY座標
     * @param width 幅
     * @param height 高さ
     * @param color 描画色
     */
    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    /**
     * 長方形を描画する。
     * @param g Graphicsオブジェクト
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
