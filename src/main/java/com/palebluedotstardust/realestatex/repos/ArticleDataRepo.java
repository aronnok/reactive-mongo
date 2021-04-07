package com.palebluedotstardust.realestatex.repos;

import com.palebluedotstardust.realestatex.entities.ArticleData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ArticleDataRepo extends ReactiveMongoRepository<ArticleData, String> {



    Flux<ArticleData> findByArticleKey(final String articleKey);
    Mono<ArticleData> findOneByArticleKey(final String articleKey);


}
