package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

//이 파일이 폼 데이터를 받아 올 그릇, 즉 DTO가 된다.
@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;// 제목을 받을 필드
    private String content;// 내용을 받을 필드

    /*public ArticleForm(String title, String content) {
        //전송받은 제목과 내용을 필드에 저장하는 생성자 추가
        this.title = title;
        this.content = content;
    }롬복추가에 의해 삭제*/

   /* @Override
    public String toString() {
        //데이터를 잘 받았는지 호가인할 toStroing() 메서드 추가
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }*/

    public Article toEntity() {
        //toEntitiy()메서드는 DTO인 form 객체를 엔티티 객체로 변환하는 역활
        return new Article(null,title,content);
    }
}
