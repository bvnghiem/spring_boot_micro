package com.gau.web.toys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gau.web.toys.model.Provider;
import com.gau.web.toys.model.Toy;
import com.gau.web.toys.service.ProviderMangementService;
import com.gau.web.toys.service.ToyMangementService;

@RestController
@RequestMapping("/api/")
public class DefaultController {

    @Value("${spring.application.name:Gau's Toy}")
    private String APP_NAME;

    @Autowired
    private ProviderMangementService m_providerMgmtService;
    
    @Autowired
    private ToyMangementService m_toyMgmtService;

    @GetMapping("/")
    public String hello() {
        return APP_NAME;
    }

    @GetMapping("/toys")
    public List<Toy> getAllToys() {
        List<Toy> providers = m_toyMgmtService.getAll();
        return providers;
    }
    
    @GetMapping("/providers")
    public List<Provider> getAllProviders() {
        List<Provider> providers = m_providerMgmtService.getAll();
        return providers;
    }
}
