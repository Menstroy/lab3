import java.util.Scanner;
public class hdd {
    public String hd_name;
    public int hd_volume;
    public float hd_price;

    public hdd(String name, int volume, float price) {
        hd_name = name;
        hd_volume = volume;
        hd_price = price;
    }
    public hdd(float price){
        hd_price = price;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название жесткого диска");
        hd_name = in.nextLine();
        System.out.println("Введите объем жесткого диска");
        hd_volume = in.nextInt();
        System.out.println("Введите цену жесткого диска");
        hd_price = in.nextFloat();
    }

    public void output(){
        System.out.println(" название жесткого диска: " + hd_name + " объем: " + hd_volume + " цена " + hd_price);
    }

}