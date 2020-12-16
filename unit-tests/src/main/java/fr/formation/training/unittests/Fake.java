package fr.formation.training.unittests;

public class Fake {

    public static void main(String[] args) {
	testerQueSommeFonctionneBien(2, 2, 4);
	testerQueSommeFonctionneBien(3, 3, 6);
	testerQueSommeFonctionneBien(-1, 1, 0);
    }

    private static void testerQueSommeFonctionneBien(double a, double b,
	    double expected) {
	// Résulat obtenu
	double actual = somme(a, b);
	if (actual == expected) {
	    System.out.println("Success");
	} else {
	    System.out.println(
		    "Failed, expected " + expected + ", but got " + actual);
	}
    }

    private static double somme(double a, double b) {
	return a + b;
    }
}
