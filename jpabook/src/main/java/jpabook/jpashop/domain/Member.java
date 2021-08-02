package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * API를 만들때는 꼭! 엔티티를 반환하지 말자!!
 * 외부에는 엔티티를 보내지 말기! 그리고 받지도 말자!!
 * 화면에 맞는 DTO로 반환하고 요청받기
 */

@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    // 검증 로직이 엔티티에 있다???

    private String name;

    // 내장 타입을 의미
    @Embedded
    private Address address;

    // 컬렉션은 필드에서 바로 초기화하는게 좋음!!
    // 연관관계의 거울
    // @JsonIgnore <-- 제외시키기
    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
