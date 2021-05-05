import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Lancha lancha[] = new Lancha[5] ;
    // Jetski jetski[] = new Jetski[5] ;
    // Iate iate[] = new Iate[5] ;
    // ArrayList veiculosList = new ArrayList();
    List<Lancha> lanchaList = new ArrayList<Lancha>();
    List<Jetski> jetskiList = new ArrayList<Jetski>();
    List<Iate> iateList = new ArrayList<Iate>();
    Scanner scan1 = new Scanner(System.in);
    char veic;
    veic = 't';
    char isLoop = 't';

    // do {

    // System.out.println("Deseja continuar a cadastrar? S/N");
    // isLoop = scan1.next().charAt(0);

    // } while(isLoop == 's');

    System.out.println("----------------------------");
    System.out.println("Selecione o tipo de Veículo");
    System.out.println("1 - Lancha");
    System.out.println("2 - Jetski");
    System.out.println("3 - Iate");
    System.out.println("----------------------------");
    veic = scan1.next().charAt(0);
    if (veic == '1') {
      Lancha lancha = new Lancha();
      do {
        isLoop = 't';
        System.out.println("----------------------------");
        System.out.println("Informações da Lancha");
        System.out.println("----------------------------");
        lancha.entrada();
        System.out.println("----------------------------");
        lancha.imprimir();
        lanchaList.add(lancha);
        System.out.println("----------------------------");
        System.out.println("Deseja continuar a cadastrar? S/N");
        isLoop = scan1.next().charAt(0);
      } while (isLoop == 's');
      System.out.println("----------------------------");
    } else if (veic == '2') {
      Jetski jetski = new Jetski();
      do {
        isLoop = 't';
        System.out.println("----------------------------");
        System.out.println("Informações do Jetski");
        System.out.println("----------------------------");
        jetski.entrada();
        System.out.println("----------------------------");
        jetski.imprimir();
        jetskiList.add(jetski);
        System.out.println("----------------------------");
        System.out.println("Deseja continuar a cadastrar? S/N");
        isLoop = scan1.next().charAt(0);
      } while (isLoop == 's');
      System.out.println("----------------------------");
    } else if (veic == '3') {
      Iate iate = new Iate();
      do {
        isLoop = 't';
        System.out.println("----------------------------");
        System.out.println("Informações do Iate");
        System.out.println("----------------------------");
        iate.entrada();
        System.out.println("----------------------------");
        iate.imprimir();
        iateList.add(iate);
        System.out.println("----------------------------");
        System.out.println("Deseja continuar a cadastrar? S/N");
        isLoop = scan1.next().charAt(0);
      } while (isLoop == 's');
      System.out.println("----------------------------");
    }
  }
}
