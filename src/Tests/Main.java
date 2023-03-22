package Tests;

import Entities.Condition;

import static org.junit.jupiter.api.Assertions.*;

class Main {

    private Condition uneCategorie;
    private Condition estMembre;
    private Condition unNbDeJours;
    private Condition unEtat;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        uneCategorie = new Condition();
        estMembre = new Condition();
        unNbDeJours = new Condition();
        unEtat = new Condition();
    }

    @org.junit.jupiter.api.Test
    void valider()
    {
        boolean actual = Condition.valider(12);
        assertTrue(actual);

        actual = Condition.valider(34);
        assertFalse(actual);

    }

    @org.junit.jupiter.api.Test
    void calculerMontantMaxCategorie()
    {
        int expected = 30;
        int actual = Condition.CalculerMontantMaxCategorie("Livres");
        assertEquals(expected, actual);

        expected = 50;
        actual = Condition.CalculerMontantMaxCategorie("Jouets");
        assertEquals(expected, actual);

        expected = 1000;
        actual = Condition.CalculerMontantMaxCategorie("Informatique");
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculerReducMembre()
    {
        double actual = Condition.CalculerReducMembre(true);
        double reducFalse = Condition.CalculerReducMembre(false);

        assertEquals(20.0, actual);
        assertEquals(0.0, reducFalse);

    }

    @org.junit.jupiter.api.Test
    void calculerReducEtat()
    {
        double actual = Condition.CalculerReducEtat("Abimé");
        assertEquals(30, actual);

        actual = Condition.CalculerReducEtat("Très abimé");
        assertEquals(30, actual);

        actual = Condition.CalculerReducEtat("Neuf");
        assertEquals(10, actual);
    }

    @org.junit.jupiter.api.Test
    void calculerMontantRembourse()
    {
        Condition.CalculerMontantRembourse(25,"Informatique",true,"Neuf",699);
        Condition.CalculerMontantRembourse(40,"Livres",false,"Abimé",3);
        Condition.CalculerMontantRembourse(15,"Jouets",false,"Très abimé",15);
        Condition.CalculerMontantRembourse(10,"Livres",true,"Neuf",25);
        Condition.CalculerMontantRembourse(32,"Jouets",true,"Abimé",150);
    }

}