import java.util.Scanner;

public class pc {
    private static cpu cpu;
    private static gpu gpu;
    private static motherboard motherboard;
    private static ram ram;
    private static hdd hdd;

    public pc(cpu _cpu, gpu _gpu, motherboard _motherboard, ram _ram, hdd _hdd){
        cpu = _cpu;
        gpu = _gpu;
        motherboard = _motherboard;
        ram = _ram;
        hdd = _hdd;
    }

    public pc(cpu _cpu){
        cpu = _cpu;
    }

    public static void input() {
        cpu.input();
        gpu.input();
        motherboard.input();
        ram.input();
        hdd.input();
    }

    public static void output() {
        cpu.output();
        gpu.output();
        motherboard.output();
        ram.output();
        hdd.output();
    }

    public static float sum(){
        float sum;
        sum = cpu.cp_price + gpu.gp_price + motherboard.mb_price + ram.rm_price + hdd.hd_price;
        System.out.println("итоговая сумма: " + sum );
        return sum;
    }

    public static void check(){
        if(cpu.cp_price > gpu.gp_price){
            System.out.println("видеокарта не оптимальна подобрана под процессор, рекомендуем выбрать подороже видеокарту или более бюджетный процессор");
            int a;
            System.out.println("вы будете менять видеокарту или процессор?\n 1-карту,0-процессор\n");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            if(a==1)
                gpu.input();
            else
                cpu.input();

        }
    }
}