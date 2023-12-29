package NewProject.Service;

;
import NewProject.DTO.ReleaseDTO;
import NewProject.DTO.RevenueDTO;
import NewProject.Repository.ProductRepository;
import NewProject.Repository.ReleaseRepository;
import NewProject.Repository.RevenueRepositoty;

import java.util.List;
import java.util.Scanner;

public class ReleaseService {
    ProductRepository productRepository = new ProductRepository();
    ReleaseRepository releaseRepository = new ReleaseRepository();
    RevenueRepositoty revenueRepositoty = new RevenueRepositoty();
    Scanner scanner = new Scanner(System.in);
    public void ProductSell() {
        System.out.print("제품명: ");
        String productName = scanner.next();
        System.out.print("판매 수량: ");
        int SalesQuantity = scanner.nextInt();
        System.out.print("판매처: ");
        String SellTo = scanner.next();
        System.out.print("판매 가격: ");
        int SellPrice = scanner.nextInt();
        ReleaseDTO releaseDTO = new ReleaseDTO(productName,SalesQuantity,SellTo,SellPrice);
        RevenueDTO revenueDTO = new RevenueDTO(productName, 0 ,SellPrice , 0 ,SalesQuantity);
        System.out.println(productRepository.productBuy(productName));
        boolean result = releaseRepository.ProductSell(releaseDTO);
        boolean RevenueResult = revenueRepositoty.SellSave(revenueDTO);
        if (result && RevenueResult){
            System.out.println("출고 등록 되었습니다");
        }else {
            System.out.println("등록에 실패하였습니다 다시 확인해 주세요");
        }
    }

    public void SellList() {
        List<ReleaseDTO> releaseDTOList = releaseRepository.SellList();
        for (ReleaseDTO releaseDTO:releaseDTOList){
            System.out.println("releaseDTO = " + releaseDTO);
        }
    }

    public void SellSearch() {
        System.out.println("search: ");
        String ProductName = scanner.next();
        List<ReleaseDTO>releaseDTOList = releaseRepository.SellSearch(ProductName);
        if (releaseDTOList.size()>0){
            for (ReleaseDTO releaseDTO: releaseDTOList){
                System.out.println("releaseDTO = " + releaseDTO);
            }
        }else {
            System.out.println("검색 결과가 없습니다");
        }
    }

    public void SellRevenue() {
        System.out.println("조회할 제품명: ");
        String productName = scanner.next();
        System.out.println(revenueRepositoty.SellRevenue(productName));
    }
}


