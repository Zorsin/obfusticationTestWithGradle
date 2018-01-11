package obfusticatonComponent;

/**
 * 11.01.2018
 *
 * @author SWirries
 * <p>
 * This code is
 * documentation enough
 */
public class DoSomeThing {

  String text;
  String password;

  public DoSomeThing(String text, String password) {
    this.text = text;
    this.password = password;
  }

  public String makeSomeThingStupid(){
    char[] textChars = text.toCharArray();
    char[] passwordChars = password.toCharArray();
    int shorterLenght = textChars.length >= passwordChars.length?passwordChars.length : textChars.length;
    StringBuilder stringBuilder = new StringBuilder();
    for(int i =0; i<shorterLenght-1;i++){
      stringBuilder.append(textChars[i]);
      stringBuilder.append(passwordChars[i]);
    }
    return stringBuilder.toString();
  }
}
