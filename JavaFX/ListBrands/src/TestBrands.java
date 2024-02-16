public class TestBrands {
    public static void main(String[] args) {
        Brands brands = new Brands("BMW, Audi, VW, Ford, Opel, Renault, Peugeot, Citroen, Mercedes, Fiat");
        System.out.println(brands);

        brands.alphabetic();
        System.out.println(brands);
        brands.alphabeticDescending();
        System.out.println(brands);
    }
}
