import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Note note = new Note("My Note", new Date());

            DisplayGUI displayGUI = new DisplayGUI(note);
            displayGUI.show();

    }
}
