package com.example.ui;

import com.example.shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * 図形を描画するJPanel拡張クラス。
 * マウスクリックで図形を追加できる。
 */
public class ShapePanel extends JPanel {
    private List<Shape> shapes;

    /**
     * コンストラクタ。
     * @param shapes 描画する図形のリスト
     */
    public ShapePanel(List<Shape> shapes) {
        this.shapes = shapes;
        setBackground(Color.WHITE);

        // マウスクリックイベントで円を追加する例
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shapes.add(new com.example.shapes.Circle(e.getX(), e.getY(), 30, Color.MAGENTA));
                repaint();
            }
        });
    }

    /**
     * パネルを描画するときに呼ばれるメソッド。
     * すべての図形を描画する。
     * @param g Graphicsオブジェクト
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
}
