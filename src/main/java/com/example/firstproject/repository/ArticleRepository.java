package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article,Long> {
    @Override
    ArrayList<Article> findAll();
    // crudRepository는 JPA에서 제공하는 인터페잉스로 이를 상속해 엔티티를 관리할 수 있다.
    //Article : 관리 대상 엔티티의 클래스  타입
    //Long : 관리 대상 엔티티의 대푯값 타입
    //여기까지 작성하면 제공하는 기능을 별도 정의 없이 그대로 사용할 수 있습니다.
}
