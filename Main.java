public class Main {
    public static void main(String[] args) {
        float sum;
        cpu _cpu = new cpu("name", 0, 0);
        gpu _gpu = new gpu("name", 0, 0);
        motherboard _motherboard = new motherboard("name", 0, 0);
        ram _ram = new ram("name",0, 0);
        hdd _hdd = new hdd("name", 0, 0);
        pc pc = new pc(_cpu, _gpu, _motherboard, _ram, _hdd);
        pc.input();
        pc.check();
        pc.output();
        sum = pc.sum();
    }
}