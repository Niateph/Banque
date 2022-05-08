package org.diginamic.banque.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
    @Id /** Définir la PK */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /**AUTOINCREMENTAL PAR LE SGBDR */
    private int id; /** nom de la colonne */
    
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="datenaissance")
    private LocalDate dateNaissance;
    @Embedded
    private Adresse adresse;    
    @ManyToOne
    @JoinColumn(name="banq_ID")
    private Banque banque;
    @ManyToMany
    @JoinTable(name="cli_com",
	    joinColumns=@JoinColumn(name="ID_cli",referencedColumnName = "ID"),
	    inverseJoinColumns=@JoinColumn(name="ID_com",referencedColumnName = "ID")
    )
    private Set<Compte> comptesCli;
    
    
    public Client() {
	comptesCli = new HashSet<Compte>();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public Banque getBanque() {
        return banque;
    }
    public void setBanque(Banque banque) {
        this.banque = banque;
    }
    public Set<Compte> getComptes() {
        return comptesCli;
    }
    public void setComptes(Set<Compte> comptes) {
        this.comptesCli = comptes;
    }
    

}
