package com.ice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IceController {

    @GetMapping("/ice")
    public String ice() {
        return "hello";
    }
}
