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
    //�����X�^�[�� 
    Text[] mTexts = { new Text("�h�X�W���O���X"), new Text("�N�������b�N"), new Text("�v�P�v�P"), new Text("�{���{���X"), new Text("�W�����g�h�X"),
            new Text("�g�r�J�K�`"), new Text("�A���W���i�t"), new Text("���I���C�A"), new Text("�c�B�c�B���b�N"), new Text("�p�I�E�����["),
            new Text("�h�X�M���I�X"), new Text("���h�o���L��"), new Text("���C�M�G�i"), new Text("�I�h�K����"), new Text("���I���E�X"),
            new Text("�f�B�A�u���X"), new Text("�L����"), new Text("�]���E�}�O�_���I�X"), new Text("�h�h�K�}��"), new Text("���I���C�A����"),
            new Text("�o�[���M�E�X"), new Text("���H���K�m�X"), new Text("�E���K���L��"), new Text("���I���E�X����"), new Text("�f�B�A�u���X����"),
            new Text("�l���M�K���e"), new Text("�e�I�E�e�X�J�g��"), new Text("�N�V�����_�I��"), new Text("���@���n�U�N"), new Text("�[�m�E�W�[���@") };

    CheckBox[] bigCrownBoxs = { new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"), new CheckBox("�ő�"),
            new CheckBox("�ő�"), };
    CheckBox[] smallCrownBoxs = { new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"), new CheckBox("�ŏ�"),
            new CheckBox("�ŏ�"), };

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