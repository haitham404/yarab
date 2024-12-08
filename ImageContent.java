import javax.swing.*;
import java.awt.*;
public class ImageContent extends content{
    private String fileNmae;

    public ImageContent(String fileNmae) {
        this.fileNmae = fileNmae;
    }

    public String getFileNmae() {
        return fileNmae;
    }

    public void setFileNmae(String fileNmae) {
        this.fileNmae = fileNmae;
    }
    @Override
    public JComponent display(){
        ImageIcon image=new ImageIcon(fileNmae);
        JLabel jLabel=new JLabel(image);
        return jLabel;
    }
}
