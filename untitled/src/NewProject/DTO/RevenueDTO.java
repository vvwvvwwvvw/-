package NewProject.DTO;

public class RevenueDTO {
    private String ProductName;
    private int purchasePrice;
    private int SellPrice;


    public void setProductName(String productName) {
        ProductName = productName;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSellPrice(int sellPrice) {
        SellPrice = sellPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellPrice() {
        return SellPrice;
    }
    public RevenueDTO(){

    }
    public RevenueDTO(String ProductName , int purchasePrice , int SellPrice){
        this.ProductName = ProductName;
        this.purchasePrice=purchasePrice;
        this.SellPrice = SellPrice;
    }

    @Override
    public String toString() {
        return "RevenueDTO{" +
                "ProductName='" + ProductName + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", SellPrice=" + SellPrice +
                '}';
    }
}