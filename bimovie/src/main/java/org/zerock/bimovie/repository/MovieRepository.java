package org.zerock.bimovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.bimovie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
