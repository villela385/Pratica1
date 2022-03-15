import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("DIgite a placa do carro:");
    String palavra = ler.nextLine();
    System.out.println("DIgite o ano de fabricação:");
    int ano = ler.nextInt();

    if (ano < 2010){
      System.out.println("Carro velho");
    } 
    else if (ano <= 2021){
      System.out.println("Carro semi novo");  
    }
    else if (ano == 2022){
      System.out.println("Carro novo");
    }
    palavra = palavra.toUpperCase();
    char vogal;
    for (int i = 0; i < palavra.length(); i++){
      vogal = palavra.charAt(i);
      if (palavra.charAt(i) == 'A'){
        palavra = palavra.replace('A', '*');
      }
      if (palavra.charAt(i) == 'E'){
        palavra = palavra.replace('E', '*');
      }
      if (palavra.charAt(i) == 'I'){
       palavra = palavra.replace('I', '*'); 
      }
      if (palavra.charAt(i) == 'O'){
        palavra = palavra.replace('O', '*');
      }
      if (palavra.charAt(i) == 'U'){
          palavra = palavra.replace('U', '*');
        }
    }
    System.out.println(palavra);
  }
}