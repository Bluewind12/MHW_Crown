import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * CrownCheck
 */
public class CrownCheck extends Application {

    private String fileName = "MHWText.txt";
    //モンスター名
    String[] monsterName = new String[30];
    Text[] mTexts = new Text[30];

    //金冠Check
    int[] bigCrown = new int[30];
    int[] smallCrown = new int[30];

    CheckBox[] bigCrownBoxs = new CheckBox[30];
    CheckBox[] smallCrownBoxs = new CheckBox[30];

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < monsterName.length; i++) {
                monsterName[i] = br.readLine();
                bigCrown[i] = Integer.parseInt(br.readLine());
                smallCrown[i] = Integer.parseInt(br.readLine());
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        Button reloadButton = new Button("更新");
        GridPane mGridPane = new GridPane();
        for (int i = 0; i < monsterName.length; i++) {
            mGridPane.add(mTexts[i], 0, i);
            mGridPane.add(bigCrownBoxs[i], 1, i);
            mGridPane.add(smallCrownBoxs[i], 2, i);
        }
        mGridPane.add(reloadButton, 0, 99);
        Scene topScene = new Scene(mGridPane);
        stage.setScene(topScene);
        stage.show();

    }
}