public class Nardi {
    int amountOfChips;
    int amountOfDices;
    int amountOfArmenians;
    boolean oneOfArmeniansIsAshot;
    boolean secondOfArmenianIsAleksan;
    String firstPlayerName;
    String secondPlayerName;

    public Nardi(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public Nardi(int amountOfChips, int amountOfDices, int amountOfArmenians, boolean oneOfArmeniansIsAshot, boolean secondOfArmenianIsAleksan, String firstPlayerName, String secondPlayerName) {
        this.amountOfChips = amountOfChips;
        this.amountOfDices = amountOfDices;
        this.amountOfArmenians = amountOfArmenians;
        this.oneOfArmeniansIsAshot = oneOfArmeniansIsAshot;
        this.secondOfArmenianIsAleksan = secondOfArmenianIsAleksan;
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public Nardi(int amountOfChips, int amountOfDices, int amountOfArmenians, boolean oneOfArmeniansIsAshot, boolean secondOfArmenianIsAleksan) {
        this.amountOfArmenians = amountOfArmenians;
        this.amountOfChips = amountOfChips;
        this.amountOfDices = amountOfDices;
        this.oneOfArmeniansIsAshot = oneOfArmeniansIsAshot;
        this.secondOfArmenianIsAleksan = secondOfArmenianIsAleksan;
    }

    public Nardi(int amountOfChips, int amountOfDices, boolean oneOfArmeniansIsAshot, boolean secondOfArmenianIsAleksan) {
        this.amountOfArmenians = 2;
        this.amountOfChips = amountOfChips;
        this.amountOfDices = amountOfDices;
        this.oneOfArmeniansIsAshot = oneOfArmeniansIsAshot;
        this.secondOfArmenianIsAleksan = secondOfArmenianIsAleksan;
    }

    public String goToHome() {
        return "Armenians go to home pretty swell";
    }

    public String winnerName() {
        double d = Math.random();

        if (d > 0.5) {
            return firstPlayerName;
        }
        return secondPlayerName;

    }
}
