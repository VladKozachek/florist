package florist.controller;
import florist.model.accessories.Accessories;
import florist.model.flowers.Flowers;

import java.util.*;

public class BouquetController {

    ArrayList<Flowers>bouquetList =new ArrayList<>();
    ArrayList<Accessories>accessoriesList =new ArrayList<>();
    private double summFlowers =0;
    private double summAcceroriess =0;

    public void addFlowers(Flowers flowers){    //добавляем цветы в букет
        bouquetList.add(flowers);
    }
    public void addAccessories(Accessories accessories){    //добавляем аесессуары в букет
        accessoriesList.add(accessories);
    }

    public void costCalculation(){  // считаем стоимость букета
        for (Flowers  item:bouquetList){
            summFlowers = summFlowers +item.getPrice();
        }
        for (Accessories item:accessoriesList){
            summAcceroriess = summAcceroriess +item.getPrice();
        }
    }
    public void showBouquet(){
        System.out.println("Букет из :");
        for (Flowers item:bouquetList){
            System.out.println("Название цветка : "+item.getName() );
            System.out.println("        Свежесть : "+item.getFreshFlowers());
            System.out.println("        Цена цветка : "+item.getPrice());
            System.out.println("        Длина стебля : "+item.getLengthOfStem());
        }
        for (Accessories item:accessoriesList){
            System.out.println("Название акссессура - "+item.getNameAccessories());//
            System.out.println("        Цвет аксессуара :    "+item.getColor());
            System.out.println("        Цена   :"+item.getPrice());
        }
        System.out.println("Cумма букета - "+ summFlowers+summAcceroriess);
        System.out.println("_________________________________________________");
    }
    public void sortFlowers () {  //сортируем цветы в букете по свежести
        System.out.println("Отсортированный букет");
            Collections.sort(bouquetList, new Comparator<Flowers>() {
                @Override
                public int compare(Flowers f1, Flowers f2) {
                    return f1.getFreshFlowers().compareTo(f2.getFreshFlowers());
                }
            });
            showBouquet();
        }

        public void  searchFlower(){ //ищем цветок соответствующий заданному диапазону длин стеблей
          int count=0;
            System.out.println("Введите диапазон длины стебля : ");
            Scanner sc=new Scanner(System.in);
            System.out.println("от - ");
            int lenghtA=sc.nextInt();
            System.out.println("до - ");
            int lenghtB=sc.nextInt();
            if (lenghtB<lenghtA){
                System.out.println("Ошибка ввода диапазона!!!");
            }
            ArrayList<Integer>tempList=new ArrayList<>();
            for(int i=lenghtA;i<lenghtB;i++){     //записываем диапазон в лист
                tempList.add(i);
            }
           for (Flowers item:bouquetList){   //проходим по листу с цветами
             for (int j:tempList){     //проходим по диапазону
                if(item.getLengthOfStem()==j){   //проверяем есть ли в диапазоне нужная длина, если есть выводим имя
                    System.out.println(item.getName()+" - длина стебля "+item.getLengthOfStem());
                    count++; //записываем сколько совпадений, если 0, то дальше выводим, что размера нет
                }
             }
           }
            if(count==0){
                System.out.println("Указыного размера нет!");
            }
        }


}

