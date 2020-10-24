package com.gau.web.toys.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gau.web.toys.model.Provider;

@Repository
public class ProviderMangementService {

    public List<Provider> getAll() {
        
        return Collections.singletonList(new Provider(1, "Lotte Mart", "Thai Lan"));
    }
}
