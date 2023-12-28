package NewProject.Service;

import NewProject.DTO.ProductDTO;
import NewProject.DTO.RevenueDTO;
import NewProject.Repository.ProductRepository;
import NewProject.Repository.RevenueRepositoty;

import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();

    public void ProductSave() {
        System.out.print("제품명: ");
        String ProductName = scanner.next();
        System.out.print("상품 수량: ");
        int ProductQuantity = scanner.nextInt();
        System.out.print("구매처: ");
        String ProductFrom = scanner.next();
        System.out.print("구매 단가: ");
        int PurchasePrice = scanner.nextInt();
        ProductDTO productDTO = new ProductDTO(ProductName , ProductQuantity , ProductFrom , PurchasePrice );
        RevenueDTO revenueDTO = new RevenueDTO(ProductName, PurchasePrice ,0);
        boolean RevenueResult = RevenueRepositoty.PurchasePriceSave(revenueDTO);
        boolean result = productRepository.ProductSave(productDTO);
        if (result && RevenueResult){
            System.out.println("등록 되었습니다");
        }else {
            System.out.println("등록에 실패 하였습니다 다시 시도해주세요");
        }

    }

    public void ProductList() {
        List<ProductDTO> productDTOList = productRepository.ProductList();
        for (ProductDTO productDTO: productDTOList){
            System.out.println("productDTO = " + productDTO);
        }
    }

    public void ProductSearch() {
        System.out.println("search: ");
        String ProductName = scanner.next();
        List<ProductDTO> productDTOList = productRepository.ProductSearch(ProductName);
        if (productDTOList.size()>0){
            for (ProductDTO productDTO: productDTOList){
                System.out.println("productDTO = " + productDTO);
            }
        }else {
            System.out.println("검색 결과가 없습니다");
        }
    }
}
