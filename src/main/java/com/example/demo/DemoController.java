package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Article;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DemoController {
  
  @Autowired
  DemoService demoService;
  
  @GetMapping(path = "/")
  public String index() {
    return "index";
  }
  
  @GetMapping(path = DemoLinks.ARTICLES)
  public ResponseEntity<?> listArticles() {
    log.info("DemoController: list articles");
    List<Article> articles = demoService.getArticles();
    return ResponseEntity.ok(articles);
  }
  
  @PostMapping(path = DemoLinks.ARTICLE)
  public ResponseEntity<?> saveArticle(@RequestBody Article article) {
    log.info("DemoController: save article");
    Article result = demoService.saveArticle(article);
    return ResponseEntity.ok(result);
  }
  
  @DeleteMapping(path = DemoLinks.ARTICLE)
  public ResponseEntity<?> deleteArticle(@RequestBody Long id) {
    log.info("DemoController: delete article");
    try {
      demoService.removeArticle(id);
      return ResponseEntity.ok(null);
    } catch (IllegalArgumentException e ) {
      log.warn(e.getMessage());
      return ResponseEntity.notFound().build();
    } catch (Exception e) {
      log.error(e.getMessage());
      return ResponseEntity.internalServerError().build();
    }
  }
}
