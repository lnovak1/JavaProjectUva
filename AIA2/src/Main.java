package AIA2.src;

import java.util.Scanner;
import AIA2.src.com.novak.veiculo.Aviao;
import AIA2.src.com.novak.veiculo.Carro;
import AIA2.src.com.novak.veiculo.Lancha;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Aviao> aviaoList = new ArrayList<>();
    List<Lancha> lanchaList = new ArrayList<>();
    List<Carro> carroList = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
    char veic = 't';
    char isLoopCad = 't';
    char isLoopObj = 't';
    do {
      isLoopCad = 't';
      System.out.println("----------------------------");
      System.out.println("Selecione o tipo de Veículo");
      System.out.println("1 - Lancha");
      System.out.println("2 - Aviao");
      System.out.println("3 - Carro");
      System.out.println("----------------------------");
      veic = scan.next().charAt(0);
      if (veic == '1') {
        do {
          Lancha lancha = new Lancha();
          isLoopObj = 't';
          System.out.println("----------------------------");
          System.out.println("Informações da Lancha");
          System.out.println("----------------------------");
          lancha.entradaDados();
          System.out.println("----------------------------");
          lancha.imprimir();
          lanchaList.add(lancha);
          System.out.println("----------------------------");
          System.out.println("Deseja continuar a cadastrar? S/N");
          isLoopObj = scan.next().charAt(0);
        } while (isLoopObj == 's');
        System.out.println("----------------------------");
      } else if (veic == '2') {
        do {
          Aviao aviao = new Aviao();
          isLoopObj = 't';
          System.out.println("----------------------------");
          System.out.println("Informações do Aviao");
          System.out.println("----------------------------");
          aviao.entradaDados();
          System.out.println("----------------------------");
          aviao.imprimir();
          aviaoList.add(aviao);
          System.out.println("----------------------------");
          System.out.println("Deseja continuar a cadastrar? S/N");
          isLoopObj = scan.next().charAt(0);
        } while (isLoopObj == 's');
        System.out.println("----------------------------");
      } else if (veic == '3') {
        do {
          Carro carro = new Carro();
          isLoopObj = 't';
          System.out.println("----------------------------");
          System.out.println("Informações do Carro");
          System.out.println("----------------------------");
          carro.entradaDados();
          System.out.println("----------------------------");
          carro.imprimir();
          carroList.add(carro);
          System.out.println("----------------------------");
          System.out.println("Deseja continuar a cadastrar? S/N");
          isLoopObj = scan.next().charAt(0);
        } while (isLoopObj == 's');
        System.out.println("----------------------------");
      }

      System.out.println("Deseja continuar a cadastrar Veiculos? S/N");
      isLoopCad = scan.next().charAt(0);
    } while (isLoopCad == 's');
    System.out.println("Lista de Veiculos Cadastrados:");
    System.out.println("-------------Lanchas-----------");
    for (Lancha i : lanchaList) {
      System.out.println("----------------------------");
      i.imprimir();
      System.out.println("----------------------------");
    }
    System.out.println("-------------Aviao-----------");
    for (Aviao i : aviaoList) {
      System.out.println("----------------------------");
      i.imprimir();
      System.out.println("----------------------------");
    }
    System.out.println("-------------Carro------------");
    for (Carro i : carroList) {
      System.out.println("----------------------------");
      i.imprimir();
      System.out.println("----------------------------");
    }
  }

}
