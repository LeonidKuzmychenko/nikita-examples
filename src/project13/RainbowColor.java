package project13;

public enum RainbowColor {
    RED(1),
    ORANGE(2),
    YELLOW(3),
    GREEN(4),
    BLUE(5),
    INDIGO(6),
    VIOLET(7);

    private int rainbowNumber;

    RainbowColor(int rainbowNumber) {
        this.rainbowNumber = rainbowNumber;
    }

    public int getRainbowNumber() {
        return rainbowNumber;
    }
}