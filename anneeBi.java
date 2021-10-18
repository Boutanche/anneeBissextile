import java.util.Scanner;
/**
 * Programme qui permetre de calculer si une année est bissextile ou non :
 */
public class anneeBi {
    /**
     * Entrée principale du programme.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Ce programme va me dire si cette année est bissextile :");
        System.out.println("Entrez une année : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean estBissextile = ((year %4 == 0) && (year% 100 != 0)) || (year %400 == 0);
        if(estBissextile){
            System.out.println(year + " est bissextile.");
        } else {
            System.out.println(year + " n'est pas bissextile.");
        }
        sc.close();
    }
}
