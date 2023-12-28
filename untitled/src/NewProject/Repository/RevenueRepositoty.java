package NewProject.Repository;


import NewProject.DTO.RevenueDTO;

import java.util.ArrayList;
import java.util.List;


public class RevenueRepositoty {
    static List<RevenueDTO> revenueDTOList = new ArrayList<>();

    public static boolean PurchasePriceSave(RevenueDTO revenueDTO) {
        return revenueDTOList.add(revenueDTO);
    }

    public static boolean SellSave(RevenueDTO revenueDTO) {
        return revenueDTOList.add(revenueDTO);
    }

    public int SellRevenue(String productName) {
        int a = 0;
        for (int i = 0; i < revenueDTOList.size(); i++) {
            if (revenueDTOList.get(i).getProductName().contains(productName)) {
                if (revenueDTOList.get(i).getSellPrice() - revenueDTOList.get(i).getPurchasePrice() <= 0) {
                    System.out.println("에러");
                } else if (revenueDTOList.get(i).getSellPrice() - revenueDTOList.get(i).getPurchasePrice() >= 0) {
                    a = revenueDTOList.get(i).getSellPrice() - revenueDTOList.get(i).getPurchasePrice();
                }
            }
        }
        return a;
    }
}