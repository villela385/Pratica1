import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int DataVoo, HorarioVoo, NumeroVoo, num = 0;
    String CPF, nome;
    do{
      System.out.println("1 - Cadastrar Passageiro");
      System.out.println("2 - Check in");
      System.out.println("3 - Cancelar Voo");
      System.out.println("4 - Sair");
      num = ler.nextInt();
      switch (num){
        case 1:
          System.out.println ("Digite seu nome");
          nome = ler.next();
          System.out.println ("Digite seu CPF");
          CPF = ler.next();
          System.out.println ("Digite seu data do voo");
          DataVoo= ler.nextInt();
          System.out.println ("Digite seu horário do voo");
          HorarioVoo = ler.nextInt();
          
          Random gerador = new Random();
    
          int numAl = gerador.nextInt(999);  
          
          System.out.println ("Cadastro efetuado com sucesso.Número do voo: " + numAl);

          break;
        case 2:
          System.out.println ("Digite seu CPF");
          CPF = ler.nextLine();
          System.out.println ("Digite o número do voo");
          NumeroVoo = ler.nextInt();

          System.out.println ("Check in");
          break;
        case 3:
          System.out.println ("Digite seu CPF");
          CPF = ler.nextLine();
          System.out.println ("Digite o número do voo");
          NumeroVoo = ler.nextInt();

          System.out.println ("Voo cancelado com sucesso");
          break;
      }
    } while (num != 4);
  }
}