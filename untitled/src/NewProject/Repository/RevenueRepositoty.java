package NewProject.Repository;

import NewProject.DTO.ProductDTO;
import NewProject.DTO.ReleaseDTO;
import NewProject.DTO.RevenueDTO;

import java.util.ArrayList;
import java.util.List;


public class RevenueRepositoty {
    List<RevenueDTO> revenueDTOList = new ArrayList<>();


    public boolean PurchasePriceSave(RevenueDTO revenueDTO) {
        System.out.println(revenueDTO);
        return revenueDTOList.add(revenueDTO);
    }

    public boolean SellSave(RevenueDTO revenueDTO) {
        System.out.println(revenueDTO);
        return revenueDTOList.add(revenueDTO);
    }

    public int SellRevenue(String productName) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        List<ReleaseDTO> releaseDTOList = new ArrayList<>();
        int i;
        for (i = 0; i < productDTOList.size(); i++) {
            if (productName.equals(productDTOList.get(i).getProductName())) {


            }
            for (int j = 0; j < releaseDTOList.size(); j++) {
                if (productName.equals(releaseDTOList.get(i).getProductName())) {


                }
            }

        }

        return revenueDTOList.get(i).getSellPrice();
    }
}