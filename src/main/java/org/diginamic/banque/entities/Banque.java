package org.diginamic.banque.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banque")

public class Banque {
    @Id /** Définir la PK */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /**AUTOINCREMENTAL PAR LE SGBDR */
    private int id; /** nom de la colonne */
    
    @Column(name="nom")
    private String name;
    
    @OneToMany(mappedBy = "banque")
    private Set<Client> clients; 
    
    public Banque() {
	clients = new HashSet<Client>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }   
}
