package controle_fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("DIGITE O PRIMEIRO VALOR: ");
            int primeiroValor = scanner.nextInt();
            System.out.print("DIGITE O SEGUNDO VALOR VALOR: ");
            int segundoValor = scanner.nextInt();

        try{

            contar(primeiroValor, segundoValor);


        }catch (ParametrosInvalidosException e){

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }


    }

    static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException{
        if(primeiroValor > segundoValor){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = segundoValor - primeiroValor ;
            for(int i = 1; i <= contagem; i++){
                System.out.println("IMPRIMINDO O NÚMERO " + i);
            }
        }

    }
}
