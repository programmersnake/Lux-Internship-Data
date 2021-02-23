package JVA_046.day_2.post_office;

public class Letter {

    private String text;
    private String fromName;
    private String toName;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "text='" + text + '\'' +
                ", fromName='" + fromName + '\'' +
                ", toName='" + toName + '\'' +
                '}';
    }
}
