import javax.swing.*;
import java.util.List;

public class TextContent extends content {
private List<String>words;

    public TextContent(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }
@Override
  public JComponent display(){
        StringBuilder stringBuilder=new StringBuilder();
      for (String x:words) {
          String y=x+" ";
          stringBuilder.append(y);
      }
      return new JLabel(stringBuilder.toString());
  }
}

