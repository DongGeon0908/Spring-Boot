package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    // 내장 타입을 의미
    @Embedded
    private Address address;

    // 컬렉션은 필드에서 바로 초기화하는게 좋음!!
    // 연관관계의 거울
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
