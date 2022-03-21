package com.example.selling.entities;

import javax.persistence.*;

@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String article;
    @ManyToOne
  //  @JsonIgnore
    @JoinColumn(name = "destination_id")
    private Client destination;
    private String statut;

    public Client getDestination() {
        return destination;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void setDestination(Client destination) {
        this.destination = destination;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
