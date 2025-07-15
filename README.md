# Shape Drawing Tool

## 概要

Java Swingを使ったシンプルな図形描画アプリケーションです。  
円、長方形、三角形の描画ができ、クリックで円を追加することも可能です。  
抽象クラス `Shape` を基底に複数の具体的図形クラスを実装しています。

---

## 動作環境

- JDK 21以上  
- Windows環境（パスやコマンドはWindows向け例）

---

## クラス概要

| クラス名     | 説明                                         |
|--------------|----------------------------------------------|
| `Main`       | アプリケーションのエントリポイント。GUIを初期化し起動する。 |
| `Shape`      | 図形の抽象基底クラス。座標と色を保持し、描画メソッドを持つ。   |
| `Circle`     | 円を表すクラス。中心座標と半径、色を持つ。                   |
| `Rectangle`  | 長方形を表すクラス。左上の座標、幅、高さ、色を持つ。         |
| `Triangle`   | 三角形を表すクラス。3つの頂点座標と色を持つ。                |
| `ShapePanel` | 図形の描画を行うJPanelの拡張クラス。マウスクリックで円を追加可能。 |

---

## ビルド・実行方法

1. プロジェクトルートに移動

   ```bash
   cd path/to/shape-drawing-tool

   <JDKのパス>/javac -d out --source-path src/main/java src/main/java/com/example/app/Main.java

   <JDKのパス>/java -cp out com.example.app.Main
    ```

---

## 開発者
作成者:せぱた
GitHub:riririops