package NewProject.DTO;

public class MemberDTO {
    private Long id;
    private String MemberId;
    private String MemberName;

    public void setId(Long id) {
        this.id = id;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public Long getId() {
        return id;
    }

    public String getMemberId() {
        return MemberId;
    }

    public String getMemberName() {
        return MemberName;
    }
}
