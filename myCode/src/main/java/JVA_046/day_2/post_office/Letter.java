package JVA_046.day_2.post_office;

public class Letter {

    private String text;
    private Person fromName;
    private Person toName;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getFromName() {
        return fromName;
    }

    public void setFromName(Person fromName) {
        this.fromName = fromName;
    }

    public Person getToName() {
        return toName;
    }

    public void setToName(Person toName) {
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
