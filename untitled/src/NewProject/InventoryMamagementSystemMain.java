package NewProject;

import NewProject.Common.CommomVariables;
import NewProject.Service.MemberService;
import NewProject.Service.StoreService;

import java.util.Scanner;

public class InventoryMamagementSystemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommomVariables commomVariables = new CommomVariables();
        MemberService memberService = new MemberService();
        StoreService storeService = new StoreService();
        int seletNo = 0;
        boolean run = true;
        while (run){
            System.out.println("로그인 단계");
            System.out.println("1.로그인 | 2.사원 등록 | 3.사원 정보 수정 | 4.입출고 관리 | 5.로그아웃");
            System.out.print("선택> ");
            seletNo = scanner.nextInt();
            if (seletNo == 1){
                memberService.memberLogin();
            } else if (seletNo == 2) {
                memberService.memberSave();
            } else if (seletNo == 3) {
                memberService.memberUpdate();
            } else if (seletNo == 4) {
                if (commomVariables.LoginName != null){
                    while (run){

                        System.out.println("입출고 관리");
                        System.out.println("1.입고 관리| 2.출고 관리 | 3.자재 정보");
                        scanner.nextInt();
                        if (seletNo == 1){

                        }
                    }
                }
            } else if (seletNo == 5) {
                memberService.logOut();
            }
        }

    }
}
