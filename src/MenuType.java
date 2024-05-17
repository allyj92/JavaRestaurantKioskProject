public enum MenuType {
    GIMBAP(1, 1000),
    EGGGIMBAP(2, 1500),
    CHUNGMOOGIMBAP(3, 1000),
    TTEOKBOKKI(4, 2000);

    private final int numberOfMenu;
    private final int priceMenu;

    MenuType(int numberOfMenu, int priceMenu) {
        this.numberOfMenu = numberOfMenu;
        this.priceMenu = priceMenu;
    }

    public int getNumberOfMenu() {
        return numberOfMenu;
    }

    public int getPriceMenu() {
        return priceMenu;
    }


}