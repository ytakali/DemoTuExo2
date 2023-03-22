package Entities;

public class Condition
{
    public static boolean valider(int nbJours)
    {
        if (nbJours > 30)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static int CalculerMontantMaxCategorie(String uneCategorie)
    {
        int max = 0;
        if (uneCategorie.equals("Livres"))
        {
            max = 30;
        }
        else if (uneCategorie.equals("Jouets"))
        {
            max = 50;
        }
        else if (uneCategorie.equals("Informatique"))
        {
            max = 1000;
        }
        return max;
    }

    public static double CalculerReducMembre(boolean estMembre)
    {
        double deduction = 0;
        double prix = 100; // un prix fixe pour l'exemple

        if (estMembre == true)
        {
            deduction = prix * 0.2;
        }
        else if (estMembre == false)
        {
            deduction = 0;
        }
        return deduction;
    }


    public static double CalculerReducEtat (String unEtat)
    {
        double prix = 100; // un prix fixe pour l'exemple
        double deduction = 0;
        double total;

        if (unEtat.equals("Abimé") || unEtat.equals("Très abimé"))
        {
            deduction = 0.3;
        }
        else
        {
            deduction = 0.1;
        }

        total = prix * deduction;

        return total;
    }

    public static double CalculerMontantRembourse (int unNb,String uneCateg,boolean estMembre,String unEtat,int unPrix)
    {
        int montantMax = 0;

        return 0;
    }

}
