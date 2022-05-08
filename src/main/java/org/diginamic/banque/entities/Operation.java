package org.diginamic.banque.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Operation {
    @Id /** Définir la PK */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /**AUTOINCREMENTAL PAR LE SGBDR */
    private int id; /** nom de la colonne */
    @Column(name="date")
    private LocalDateTime date;
    @Column(name="montant")
    private double montant;
    @Column(name="motif")
    private String motif;
    @ManyToOne
    @JoinColumn(name="com_ID")
    private Compte compteOpe;
    
    public Operation() {
	
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Compte getCompteOpe() {
        return compteOpe;
    }

    public void setCompteOpe(Compte compteOpe) {
        this.compteOpe = compteOpe;
    }    
}
