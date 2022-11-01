import java.util.Scanner;
public class cpu {
    public String cp_name;
    public int cp_core;
    public float cp_price;

    public cpu(String name, int core, float price) {
        cp_name = name;
        cp_core = core;
        cp_price = price;
    }
    public cpu(float price){
        cp_price = price;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название процессора");
        cp_name = in.nextLine();
        System.out.println("Введите количество ядер");
        cp_core = in.nextInt();
        System.out.println("Введите цену процессора");
        cp_price = in.nextFloat();
    }

    public void output(){
        System.out.println(" название процессора: " + cp_name + " количество ядер: " + cp_core + " цена " + cp_price);
    }

}