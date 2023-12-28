package NewProject.Repository;

import NewProject.DTO.ProductDTO;
import NewProject.DTO.ReleaseDTO;

import java.util.ArrayList;
import java.util.List;

public class RevenueRepositoty {
    List<ProductDTO> productDTOList = new ArrayList<>();
    List<ReleaseDTO> releaseDTOList = new ArrayList<>();

    public int SellRevenue(String ProductName) {
            int purchasePrice = 0;
            int sellPrice = 0;

            // productDTOList에서 구매 가격 찾기
            for (ProductDTO productDTO : productDTOList) {
                if (ProductName.equals(productDTO.getProductName())) {
                    purchasePrice = productDTO.getPurchasePrice();
                    break;  // 일치하는 제품을 찾으면 루프 종료
                }
            }

            // releaseDTOList에서 판매 가격 찾기
            for (ReleaseDTO releaseDTO : releaseDTOList) {
                if (ProductName.equals(releaseDTO.getProductName())) {
                    sellPrice = releaseDTO.getSellPrice();
                    break;  // 일치하는 제품을 찾으면 루프 종료
                }
            }

            // 판매 수익 계산
            if (purchasePrice == 0 || sellPrice == 0) {
                // 판매 가격이나 구매 가격이 없으면 오류 처리
                // 예시: throw new IllegalStateException("Product data incomplete");
            }

            return sellPrice - purchasePrice;
        }
    }

