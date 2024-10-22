package com.kr.itda.itda.project_api.controller;

import com.kr.itda.itda.project_api.entity.AcademyProcess;
import com.kr.itda.itda.project_api.service.AcademyProcessService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/academy")
@AllArgsConstructor
public class AcademyProcessController {

    private AcademyProcessService service;
    private ListCrudRepository<AcademyProcess, Long> repository;


    @GetMapping
    public List<AcademyProcess> getList(
            @RequestParam(name = "p",defaultValue = "1") int page,
            @RequestParam(name = "s",defaultValue = "1") int size
    ){


        return repository.findAll();
    }
//    @GetMapping("{id}")
//    public RequestEntity<AcademyProcess> get(
//            @PathVariable Long id
//    ) {
//        System.out.println(id);
//
//
//        return new ResponseEntity<>(AcademyProcess,HttpStatus.OK);
//    }
}
