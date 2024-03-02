package com.ApiRestMavenMongo.Login.ApiRest;

import com.ApiRestMavenMongo.Login.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class ProductServiceIMPL {
    @Autowired
    private ProductsRepo repo;

    public Flux<Products> allProducts(){
    return this.repo.findAll();
    }
    public Mono<Products> addProducts(Products products){
        return this.repo.save(products);
    }
    public Mono<Products> updateProducts(Products products){
        return this.repo.save(products);
    }
    public Mono<Products> findProducts(String id){
        return this.repo.findById(id);
    }
    public Mono<Void> deleteProducts(String id){
        return this.repo.deleteById(id);
    }
    public Mono<Void> deleteAllProducts(){
        return this.repo.deleteAll();
    }
}
