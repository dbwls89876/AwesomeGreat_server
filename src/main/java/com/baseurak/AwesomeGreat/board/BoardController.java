package com.baseurak.AwesomeGreat.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class BoardController {
    @PostMapping
    public List aa(){
        List<String> list = new ArrayList<>();
        list.add("착한 학생");
        list.add("맛있는 아이스크림");
        list.add("사랑스러운 양파");
        return list;
    }
}
