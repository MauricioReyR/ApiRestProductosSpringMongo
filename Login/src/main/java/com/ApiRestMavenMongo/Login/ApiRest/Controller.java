package com.ApiRestMavenMongo.Login.ApiRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ProductServiceIMPL psimplp;

    @GetMapping("/allProducts")
    public ResponseEntity<Flux<Products>> allProducts(){
        Flux<Products> flux=this.psimplp.allProducts();
        return new ResponseEntity<Flux<Products>>(flux, HttpStatus.OK);
    }
    //añadir Productos
    @PostMapping("/addProducts")
    public ResponseEntity<Mono<Products>> addProducts(@RequestBody Products products){
        Mono<Products> productosmono=this.psimplp.addProducts(products);
        return new ResponseEntity<Mono<Products>>(productosmono, HttpStatus.CREATED);
    }

    @PutMapping("/updateProducts")
    public ResponseEntity<Mono<Products>> updateProducts(@RequestBody Products products){
        Mono<Products> productosmono=this.psimplp.addProducts(products);
        return new ResponseEntity<Mono<Products>>(productosmono, HttpStatus.CREATED);
    }

    @GetMapping("/findProducts/{id}")
    public ResponseEntity<Mono<Products>> findProducts(@PathVariable String id){
        Mono<Products> productosmono=this.psimplp.findProducts(id);
        return new ResponseEntity<Mono<Products>>(productosmono, HttpStatus.OK);
    }
    @DeleteMapping ("/deleteProducts/{id}")
    public ResponseEntity<Mono<Void>> deleteProducts(@PathVariable String id){
        Mono<Void> productosmono=this.psimplp.deleteProducts(id);
        return new ResponseEntity<Mono<Void>>(productosmono, HttpStatus.CREATED);
    }

    @DeleteMapping ("/deleteAllProducts")
    public ResponseEntity<Mono<Void>> deleteAllProducts(){
        Mono<Void> productosmono=this.psimplp.deleteAllProducts();
        return new ResponseEntity<Mono<Void>>(productosmono, HttpStatus.CREATED);
    }
}
