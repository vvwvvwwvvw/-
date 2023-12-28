package NewProject.Service;

import NewProject.DTO.ReleaseDTO;
import NewProject.Repository.ReleaseRepository;

import java.util.Scanner;

public class ReleaseService {
    ReleaseRepository releaseRepository = new ReleaseRepository();
    Scanner scanner = new Scanner(System.in);
    public void ProductSell() {
        System.out.print("제품명: ");
        String productName = scanner.next();
        System.out.print("판매 수량: ");
        int SalesQuantity = scanner.nextInt();
        System.out.print("판매처: ");
        String SellTo = scanner.next();
        System.out.println("판매 가격: ");
        int SellPrice = scanner.nextInt();
        ReleaseDTO releaseDTO = new ReleaseDTO(productName,SalesQuantity,SellTo,SellPrice);
        boolean result = releaseRepository.ProductSell(releaseDTO);
        if (result){
            System.out.println("출고 등록 되었습니다");
        }else {
            System.out.println("등록에 실패하였습니다 다시 확인해 주세요");
        }
    }
}
