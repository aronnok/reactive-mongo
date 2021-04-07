package com.palebluedotstardust.realestatex;

import com.palebluedotstardust.realestatex.entities.ArticleData;
import com.palebluedotstardust.realestatex.repos.ArticleDataRepo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TemplateOps {

    private final ArticleDataRepo repo;

    TemplateOps(ArticleDataRepo repo) {
        this.repo = repo;
    }

    public Mono<ArticleData> findById(String id) {
        return repo.findById(id);
    }

    public Flux<ArticleData> findAll() {
        return repo.findAll();
    }

    public Mono<ArticleData> save(ArticleData ArticleData) {
        return repo.save(ArticleData);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

}