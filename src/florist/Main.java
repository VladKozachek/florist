package florist;

public class Main {
    public static void main(String[] args) {
        BouquetCollector bouquetCollector=new BouquetCollector();
        Rose rose=new Rose(300,FreshFlowers.FRESH,200);
        Tulip tulip=new Tulip(500,FreshFlowers.MEDIUM,150);
        Violet violet=new Violet(200,FreshFlowers.OLD,175);
        bouquetCollector.creationBouquet(violet);
        bouquetCollector.creationBouquet(rose);
        bouquetCollector.creationBouquet(tulip);
        bouquetCollector.costCalculation();

    }
}
