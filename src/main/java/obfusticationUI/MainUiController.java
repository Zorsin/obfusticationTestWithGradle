package obfusticationUI;

/**
 * 11.01.2018
 *
 * @author SWirries
 * <p>
 * This code is
 * documentation enough
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import obfusticatonComponent.DoSomeThing;

public class MainUiController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private TextField textFieldText;

  @FXML
  private TextField textFieldPassword;

  @FXML
  private Label lableOutput;

  @FXML
  private Button buttonDoit;

  @FXML
  void initialize() {
    assert textFieldText != null : "fx:id=\"textFieldText\" was not injected: check your FXML file 'mainui.fxml'.";
    assert textFieldPassword != null : "fx:id=\"textFieldPassword\" was not injected: check your FXML file 'mainui.fxml'.";
    assert lableOutput != null : "fx:id=\"lableOutput\" was not injected: check your FXML file 'mainui.fxml'.";
    assert buttonDoit != null : "fx:id=\"buttonDoit\" was not injected: check your FXML file 'mainui.fxml'.";
    buttonDoit.setOnAction(event -> onButtonClick());

  }

  public void onButtonClick(){
    DoSomeThing someThing = new DoSomeThing(textFieldText.getText(),textFieldPassword.getText());
    lableOutput.setText(someThing.makeSomeThingStupid());

  }


}
