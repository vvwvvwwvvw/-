package NewProject;

import NewProject.Common.CommomVariables;
import NewProject.Service.MemberService;
import NewProject.Service.ProductService;
import NewProject.Service.ReleaseService;

import java.util.Scanner;

public class InventoryMamagementSystemMain {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        CommomVariables commomVariables = new CommomVariables();
        MemberService memberService = new MemberService();
        ReleaseService releaseService = new ReleaseService();
        int seletNo = 0;
        boolean run = true;
        boolean run2= true;
        boolean run3 = true;
        boolean run4 = true;
        while (run) {
            System.out.println("로그인 단계");
            System.out.println("1.로그인 | 2.사원 등록 | 3.사원 정보 수정 | 4.입출고 관리 | 5.로그아웃");
            System.out.print("선택> ");
            seletNo = scanner.nextInt();
            if (seletNo == 1) {
                memberService.memberLogin();
            } else if (seletNo == 2) {
                memberService.memberSave();
            } else if (seletNo == 3) {
                memberService.memberUpdate();
            } else if (seletNo == 4) {
                if (commomVariables.LoginName == null)
                    System.out.println("로그인후 이용해주세요");
                if (commomVariables.LoginName != null) {
                    while (run2) {
                        System.out.println("입출고 관리");
                        System.out.println("1.입고 관리| 2.출고 관리 | 3.제품 관리 현황 | 0.뒤로 가기");
                        System.out.print("선택> ");
                        seletNo = scanner.nextInt();
                        if (seletNo == 1) {
                            while (run3) {
                                System.out.println("입고 관리");
                                System.out.println("1.제품 등록 | 2.제품 목록 | 3.제품 검색 | 0. 뒤로가기");
                                System.out.print("선택> ");
                                seletNo = scanner.nextInt();
                                if (seletNo == 1) {
                                    productService.ProductSave();
                                } else if (seletNo == 2) {
                                    productService.ProductList();
                                } else if (seletNo == 3) {
                                    productService.ProductSearch();
                                } else if (seletNo == 0) {
                                    run3 = false;
                                }

                            }
                        } else if (seletNo == 2) {
                            while (run4) {
                                System.out.println("출고 관리");
                                System.out.println("1.제품 출고 | 2.출고 리스트 | 3.상품 검색 | 4.수익률 | 0.돌아 가기");
                                System.out.print("선택> ");
                                seletNo = scanner.nextInt();
                                if (seletNo == 1){
                                    releaseService.ProductSell();
                                } else if (seletNo == 2) {
                                    releaseService.SellList();
                                } else if (seletNo == 3) {
                                    releaseService.SellSearch();
                                } else if (seletNo == 4) {
                                    releaseService.SellRevenue();
                                }
                            }
                        }
                    }

                } else if (seletNo == 5) {
                    memberService.logOut();
                }

            }

        }
    }
}

