class Operation {

public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0; // ou tu peux lancer une exception
        }
        return (double) a / b;
    }
// Méthode pour additionner deux nombres
    public static int addition(int a, int b) {

        return a + b;
    }

    // Méthode pour soustraire deux nombres
    public static int soustraction(int a, int b) {

        return a - b;
    }

    // Méthode pour multiplier deux nombres
    public static int multiplication(int a, int b) {
        return a * b;
    }
}
