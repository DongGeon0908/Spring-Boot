package com.zerock.mreview.repository;

import com.zerock.mreview.entity.Member;
import com.zerock.mreview.entity.Movie;
import com.zerock.mreview.entity.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTests {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews(){

        // 200개의 리뷰를 등록
        IntStream.rangeClosed(1,200).forEach(i -> {

            // 영화번호
            Long mno = (long)(Math.random()*100) + 1;

            // 리뷰어 번호
            Long mid = ((long)(Math.random()*100) + 1);
            Member member = Member.builder().mid(mid).build();

            Review movieReview = Review.builder()
                    .member(member)
                    .movie(Movie.builder().mno(mno).build())
                    .grade((int)(Math.random()*5) + 1)
                    .text("이 영화에 대한 느낌...." + i)
                    .build();
            reviewRepository.save(movieReview);
        });
    }

    @Test
    public void testGetMovieReviews(){

        Movie movie = Movie.builder().mno(92L).build();

        List<Review> result = reviewRepository.findByMovie(movie);

        result.forEach(movieReview -> {
            System.out.print(movieReview.getReviewnum());
            System.out.print("\t" + movieReview.getGrade());
            System.out.print("\t" + movieReview.getText());
            System.out.print("\t" + movieReview.getMember().getEmail());
            System.out.println("--------------------------------------");
        });
    }
}
