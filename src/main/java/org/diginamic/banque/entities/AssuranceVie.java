package org.diginamic.banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;

public class AssuranceVie extends Compte {
    @Column(name="date_fin")
    private LocalDate  dateFin;
    @Column(name="taux")
    private double taux;    
}
