import java.util.Scanner;
public class motherboard {
    public String mb_name;
    public int mb_year;
    public float mb_price;

    public motherboard(String name, int year, float price) {
        mb_name = name;
        mb_year = year;
        mb_price = price;
    }
    public motherboard(float price){
        mb_price = price;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название материнской платы");
        mb_name = in.nextLine();
        System.out.println("Введите год выпуска");
        mb_year = in.nextInt();
        System.out.println("Введите цену материнской платы");
        mb_price = in.nextFloat();
    }

    public void output(){
        System.out.println(" название материнской платы: " + mb_name + " количество ядер: " + mb_year + " цена " + mb_price);
    }

}