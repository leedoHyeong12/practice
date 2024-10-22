package com.kr.itda.itda.project_api.admin.controller;

import com.kr.itda.itda.project_api.admin.service.AcademyProcessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminAcademyProcessController")
@RequestMapping("admin/academy")
public class AcademyProcessController {
        private AcademyProcessService service;
        public AcademyProcessController(AcademyProcessService service) {
            this.service = service;
        }
}
