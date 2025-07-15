/**
 * @author せぱた
 */

package com.example.app;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.List;

import com.example.shapes.Circle;
import com.example.shapes.Rectangle;
import com.example.shapes.Triangle;
import com.example.shapes.Shape;
import com.example.ui.ShapePanel;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shape Drawing Tool");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(new Circle(100, 100, 50, Color.RED));
            shapeList.add(new Rectangle(220, 60, 120, 80, Color.BLUE));
            shapeList.add(new Triangle(
                new int[]{380, 430, 480},
                new int[]{160, 60, 160},
                Color.GREEN
            ));

            frame.add(new ShapePanel(shapeList));
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
