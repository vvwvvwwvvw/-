package NewProject.DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductDTO {
    private Long id;
    private String productName; // 상품 이름
    private int ProductQuantity; // 상품 수량
    private String ProductFrom; // 구매처
    private String createdAt; // 입고 시간
    private int purchasePrice; // 구매 단가

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(int productQuantity) {
        ProductQuantity = productQuantity;
    }

    public void setProductFrom(String productFrom) {
        ProductFrom = productFrom;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public String getProductFrom() {
        return ProductFrom;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }
    ProductDTO(){

    }
    Long idValue = 1L;
    ProductDTO(String productName , int productQuantity , String productFrom , int purchasePrice){
        this.id = idValue++;
        this.productName=productName;
        this.ProductQuantity = productQuantity;
        this.ProductFrom = productFrom;
        this.purchasePrice = purchasePrice;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
    }

    @Override
    public String toString() {
        return "productDTO{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", ProductQuantity=" + ProductQuantity +
                ", ProductFrom='" + ProductFrom + '\'' +
                ", purchasePrice=" + purchasePrice + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}