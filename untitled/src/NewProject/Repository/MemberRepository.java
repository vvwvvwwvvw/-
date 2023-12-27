package NewProject.Repository;

import NewProject.DTO.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();
    public MemberDTO memberLogin(String memberName, int memberId) {
        MemberDTO result = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberName.equals(memberDTOList.get(i).getMemberName()) && memberId == memberDTOList.get(i).getMemberId()){
                result = memberDTOList.get(i);
            }
        }
        return result;
    }

    public boolean memberSave(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }
}
