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
    //�ŏ�����
    CheckBox[] smallCrownBoxs = { new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�") };

    //�ő剤��
    CheckBox[] bigCrownBoxs = { new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�") };
    Text[] compTexts = { new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"),
            new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"),
            new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"),
            new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"), new Text("��"),
            new Text("��"), new Text("��"), new Text("��") };
    String[] minStrings = new String[30];
    String[] bigStrings = new String[30];

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        stage.setHeight(600);
        stage.setWidth(750);
        stage.setTitle("����͂񉤊�����肠�Ղ�");
        stage.setOnCloseRequest(event -> writeRecoad());

        //�����X�^�[�� 
        Text[] mTexts = { new Text("�h�X�W���O���X"), new Text("�N�������b�N"), new Text("�v�P�v�P"), new Text("�{���{���X"),
                new Text("�W�����g�h�X"), new Text("�g�r�J�K�`"), new Text("�A���W���i�t"), new Text("���I���C�A"), new Text("�c�B�c�B���b�N"),
                new Text("�p�I�E�����["), new Text("�h�X�M���I�X"), new Text("���h�o���L��"), new Text("���C�M�G�i"), new Text("�I�h�K����"),
                new Text("���I���E�X"), new Text("�f�B�A�u���X"), new Text("�L����"), new Text("�]���E�}�O�_���I�X"), new Text("�h�h�K�}��"),
                new Text("���I���C�A����"), new Text("�o�[���M�E�X"), new Text("���H���K�m�X"), new Text("�E���K���L��"), new Text("���I���E�X����"),
                new Text("�f�B�A�u���X����"), new Text("�l���M�K���e"), new Text("�e�I�E�e�X�J�g��"), new Text("�N�V�����_�I��"), new Text("���@���n�U�N"),
                new Text("�[�m�E�W�[���@") };

        //��؂�p
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

        Button wirteButton = new Button("�X�V");
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
            //���O�F�ŏ��F�ő� L
            GridPane.setConstraints(compTexts[i], 0, i);
            GridPane.setConstraints(mTexts[i], 1, i);
            GridPane.setConstraints(smallCrownBoxs[i], 2, i);
            GridPane.setConstraints(bigCrownBoxs[i], 3, i);
            //���O�F�ŏ��F�ő� R
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