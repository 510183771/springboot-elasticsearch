package com.nick.springboot.elastic.repository;

import com.nick.springboot.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 ElasticsearchRepository<Book,Integer> Integer 主键类型
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    //参照
    // https://docs.spring.io/spring-data/elasticsearch/docs/3.0.6.RELEASE/reference/html/
   //public List<Book> findByBookNameLike(String bookName);

}
