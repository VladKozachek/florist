package florist.view;

import florist.controller.BouquetController;
import florist.model.accessories.*;
import florist.model.flowers.*;

public class View {
    BouquetController bouquetController = new BouquetController();
    Tulip tulip2 = new Tulip(500, FreshFlowers.OLD, 150);  //создаем цветы
    Rose rose = new Rose(300, FreshFlowers.FRESH, 200);
    Tulip tulip = new Tulip(500, FreshFlowers.MEDIUM, 150);
    Violet violet = new Violet(200, FreshFlowers.MEDIUM, 165);
    Rose rose3 = new Rose(200, FreshFlowers.OLD, 175);
    Violet violet2 = new Violet(200, FreshFlowers.FRESH, 175);
    Violet violet3 = new Violet(200, FreshFlowers.OLD, 175);

    Paper paper = new Paper(Color.RED, 10);  //создаем аксессуары
    Tape tape = new Tape(Color.GREEN, 15);
    Ttwine ttwine = new Ttwine(Color.BLUE, 20);

    public void bouquetCreation() {
        bouquetController.addFlowers(violet);  //добавляем цветы в букет
        bouquetController.addFlowers(rose);
        bouquetController.addFlowers(tulip2);
        bouquetController.addFlowers(tulip);
        bouquetController.addFlowers(violet2);
        bouquetController.addFlowers(violet3);
        bouquetController.addFlowers(rose3);

        bouquetController.addAccessories(paper);  // //добавляем аксессуары в букет
        bouquetController.addAccessories(tape);
        bouquetController.addAccessories(ttwine);

        bouquetController.showBouquet();   // выводим собранный букет
        bouquetController.costCalculation();
        bouquetController.sortFlowers();  //сортируем букет по свежести
        bouquetController.searchFlower(); // Ищем цветы по  указаному диапазону длин


    }
}
