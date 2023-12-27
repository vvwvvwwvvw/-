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
            System.out.println("1.로그인 | 2.사원 등록");
            seletNo = scanner.nextInt();
            if (seletNo == 1){
                memberService.memberLogin();
            } else if (seletNo == 2) {
                memberService.memberSave();
            }
        }

    }
}
