import java.util.Scanner;
public class calculatrice{
    public static void main(String[] args) {
        int nombre1;
        int nombre2;
        int resultat=0;
        char op;

        Scanner saisir= new Scanner(System.in);
        System.out.println("Entrer la premiere valeur");
        nombre1=saisir.nextInt();
        System.out.println("Entrer la deuxieme valeur");
        nombre2=saisir.nextInt();
        System.out.println("Entrer un opérateur");
        op=saisir.next().charAt(0);

        switch (op) {
            case '+':
                resultat=nombre1+nombre2;break;
            case '-':
                resultat=nombre1-nombre2;break;
            case '*':
                resultat=nombre1*nombre2;break;
            case '/':
            if (nombre2!=0) {
                resultat=nombre1/nombre2;   
            }else{
                System.out.println("ERROR:La division par 0 est impossible");
            }
                break;
            default:
            System.out.println("Ceci n'est pas un opérateur");
                break;
        }
        System.out.println("le résultat est :"+ resultat);
    }
}