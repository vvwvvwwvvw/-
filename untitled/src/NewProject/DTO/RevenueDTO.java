package NewProject.DTO;

public class RevenueDTO {
    private String ProductName;
    private  int purchasePrice;
    private int SellPrice;
    private int Revenue;
    private int ProductQuantity; // 구매 수량
    private int SalesQuantity; // 판매 수량


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

    public int getRevenue() {
        return Revenue;
    }

    public void setRevenue(int revenue) {
        Revenue = revenue;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public int getSalesQuantity() {
        return SalesQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        ProductQuantity = productQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        SalesQuantity = salesQuantity;
    }

    public RevenueDTO(){

    }
    public RevenueDTO(String ProductName , int purchasePrice , int SellPrice , int ProductQuantity , int SalesQuantity){
        this.ProductName = ProductName;
        this.purchasePrice= purchasePrice * ProductQuantity;
        this.SellPrice = SellPrice * SalesQuantity;
        this.Revenue += SellPrice - purchasePrice;
    }

    @Override
    public String toString() {
        return "RevenueDTO{" +
                "ProductName='" + ProductName + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", ProductQuantity=" + ProductQuantity +
                ", SalesQuantity=" + SalesQuantity +
                ", SellPrice=" + SellPrice +
                ", Revenue=" + Revenue +
                '}';
    }
}