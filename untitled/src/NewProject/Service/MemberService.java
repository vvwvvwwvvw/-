package NewProject.Service;

import NewProject.Common.CommomVariables;
import NewProject.DTO.MemberDTO;
import NewProject.Repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    CommomVariables commomVariables = new CommomVariables();
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);
    public void memberLogin() {
        System.out.print("이름");
        String MemberName = scanner.next();
        System.out.print("사번");
        int MemberId = scanner.nextInt();
        MemberDTO LoginResult = memberRepository.memberLogin(MemberName , MemberId);
        if (LoginResult !=null){
            System.out.println("환영합니다"+ MemberName + "님");
            commomVariables.LoginName = MemberName;
        }else {
            System.out.println("로그인에 실패하였습니다 다시 확인해 주십시오");
        }
    }

    public void memberSave() {
        System.out.print("이름: ");
        String MemberName = scanner.next();
        System.out.print("사번: ");
        int MemberId = scanner.nextInt();
        MemberDTO memberDTO = new MemberDTO(MemberName , MemberId);
        boolean result = memberRepository.memberSave(memberDTO);
        if (result){
            System.out.println("등록 성공");
        }else {
            System.out.println("등록 실패");
        }
    }
}
