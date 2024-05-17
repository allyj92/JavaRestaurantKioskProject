

public enum MenuType {
    김밥(1, 1000),
    계란김밥(2, 1500),
    충무김밥(3, 1000),
    떡볶이(4, 2000),
    라면(5,3000),
    돈까스(6,5000),
    쫄면(7,3000);


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