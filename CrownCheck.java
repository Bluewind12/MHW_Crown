import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * CrownCheck
 */
public class CrownCheck extends Application {
    //最小王冠
    CheckBox[] smallCrownBoxs = { new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"), new CheckBox("最小"),
            new CheckBox("最小") };

    //最大王冠
    CheckBox[] bigCrownBoxs = { new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"), new CheckBox("最大"),
            new CheckBox("最大") };
    Text[] compTexts = { new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"),
            new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"),
            new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"),
            new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"), new Text("●"),
            new Text("●"), new Text("●"), new Text("●") };
    String[] minStrings = new String[30];
    String[] bigStrings = new String[30];

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        stage.setHeight(600);
        stage.setWidth(750);
        stage.setTitle("もんはん王冠かんりあぷり");
        stage.setOnCloseRequest(event -> writeRecoad());

        //モンスター名 
        Text[] mTexts = { new Text("ドスジャグラス"), new Text("クルルヤック"), new Text("プケプケ"), new Text("ボルボロス"),
                new Text("ジュラトドス"), new Text("トビカガチ"), new Text("アンジャナフ"), new Text("リオレイア"), new Text("ツィツィヤック"),
                new Text("パオウルムー"), new Text("ドスギルオス"), new Text("ラドバルキン"), new Text("レイギエナ"), new Text("オドガロン"),
                new Text("リオレウス"), new Text("ディアブロス"), new Text("キリン"), new Text("ゾラ・マグダラオス"), new Text("ドドガマル"),
                new Text("リオレイア亜種"), new Text("バゼルギウス"), new Text("ヴォルガノス"), new Text("ウラガンキン"), new Text("リオレウス亜種"),
                new Text("ディアブロス亜種"), new Text("ネルギガンテ"), new Text("テオ・テスカトル"), new Text("クシャルダオラ"), new Text("ヴァルハザク"),
                new Text("ゼノ・ジーヴァ") };

        //区切り用
        Text[] sepTexts = { new Text("|"), new Text("|"), new Text("|"), new Text("|"), new Text("|"), new Text("|"),
                new Text("|"), new Text("|"), new Text("|"), new Text("|"), new Text("|"), new Text("|"), new Text("|"),
                new Text("|"), new Text("|") };
        //L
        GridPane mLGridPane = new GridPane();
        mLGridPane.setHgap(10);
        mLGridPane.setVgap(10);
        //R
        GridPane mRGridPane = new GridPane();
        mRGridPane.setHgap(10);
        mRGridPane.setVgap(10);

        HBox mainHbox = new HBox(20);
        mainHbox.setAlignment(Pos.CENTER);
        VBox addVBox = new VBox(20);
        addVBox.setAlignment(Pos.CENTER);
        VBox sepVBox = new VBox(10);

        Button wirteButton = new Button("更新");
        wirteButton.setOnAction(event -> writeRecoad());
        try {
            File file = new File("./MHWText.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 30; i++) {
                minStrings[i] = br.readLine();
                bigStrings[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 30; i++) {
            if (minStrings[i].equals("1")) {
                smallCrownBoxs[i].setSelected(true);
            } else {
                smallCrownBoxs[i].setSelected(false);
            }

            if (bigStrings[i].equals("1")) {
                bigCrownBoxs[i].setSelected(true);
            } else {
                bigCrownBoxs[i].setSelected(false);
            }
            if (minStrings[i].equals("1") && bigStrings[i].equals("1")) {
                compTexts[i].setFill(Color.GOLD);
            } else if (minStrings[i].equals("1") || bigStrings[i].equals("1")) {
                compTexts[i].setFill(Color.SILVER);
            } else {
                compTexts[i].setFill(Color.BLACK);
            }
        }
        for (int i = 0; i < 15; i++) {
            //名前：最小：最大 L
            GridPane.setConstraints(compTexts[i], 0, i);
            GridPane.setConstraints(mTexts[i], 1, i);
            GridPane.setConstraints(smallCrownBoxs[i], 2, i);
            GridPane.setConstraints(bigCrownBoxs[i], 3, i);
            //名前：最小：最大 R
            GridPane.setConstraints(compTexts[i + 15], 0, i);
            GridPane.setConstraints(mTexts[i + 15], 1, i);
            GridPane.setConstraints(smallCrownBoxs[i + 15], 2, i);
            GridPane.setConstraints(bigCrownBoxs[i + 15], 3, i);
        }
        for (int k = 0; k < 15; k++) {
            //L
            mLGridPane.getChildren().add(compTexts[k]);
            mLGridPane.getChildren().add(mTexts[k]);
            mLGridPane.getChildren().add(bigCrownBoxs[k]);
            mLGridPane.getChildren().add(smallCrownBoxs[k]);
            //R
            mRGridPane.getChildren().add(compTexts[k + 15]);
            mRGridPane.getChildren().add(mTexts[k + 15]);
            mRGridPane.getChildren().add(bigCrownBoxs[k + 15]);
            mRGridPane.getChildren().add(smallCrownBoxs[k + 15]);
        }
        for (int i = 0; i < 15; i++) {
            sepVBox.getChildren().add(sepTexts[i]);
        }
        mainHbox.getChildren().addAll(mLGridPane, sepVBox, mRGridPane);
        addVBox.getChildren().addAll(mainHbox, wirteButton);
        Scene topScene = new Scene(addVBox);
        stage.setScene(topScene);
        stage.show();

    }

    public void writeRecoad() {
        for (int i = 0; i < 30; i++) {
            if (smallCrownBoxs[i].isSelected()) {
                minStrings[i] = "1";
            } else {
                minStrings[i] = "0";
            }
            if (bigCrownBoxs[i].isSelected()) {
                bigStrings[i] = "1";
            } else {
                bigStrings[i] = "0";
            }
        }
        try {
            File file = new File("./MHWText.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 30; i++) {
                bw.write(minStrings[i]);
                bw.newLine();
                bw.write(bigStrings[i]);
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        reload();
    }

    public void reload() {
        try {
            File file = new File("./MHWText.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 30; i++) {
                minStrings[i] = br.readLine();
                bigStrings[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 30; i++) {
            if (minStrings[i].equals("1")) {
                smallCrownBoxs[i].setSelected(true);
            } else {
                smallCrownBoxs[i].setSelected(false);
            }

            if (bigStrings[i].equals("1")) {
                bigCrownBoxs[i].setSelected(true);
            } else {
                bigCrownBoxs[i].setSelected(false);
            }
            if (minStrings[i].equals("1") && bigStrings[i].equals("1")) {
                compTexts[i].setFill(Color.GOLD);
            } else if (minStrings[i].equals("1") || bigStrings[i].equals("1")) {
                compTexts[i].setFill(Color.SILVER);
            } else {
                compTexts[i].setFill(Color.BLACK);
            }
        }
    }

}