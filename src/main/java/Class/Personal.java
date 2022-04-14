package Class;

import Dto.PersonalDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Personal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long memNum;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private Integer grade;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Integer phoneNum;

    @Column(nullable = false)
    private Byte[] profileImage;

    @Column(nullable = false)
    private String favorite1;

    @Column(nullable = false)
    private String favorite2;

    public Personal(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.nickName = personalDto.getNickName();
        this.grade = personalDto.getGrade();
        this.address = personalDto.getAddress();
        this.phoneNum = personalDto.getPhoneNum();
        this.profileImage = personalDto.getProfileImage();
        this.favorite1 = personalDto.getFavorite1();
        this.favorite2 = personalDto.getFavorite2();
    }

    public void update(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.nickName = personalDto.getNickName();
        this.grade = personalDto.getGrade();
        this.address = personalDto.getAddress();
        this.phoneNum = personalDto.getPhoneNum();
        this.profileImage = personalDto.getProfileImage();
        this.favorite1 = personalDto.getFavorite1();
        this.favorite2 = personalDto.getFavorite2();
    }
}
