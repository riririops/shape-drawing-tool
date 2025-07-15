package com.example.shapes;

import java.awt.*;

/**
 * 三角形を表すクラス。
 * 頂点のX座標配列、Y座標配列、色を持つ。
 */
public class Triangle extends Shape {
    private int[] xPoints;
    private int[] yPoints;

    /**
     * コンストラクタ。
     * @param xPoints 頂点のX座標配列（3点）
     * @param yPoints 頂点のY座標配列（3点）
     * @param color 描画色
     */
    public Triangle(int[] xPoints, int[] yPoints, Color color) {
        super(0, 0, color);  // x,yは使わないので0にセット
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    /**
     * 三角形を描画する。
     * @param g Graphicsオブジェクト
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
