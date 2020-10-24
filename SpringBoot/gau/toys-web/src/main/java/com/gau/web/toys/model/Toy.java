package com.gau.web.toys.model;

public class Toy {

    private String name;
    private Provider provider;
    
    public Toy(String name, Provider provider) {
        this.name = name;
        this.provider = provider;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Provider getProvider() {
        return provider;
    }
    
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
    
}
