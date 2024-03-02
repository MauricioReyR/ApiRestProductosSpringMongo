package com.ApiRestMavenMongo.Login;

import com.ApiRestMavenMongo.Login.ApiRest.Products;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends ReactiveMongoRepository<Products,String> {


}
