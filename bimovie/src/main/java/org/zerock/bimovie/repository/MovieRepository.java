package org.zerock.bimovie.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.bimovie.entity.Movie;



public interface MovieRepository extends JpaRepository<Movie, Long> {


    @EntityGraph(attributePaths = "posterList", type = EntityGraph.EntityGraphType.LOAD)
    @Query("select m from Movie m")
    Page<Movie> findAll2(Pageable pageable);

    @Query("select m, p, count(p) from Movie m left join Poster p on p.movie = m where p.idx = 1 group by p.movie")
    Page<Object[]> findAll3(Pageable pageable);
}
