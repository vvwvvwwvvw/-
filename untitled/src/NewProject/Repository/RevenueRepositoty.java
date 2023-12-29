package NewProject.Repository;

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
        int a = 0;
        for (int i = 0; i < revenueDTOList.size(); i++) {
            if (productName.equals(revenueDTOList.get(i).getProductName())){
               a = revenueDTOList.get(i).getRevenue();
            }
        }
        return a;
    }
}