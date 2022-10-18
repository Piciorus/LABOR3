public class Produkt {
    private String name;
    private float amountProduziert;
    private float amountVerkauft;

    public Produkt(String name, float amountProduziert, float amountVerkauft) {
        this.name = name;
        this.amountProduziert = amountProduziert;
        this.amountVerkauft = amountVerkauft;
    }

    public float getAmountProduziert() {
        return amountProduziert;
    }
    public float getAmountVerkauft() {
        return amountVerkauft;
    }

    public void setAmountProduziert(float amountProduziert) {
        this.amountProduziert = amountProduziert;
    }

    public void setAmountVerkauft(float amountVerkauft) {
        this.amountVerkauft = amountVerkauft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
