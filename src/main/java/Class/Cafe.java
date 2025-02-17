package Class;

import Dto.CafeDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Cafe {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long cafeNum;

    @Column(nullable = false)
    private String cafeName;

    @Column(nullable = false)
    private String cafeAddress;

    @Column(nullable = true)
    private Integer openTime;

    @Column(nullable = true)
    private Integer closeTime;

    @Column(nullable = true)  //이미지
    private byte[] cafeImage;

    @Column(nullable = true) //리뷰 외래키
    private Long reviewNum;

    @Column(nullable = true) //키워드 외래키
    private Long keyword1;

    @Column(nullable = true) //키워드 외래키
    private Long keyword2;

    @Column(nullable = true) //키워드 외래키
    private Long keyword3;

    @Column(nullable = true) //키워드 외래키
    private Long keyword4;

    @Column(nullable = true) //키워드 외래키
    private Long keyword5;

    @Column(nullable = true) //키워드 외래키
    private Long keyword6;

    @Column(nullable = true) //키워드 외래키
    private Long keyword7;

    @Column(nullable = true) //키워드 외래키
    private Long keyword8;

    @Column(nullable = true) //키워드 외래키
    private Long keyword9;

    @Column(nullable = true) //키워드 외래키
    private Long keyword10;

    @Column(nullable = true) //키워드 외래키
    private Long keyword11;

    @Column(nullable = true) //키워드 외래키
    private Long keyword12;

    @Column(nullable = true) //키워드 외래키
    private Long keyword13;

    @Column(nullable = true) //키워드 외래키
    private Long keyword14;

    @Column(nullable = true) //키워드 외래키
    private Long keyword15;

    @Column(nullable = true) //키워드 외래키
    private Long keyword16;

    @Column(nullable = true) //키워드 외래키
    private Long keyword17;

    @Column(nullable = true) //키워드 외래키
    private Long keyword18;

    @Column(nullable = true) //키워드 외래키
    private Long keyword19;

    @Column(nullable = true) //키워드 외래키
    private Long keyword20;

    @Column(nullable = true) //키워드 외래키
    private Long keyword21;

    @Column(nullable = true) //키워드 외래키
    private Long keyword22;

    @Column(nullable = true) //키워드 외래키
    private Long keyword23;

    @Column(nullable = true) //키워드 외래키
    private Long keyword24;

    @Column(nullable = true) //키워드 외래키
    private Long keyword25;

    @Column(nullable = true) //키워드 외래키
    private Long keyword26;

    @Column(nullable = true) //키워드 외래키
    private Long keyword27;

    @Column(nullable = true) //키워드 외래키
    private Long keyword28;

    @Column(nullable = true) //키워드 외래키
    private Long keyword29;

    @Column(nullable = true) //키워드 외래키
    private Long keyword30;

    @Column(nullable = true) //키워드 외래키
    private Long keyword31;

    @Column(nullable = true) //키워드 외래키
    private Long keyword32;

    @Column(nullable = true) //키워드 외래키
    private Long keyword33;

    @Column(nullable = true) //키워드 외래키
    private Long keyword34;

    @Column(nullable = true) //키워드 외래키
    private Long keyword35;

    @Column(nullable = true) //키워드 외래키
    private Long keyword36;

    @Column(nullable = true) // 북마크 외래키
   private Long bookmarkNum;

    @Column(nullable = true) // 스코어 외래키
    private Long scoreNum;


    public Cafe(CafeDto cafeDto) {
        this.cafeName = cafeDto.getCafeName();
        this.cafeAddress = cafeDto.getCafeAddress();
        this.openTime = cafeDto.getOpenTime();
        this.closeTime = cafeDto.getCloseTime();
        this.cafeImage = cafeDto.getCafeImage();
        this.reviewNum = cafeDto.getReviewNum();
        this.keyword1 = cafeDto.getKeyword1();
        this.keyword2 = cafeDto.getKeyword2();
        this.keyword3 = cafeDto.getKeyword3();
        this.keyword4 = cafeDto.getKeyword4();
        this.keyword5 = cafeDto.getKeyword5();
        this.keyword6 = cafeDto.getKeyword6();
        this.keyword7 = cafeDto.getKeyword7();
        this.keyword8 = cafeDto.getKeyword8();
        this.keyword9 = cafeDto.getKeyword9();
        this.keyword10 = cafeDto.getKeyword10();
        this.keyword11 = cafeDto.getKeyword11();
        this.keyword12 = cafeDto.getKeyword12();
        this.keyword13 = cafeDto.getKeyword13();
        this.keyword14 = cafeDto.getKeyword14();
        this.keyword15 = cafeDto.getKeyword15();
        this.keyword16 = cafeDto.getKeyword16();
        this.keyword17 = cafeDto.getKeyword17();
        this.keyword18 = cafeDto.getKeyword18();
        this.keyword19 = cafeDto.getKeyword19();
        this.keyword20 = cafeDto.getKeyword20();
        this.keyword21 = cafeDto.getKeyword21();
        this.keyword22 = cafeDto.getKeyword22();
        this.keyword23 = cafeDto.getKeyword23();
        this.keyword24 = cafeDto.getKeyword24();
        this.keyword25 = cafeDto.getKeyword25();
        this.keyword26 = cafeDto.getKeyword26();
        this.keyword27 = cafeDto.getKeyword27();
        this.keyword28 = cafeDto.getKeyword28();
        this.keyword29 = cafeDto.getKeyword29();
        this.keyword30 = cafeDto.getKeyword30();
        this.keyword31 = cafeDto.getKeyword31();
        this.keyword32 = cafeDto.getKeyword32();
        this.keyword33 = cafeDto.getKeyword33();
        this.keyword34 = cafeDto.getKeyword34();
        this.keyword35 = cafeDto.getKeyword35();
        this.keyword36 = cafeDto.getKeyword36();
        this.bookmarkNum = cafeDto.getBookmarkNum();
        this.scoreNum = cafeDto.getScoreNum();
    }

    public void update(CafeDto cafeDto) {
        this.cafeName = cafeDto.getCafeName();
        this.cafeAddress = cafeDto.getCafeAddress();
        this.openTime = cafeDto.getOpenTime();
        this.closeTime = cafeDto.getCloseTime();
        this.cafeImage = cafeDto.getCafeImage();
        this.reviewNum = cafeDto.getReviewNum();
        this.keyword1 = cafeDto.getKeyword1();
        this.keyword2 = cafeDto.getKeyword2();
        this.keyword3 = cafeDto.getKeyword3();
        this.keyword4 = cafeDto.getKeyword4();
        this.keyword5 = cafeDto.getKeyword5();
        this.keyword6 = cafeDto.getKeyword6();
        this.keyword7 = cafeDto.getKeyword7();
        this.keyword8 = cafeDto.getKeyword8();
        this.keyword9 = cafeDto.getKeyword9();
        this.keyword10 = cafeDto.getKeyword10();
        this.keyword11 = cafeDto.getKeyword11();
        this.keyword12 = cafeDto.getKeyword12();
        this.keyword13 = cafeDto.getKeyword13();
        this.keyword14 = cafeDto.getKeyword14();
        this.keyword15 = cafeDto.getKeyword15();
        this.keyword16 = cafeDto.getKeyword16();
        this.keyword17 = cafeDto.getKeyword17();
        this.keyword18 = cafeDto.getKeyword18();
        this.keyword19 = cafeDto.getKeyword19();
        this.keyword20 = cafeDto.getKeyword20();
        this.keyword21 = cafeDto.getKeyword21();
        this.keyword22 = cafeDto.getKeyword22();
        this.keyword23 = cafeDto.getKeyword23();
        this.keyword24 = cafeDto.getKeyword24();
        this.keyword25 = cafeDto.getKeyword25();
        this.keyword26 = cafeDto.getKeyword26();
        this.keyword27 = cafeDto.getKeyword27();
        this.keyword28 = cafeDto.getKeyword28();
        this.keyword29 = cafeDto.getKeyword29();
        this.keyword30 = cafeDto.getKeyword30();
        this.keyword31 = cafeDto.getKeyword31();
        this.keyword32 = cafeDto.getKeyword32();
        this.keyword33 = cafeDto.getKeyword33();
        this.keyword34 = cafeDto.getKeyword34();
        this.keyword35 = cafeDto.getKeyword35();
        this.keyword36 = cafeDto.getKeyword36();
        this.bookmarkNum = cafeDto.getBookmarkNum();
        this.scoreNum = cafeDto.getScoreNum();
    }
}