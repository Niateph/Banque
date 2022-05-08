package org.diginamic.banque.entities;

import javax.persistence.Column;

public class LivretA extends Compte {
    @Column(name="taux")
    private double taux;
}
