import javax.swing.*;

public class DisplayGUI {
    private Note note;

    public DisplayGUI(Note note) {
        this.note = note;
    }

    public void show() {
        JFrame frame = new JFrame("Display Content");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        for (content c : note.getContents()) {
            frame.add(c.display());
        }

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
