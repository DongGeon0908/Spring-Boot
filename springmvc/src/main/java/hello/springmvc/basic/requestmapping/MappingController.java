package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// JSON으로 보내줌
@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = {"/hello-basic", "/hb"}, method = RequestMethod.GET)
    public String helloBasic() {
        log.info("helloBasic");
        return "OK";
    }

    @GetMapping("/hello-basic2")
    public String helloBasic2() {
        log.info("helloBasic2");
        return "OK";
    }

    // URL 경로에 데이터를 심을 수 있다.
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        log.info("mappingPath userId = {}", data);
        return "OK";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        log.info("mappingPath userId= {}, orderId= {}", userId, orderId);
        return "OK";
    }

    @GetMapping(value = "/mapping-param", params = "mode=debug")
    public String mappingParam() {
        log.info("mappingParam");
        return "OK";
    }

    @GetMapping(value = "/mapping-header", headers = "mode-debug")
    public String mappingHeader() {
        log.info("mappingHeader");
        return "OK";
    }

    @PostMapping(value = "/mappping-consume", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String mappingConsumes() {
        log.info("mappingConsumes");
        return "OK";
    }

    @PostMapping(value = "/mapping-produce", produces = MediaType.TEXT_HTML_VALUE)
    public String mappingProduces() {
        log.info("mappingProduces");
        return "OK";
    }
}
