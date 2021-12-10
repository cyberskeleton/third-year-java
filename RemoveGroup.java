package Lab11;

public class RemoveGroup {
    String string;
    String group;

    public RemoveGroup(String str, String group) {
        this.string = str;
        this.group = group;
    }

    public void setString(String str) {
        this.string = str;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String remove() {
            return this.string.replaceAll(this.group, "");
        }
}
