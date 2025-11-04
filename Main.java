public class Main {
      public static void main(String[] args) {
          int a = 2;
          int b = 3;

System.out.println("Bienvenue");          
 double resultatDivision = Operation.division(a, b);
 int resultat = Operation.multiplication(a, b);
 int resultatSoustraction = Operation.soustraction(a, b);
 int resultatAddition = Operation.addition(a, b);

System.out.println(a + " * " + b + " = " + resultat);
System.out.println(a + " - " + b + " = " + resultatSoustraction);
System.out.println(a + " + " + b + " = " + resultatAddition); 

      } 
}
