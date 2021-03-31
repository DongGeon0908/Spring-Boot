package org.zerock.bimovie.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "movie")
@Table(name = "tb1_poster")
public class Poster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ino;

    private String fname;

    // 포스터 순번
    private int idx;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    public void setIdx(int idx){
        this.idx = idx;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }
}
