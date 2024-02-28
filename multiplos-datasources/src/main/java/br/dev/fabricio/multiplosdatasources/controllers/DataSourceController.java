package br.dev.fabricio.multiplosdatasources.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-source")
public class DataSourceController {

  @Autowired
  private DataSourceProperties posts;
  @Qualifier("comments")
  @Autowired
  private DataSourceProperties comments;

  @GetMapping
  public void dataSource() {
    System.out.println("oi");
    System.out.println(posts.getUrl());
    System.out.println(comments.getUrl());
  }


}
