package NewProject.DTO;

public class MemberDTO {
    private Long id;
    private int MemberId;
    private String MemberName;

    public void setId(Long id) {
        this.id = id;
    }

    public void setMemberId(int memberId) {
        MemberId = memberId;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public Long getId() {
        return id;
    }

    public int getMemberId() {
        return MemberId;
    }

    public String getMemberName() {
        return MemberName;
    }
    public MemberDTO(){

    }
    Long idValeu = 1L;
    public MemberDTO(String MemberName , int MemberId){
        this.id = idValeu++;
        this.MemberName = MemberName;
        this.MemberId = MemberId;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", MemberId=" + MemberId +
                ", MemberName='" + MemberName + '\'' +
                '}';
    }
}
