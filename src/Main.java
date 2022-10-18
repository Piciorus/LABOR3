public class Main {
    public static void main(String[] args) {
        Storage storage=new Storage();
        Produkt produkt=new Produkt("Produkt1", 100, 200);
        Produkt produkt1=new Produkt("Produkt2", 200, 100);
        Produkt produkt2=new Produkt("Produkt3", 300, 300);
        Produkt produkt3=new Produkt("Produkt4", 400, 400);
        Produkt produkt4=new Produkt("Produkt5", 500, 500);
        Produkt produkt5=new Produkt("Produkt6", 600, 600);
        storage.add(produkt);
        storage.add(produkt1);
        storage.add(produkt2);
        storage.add(produkt3);
        storage.add(produkt4);
        storage.add(produkt5);
        storage.print();
    }
}