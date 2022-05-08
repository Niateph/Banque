package org.diginamic.banque.entities;

import javax.persistence.Column;

public class Virement extends Operation {
    @Column(name="Beneficiaire")
    String beneficiaire;
}
