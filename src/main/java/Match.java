public class Match {
    private int id;
    private String matchName;

    public Match() {
    }

    public Match(int id, String matchName) {
        this.id = id;
        this.matchName = matchName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }
}
