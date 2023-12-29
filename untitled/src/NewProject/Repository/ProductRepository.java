package NewProject.Repository;

import NewProject.DTO.ProductDTO;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<ProductDTO> productDTOList = new ArrayList<>();
    public boolean ProductSave(ProductDTO productDTO) {
        return productDTOList.add(productDTO);
    }

    public List<ProductDTO> ProductList() {
        return productDTOList;
    }

    public List<ProductDTO> ProductSearch(String productName) {
        List<ProductDTO>productDTOS = new ArrayList<>();
        for (int i = 0; i < productDTOList.size(); i++) {
            if (productDTOList.get(i).getProductName().contains(productName)){
                productDTOS.add(productDTOList.get(i));
            }
        }
        return productDTOS;
    }
    public int productBuy(String productName){
        int a = 0;
        for (int i = 0; i < productDTOList.size(); i++) {
            if (productName.equals(productDTOList.get(i).getProductName())){
               a = productDTOList.get(i).getPurchasePrice();
            }

        }
        return a;
    }
}
