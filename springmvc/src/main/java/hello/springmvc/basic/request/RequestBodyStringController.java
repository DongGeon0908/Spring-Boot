package hello.springmvc.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

@Slf4j
@Controller
public class RequestBodyStringController {

    @PostMapping("/request-body-String-v1")
    public void requestBodyString(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        log.info("messageBody={}", messageBody);

        response.getWriter().write("OK");
    }

    @PostMapping("/request-body-String-v2")
    public void requestBodyString2(InputStream inputStream, Writer responseWriter) throws IOException {

        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        log.info("messageBody={}", messageBody);

        responseWriter.write("OK");
    }


    @PostMapping("/request-body-String-v3")
    public HttpEntity<String> requestBodyString3(HttpEntity<String> httpEntity) throws IOException {

        String body = httpEntity.getBody();

        log.info("messageBody={}", body);

        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @ResponseBody
    @PostMapping("/request-body-String-v4")
    public String requestBodyString5(@RequestBody String messageBody) throws IOException {

        log.info("messageBody={}", messageBody);

        return "OK";
    }
}
