import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Note {
    private String name;
    private Date date;
    private List<content> contents;

    public Note(String name, Date date) {
        this.name = name;
        this.date = date;
        this.contents = new ArrayList<>();
    }

    public void addContent(content newContent) {
        this.contents.add(newContent);
    }

    public List<content> getContents() {
        return contents;
    }
}

