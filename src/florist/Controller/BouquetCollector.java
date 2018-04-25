package florist.Controller;
import florist.flowers.Flowers;

import java.util.*;

public class BouquetCollector {

    private ArrayList<Flowers>bouquetList =new ArrayList<>();
    private double summ=0;

    public void creationBouquet(Flowers flowers){ //добавляем цветы в букет
        bouquetList.add(flowers);
    }
    public void costCalculation(){  // считаем стоимость букета
        for (Flowers item:bouquetList){
            summ=summ+item.getPrice();
        }
    }
    public void showBouquet(){
        System.out.println("Букет из :");
        for (Flowers item:bouquetList){
            System.out.print(" Название цветка :  "+item.getName()+"    Свежесть  :      "+item.getFreshFlowers()+"    Цена :    " +item.getPrice()+"    Длина стебля :    "+item.getLengthOfStem());
            System.out.println();
        }
        System.out.println("Cумма букета - "+summ);
    }
    public void sortFlowers () {  //сортируем цветы в букете по свежести
            Collections.sort(bouquetList, new Comparator<Flowers>() {
                @Override
                public int compare(Flowers f1, Flowers f2) {
                    return f1.getFreshFlowers().compareTo(f2.getFreshFlowers());
                }
            });
        }

        public void  searchFlower(){ //ищем цветок соответствующий заданному диапазону длин стеблей
          int count=0;
            String nameSerarchFlower;
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
                    nameSerarchFlower=item.getName();
                    System.out.println(nameSerarchFlower);
                    count++; //записываем сколько совпадений, если 0, то дальше выводим, что размера нет
                }
             }
           }
            if(count==0){
                System.out.println("Указыного размера нет!");
            }
        }
    }

