package Lab11;

public class ReplacePairs {
    String string;

    public ReplacePairs(String str) {
        this.string = str;
    }

    public void setString(String str) {
        this.string = str;
    }

    public String replace(){
        return this.string.replaceAll("(.)\\1", "$1");
    }
}

