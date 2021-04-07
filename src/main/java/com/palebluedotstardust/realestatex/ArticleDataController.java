package com.palebluedotstardust.realestatex;

import com.palebluedotstardust.realestatex.entities.ArticleData;
import com.palebluedotstardust.realestatex.repos.ArticleDataRepo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/articleKey")
@Log
public class ArticleDataController {


    @Autowired
    private ArticleDataRepo repo;

    @Autowired
    private TemplateOps templateOps;

    @GetMapping
    private Flux<ArticleData> getAllEmployees() {
        return repo.findAll();
    }


    @PostMapping
    private void saveNewData(){

           ArticleData articleData;
           for (int i= 0; i <1000000;i++){
               articleData = new ArticleData();
               articleData.setArticleKey(Double.toString(Math.random()));
               articleData.setMemo(Double.toString(Math.random()));
               //templateOps.save(Mono.just(encryptionData));

               repo.save(articleData)
                       .subscribe(result -> log.info("Entity has been saved: "+ result));

           }

    }

}
