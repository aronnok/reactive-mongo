package com.palebluedotstardust.realestatex.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class ArticleData {


    @Id
    private String id;
    private String articleKey;
    private String memo;



}
