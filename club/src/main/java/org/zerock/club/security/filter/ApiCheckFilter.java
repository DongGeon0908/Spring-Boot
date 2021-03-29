package org.zerock.club.security.filter;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
public class ApiCheckFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        log.info("ApiCheckFilter..................................................");
        log.info("ApiCheckFilter..................................................");
        log.info("ApiCheckFilter..................................................");

        // 다음 필터의 단계로 넘어가는 역할
        filterChain.doFilter(request, response);
    }
}
