import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * CrownCheck
 */
public class CrownCheck extends Application {
    //モンスター名 
    Text[] mTexts = { new Text("ドスジャグラス"), new Text("クルルヤック"), new Text("プケプケ"), new Text("ボルボロス"), new Text("ジュラトドス"),
            new Text("トビカガチ"), new Text("アンジャナフ"), new Text("リオレイア"), new Text("ツィツィヤック"), new Text("パオウルムー"),
            new Text("ドスギルオス"), new Text("ラドバルキン"), new Text("レイギエナ"), new Text("オドガロン"), new Text("リオレウス"),
            new Text("ディアブロス"), new Text("キリン"), new Text("ゾラ・マグダラオス"), new Text("ドドガマル"), new Text("リオレイア亜種"),
            new Text("バゼルギウス"), new Text("ヴォルガノス"), new Text("ウラガンキン"), new Text("リオレウス亜種"), new Text("ディアブロス亜種"),
            new Text("ネルギガンテ"), new Text("テオ・テスカトル"), new Text("クシャルダオラ"), new Text("ヴァルハザク"), new Text("ゼノ・ジーヴァ") };

    CheckBox[] bigCrownBoxs = { new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), };
    CheckBox[] smallCrownBoxs = { new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), };

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        GridPane mGridPane = new GridPane();
        mGridPane.setHgap(10);
        mGridPane.setVgap(10);
        for (int i = 0; i < 30; i++) {
            GridPane.setConstraints(mTexts[i], 0, i);
            GridPane.setConstraints(bigCrownBoxs[i], 1, i);
            GridPane.setConstraints(smallCrownBoxs[i], 2, i);
        }
        for (int k = 0; k < 30; k++) {
            mGridPane.getChildren().add(mTexts[k]);
            mGridPane.getChildren().add(bigCrownBoxs[k]);
            mGridPane.getChildren().add(smallCrownBoxs[k]);
        }
        Scene topScene = new Scene(mGridPane);
        stage.setScene(topScene);
        stage.show();

    }
}