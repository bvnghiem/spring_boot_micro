package com.gau.web.toys.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gau.web.toys.model.Provider;
import com.gau.web.toys.model.Toy;

@Repository
public class ToyMangementService {

    public ToyMangementService() {
    }
    
    public List<Toy> getAll() {
        return Collections.singletonList(new Toy("School bus", new Provider(1, "Lotte Mart", "Thai Lan")));
    }
}
