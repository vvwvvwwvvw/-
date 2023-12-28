package NewProject.DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReleaseDTO {
    private Long id;
    private String productName; // 상품 이름
    private int SalesQuantity; // 판매 수량
    private String SellTo; // 판매처
    private String createAt; // 판매 시간
    private int SellPrice; // 판매 가격
    private int SellRevenue; // 수익

    public void setSellRevenue(int sellRevenue) {
        SellRevenue = sellRevenue;
    }

    public int getSellRevenue() {
        return SellRevenue;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSalesQuantity(int salesQuantity) {
        SalesQuantity = salesQuantity;
    }

    public void setSellTo(String sellTo) {
        SellTo = sellTo;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public void setSellPrice(int sellPrice) {
        SellPrice = sellPrice;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getSalesQuantity() {
        return SalesQuantity;
    }

    public String getSellTo() {
        return SellTo;
    }

    public String getCreateAt() {
        return createAt;
    }

    public int getSellPrice() {
        return SellPrice;
    }
    ReleaseDTO(){

    }
    Long idValue = 1L;
    public ReleaseDTO(String productName, int salesQuantity, String sellTo, int sellPrice){
        this.id = idValue++;
        this.productName = productName;
        this.SalesQuantity = salesQuantity;
        this.SellTo = sellTo;
        this.SellPrice = sellPrice;
        this.createAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
    }

    @Override
    public String toString() {
        return "ReleaseDTO{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", SalesQuantity=" + SalesQuantity +
                ", SellTo='" + SellTo + '\'' +
                ", createAt='" + createAt + '\'' +
                ", SellPrice=" + SellPrice +
                ", SellRevenue=" + SellRevenue +
                '}';
    }
}
