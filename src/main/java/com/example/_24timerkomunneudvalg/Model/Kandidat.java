package com.example._24timerkomunneudvalg.Model;

import jakarta.persistence.*;

@Entity
public class Kandidat {

  @Id
  @Column(length = 4)
  private int id;
  private String kandidatName;

  @ManyToOne
  @JoinColumn(name = "partiKode", referencedColumnName = "id")
  private Parti parti;

  public Parti getParti() {
    return parti;
  }

  public int getId() {
    return id;
  }

  public String getKandidatName() {
    return kandidatName;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setKandidatName(String kandidatName) {
    this.kandidatName = kandidatName;
  }
}
