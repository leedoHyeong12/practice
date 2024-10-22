package com.kr.itda.itda.project_api.service;

import com.kr.itda.itda.project_api.entity.AcademyProcess;
import com.kr.itda.itda.project_api.repository.AcademyProcessRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAcademyProcessService implements AcademyProcessService {

    private AcademyProcessRepository repository;

    public DefaultAcademyProcessService(AcademyProcessRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AcademyProcess> getList() {
        return repository.findAll();
    }
}
