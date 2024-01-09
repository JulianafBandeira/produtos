package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customsFee = customFee;
    }
    @Override
    public String priceTag(){
        return  getName() + " $" +
                String.format(" %.2f", totalPrice()) +
                " (Customs fee: " + String.format("%.2f",customsFee)+")";
    }
    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
}
