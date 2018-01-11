package obfusticationUI;/**
 * 11.01.2018
 *
 * @author SWirries
 * <p>
 * This code is
 * documentation enough
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
      primaryStage.setTitle("its something");

    try {
      Parent root = FXMLLoader.load(this.getClass().getResource("/mainui.fxml"));
      primaryStage.setScene(new Scene(root,400,400));

      primaryStage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
