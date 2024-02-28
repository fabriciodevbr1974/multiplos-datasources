package br.dev.fabricio.multiplosdatasources.entities;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_comment")
public class CommentEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String descricao;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
