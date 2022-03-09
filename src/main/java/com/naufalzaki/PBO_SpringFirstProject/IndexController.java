package com.naufalzaki.PBO_SpringFirstProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/Hello")
    public String index(@RequestParam String nama){
        return "Selamat belajar Spring Boot! " + nama;
    }
}
