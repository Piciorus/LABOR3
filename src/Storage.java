import java.util.ArrayList;
import java.util.Collections;

public class Storage {
    ArrayList<Produkt> storage=new ArrayList<Produkt>();
    ArrayList<Produkt> steigendenNachfrage=new ArrayList<Produkt>();
    ArrayList<Produkt> stagnierendenNachfrage=new ArrayList<Produkt>();
    ArrayList<Produkt> fallendenNachfrage=new ArrayList<Produkt>();

    public ArrayList<Produkt> getStorage() {
        return storage;
    }

    public ArrayList<Produkt> getSteigendenNachfrage() {
        return steigendenNachfrage;
    }

    public ArrayList<Produkt> getStagnierendenNachfrage() {
        return stagnierendenNachfrage;
    }

    public ArrayList<Produkt> getFallendenNachfrage() {
        return fallendenNachfrage;
    }

    public void setStorage(ArrayList<Produkt> storage) {
        this.storage = storage;
    }

    public void setSteigendenNachfrage(ArrayList<Produkt> steigendenNachfrage) {
        this.steigendenNachfrage = steigendenNachfrage;
    }

    public void setStagnierendenNachfrage(ArrayList<Produkt> stagnierendenNachfrage) {
        this.stagnierendenNachfrage = stagnierendenNachfrage;
    }

    public void setFallendenNachfrage(ArrayList<Produkt> fallendenNachfrage) {
        this.fallendenNachfrage = fallendenNachfrage;
    }

    public void sortiert(){
        for( int i=0; i<storage.size(); i++){
            for(int j=0; j<storage.size(); j++){
                if(storage.get(i).getAmountProduziert()>storage.get(j).getAmountProduziert()){
                    Collections.swap(storage, i, j);
                }
            }
        }
    }

    public void add(Produkt produkt){
        if(produkt.getAmountProduziert()<produkt.getAmountVerkauft()){
            steigendenNachfrage.add(produkt);
        }
        else if(produkt.getAmountProduziert()==produkt.getAmountVerkauft()){
            stagnierendenNachfrage.add(produkt);
        }
        else{
            fallendenNachfrage.add(produkt);
        }

    }

    public void optimaleProduktion(Produkt produkt){
        if(produkt.getAmountProduziert()<produkt.getAmountVerkauft()){
            produkt.setAmountProduziert((float) (0.5*produkt.getAmountVerkauft()+produkt.getAmountProduziert()));
        }
        else if(produkt.getAmountProduziert()==produkt.getAmountVerkauft()){
            produkt.setAmountProduziert((float) (0.1*produkt.getAmountVerkauft()+produkt.getAmountProduziert()));
        }
        else{
            produkt.setAmountProduziert((float)(produkt.getAmountProduziert()-0.1*produkt.getAmountVerkauft()));
        }
    }

    public void print(){
        System.out.println("Die steigenden Nachfrage:");
        for(int i=0; i<steigendenNachfrage.size(); i++){
            System.out.println(steigendenNachfrage.get(i).getName()+" "+steigendenNachfrage.get(i).getAmountProduziert()+" "+steigendenNachfrage.get(i).getAmountVerkauft());
        }
        System.out.println("Die stagnierenden Nachfrage:");
        for(int i=0; i<stagnierendenNachfrage.size(); i++){
            System.out.println(stagnierendenNachfrage.get(i).getName()+" "+stagnierendenNachfrage.get(i).getAmountProduziert()+" "+stagnierendenNachfrage.get(i).getAmountVerkauft());
        }
        System.out.println("Die fallenden Nachfrage:");
        for(int i=0; i<fallendenNachfrage.size(); i++){
            System.out.println(fallendenNachfrage.get(i).getName()+" "+fallendenNachfrage.get(i).getAmountProduziert()+" "+fallendenNachfrage.get(i).getAmountVerkauft());
        }
    }

}
