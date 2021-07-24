package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
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

    // 연관관계의 거울
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
