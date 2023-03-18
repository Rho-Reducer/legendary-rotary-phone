package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;

@Component
public class DemoService {
  
  private ArticleRepository articleRepository;
  //private SubscriberRepository subscriberRepository;
  //private CommentRepository commentRepository;
  
  public DemoService(ArticleRepository articleRepo/*, SubscriberRepository subscriberRepo, CommentRepository commentRepo*/) {
    this.articleRepository = articleRepo;
  }
  
  public List<Article> getArticles() {
    return articleRepository.findAll();
  }
  
  public Article saveArticle(Article article) {
    return articleRepository.save(article);
  }
  
  public void removeArticle(Long id) {
    Optional<Article> article = articleRepository.findById(id);
    if (article.isEmpty())
      throw new IllegalArgumentException("Unable to find article with ID: " + id);
      
    articleRepository.delete(article.get());
  }
}
