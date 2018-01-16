public class Change {

    char from;
    char to;

    public Change(char fromCharacter, char toCharacter) {
        this.from = fromCharacter;
        this.to = toCharacter;
    }

    public String change(String word) {
        return String.valueOf(word).replace(from, to);
    }

}
