package com.example._24timerkomunneudvalg.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Parti {


  @Id
  @Column(length = 4)
  private int id;
  private String patiName;

  @OneToMany(mappedBy = "parti")
  @JsonBackReference
  private Set<Kandidat> kandidats = new HashSet<>();

  public Set<Kandidat> getKandidats() {
    return kandidats;
  }

  public void setId(int partiId) {
    this.id = partiId;
  }

  public void setPatiName(String patiName) {
    this.patiName = patiName;
  }

  public int getId() {
    return id;
  }

  public String getPatiName() {
    return patiName;
  }
}
