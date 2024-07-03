class TapeDeckTestDrive {
    public static void main(String [] args) {
        TapeDeck t = new TapeDeck(); // this is line is added to solve
        t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
class TapeDeck {
    boolean canRecord = false;
    void playTape() {
    System.out.println("tape playing");
    }
    void recordTape() {
    System.out.println("tape recording");
    }
    }
