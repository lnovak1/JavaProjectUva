import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Lancha> lanchaList = new ArrayList<Lancha>();
    List<Jetski> jetskiList = new ArrayList<Jetski>();
    List<Iate> iateList = new ArrayList<Iate>();
    Scanner scan1 = new Scanner(System.in);
    char veic;
    veic = 't';
    char isLoopCad = 't';
    char isLoopObj = 't';
    do {
      isLoopCad = 't';
      System.out.println("----------------------------");
      System.out.println("Selecione o tipo de Veículo");
      System.out.println("1 - Lancha");
      System.out.println("2 - Jetski");
      System.out.println("3 - Iate");
      System.out.println("----------------------------");
      veic = scan1.next().charAt(0);
      if (veic == '1') {
        do {
          Lancha lancha = new Lancha();
          isLoopObj = 't';
          System.out.println("----------------------------");
          System.out.println("Informações da Lancha");
          System.out.println("----------------------------");
          lancha.entrada();
          System.out.println("----------------------------");
          lancha.imprimir();
          lanchaList.add(lancha);
          System.out.println("----------------------------");
          System.out.println("Deseja continuar a cadastrar? S/N");
          isLoopObj = scan1.next().charAt(0);
        } while (isLoopObj == 's');
        System.out.println("----------------------------");
      } else if (veic == '2') {
        do {
          Jetski jetski = new Jetski();
          isLoopObj = 't';
          System.out.println("----------------------------");
          System.out.println("Informações do Jetski");
          System.out.println("----------------------------");
          jetski.entrada();
          System.out.println("----------------------------");
          jetski.imprimir();
          jetskiList.add(jetski);
          System.out.println("----------------------------");
          System.out.println("Deseja continuar a cadastrar? S/N");
          isLoopObj = scan1.next().charAt(0);
        } while (isLoopObj == 's');
        System.out.println("----------------------------");
      } else if (veic == '3') {
        do {
          Iate iate = new Iate();
          isLoopObj = 't';
          System.out.println("----------------------------");
          System.out.println("Informações do Iate");
          System.out.println("----------------------------");
          iate.entrada();
          System.out.println("----------------------------");
          iate.imprimir();
          iateList.add(iate);
          System.out.println("----------------------------");
          System.out.println("Deseja continuar a cadastrar? S/N");
          isLoopObj = scan1.next().charAt(0);
        } while (isLoopObj == 's');
        System.out.println("----------------------------");
      }

      System.out.println("Deseja continuar a cadastrar Veiculos? S/N");
      isLoopCad = scan1.next().charAt(0);
    } while (isLoopCad == 's');
    System.out.println("Lista de Veiculos Cadastrados:");
    System.out.println("-------------Lanchas-----------");
    for (Lancha i : lanchaList) {
      System.out.println("----------------------------");
      i.imprimir();
      System.out.println("----------------------------");
    }
    System.out.println("-------------Jetski-----------");
    for (Jetski i : jetskiList) {
      System.out.println("----------------------------");
      i.imprimir();
      System.out.println("----------------------------");
    }
    System.out.println("-------------Iate------------");
    for (Iate i : iateList) {
      System.out.println("----------------------------");
      i.imprimir();
      System.out.println("----------------------------");
    }
  }
}
