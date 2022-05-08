package org.diginamic.banque.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private int numero;
    private String rue;
    private int codePostale;
    private String ville;
    
    public Adresse (int num, String rue, int codepo, String ville)    {
	this.numero=num;
	this.rue=rue;
	this.codePostale=codepo;
	this.ville=ville;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public int getCodePostale() {
        return codePostale;
    }
    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
}
