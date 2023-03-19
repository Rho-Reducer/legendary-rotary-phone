package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoLinks {
  private static final String API_ROOT = "/api";
  public static final String ARTICLES = API_ROOT + "/articles";
  public static final String ARTICLE = API_ROOT + "/article";
  public static final String SUBSCRIBE = API_ROOT + "/subscribe";
}
