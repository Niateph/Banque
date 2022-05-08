package org.diginamic.banque.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="compte")
public class Compte {
    @Id /** Définir la PK */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /**AUTOINCREMENTAL PAR LE SGBDR */
    private int id; /** nom de la colonne */
    @Column(name="num")
    private String numero;
    @Column(name="solde")
    private double solde;
    @ManyToMany(mappedBy = "comptesCli")
    private Set<Client> clients;
    @OneToMany(mappedBy="compteOpe")
    private Set<Operation> operations;
    
    public Compte() {
	clients = new HashSet<Client>();
	operations = new HashSet<Operation>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }
    
    
}
