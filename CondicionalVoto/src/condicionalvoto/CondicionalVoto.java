package condicionalvoto;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CondicionalVoto {


    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Verificador de elegibilidade nas eleições");
        System.out.print("Nascimento: ");
        int nasc = tec.nextInt();
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        int idade = ano - nasc;
        System.out.print("Sua idade é " + idade + " anos.");    
        if(idade < 16){
            System.out.print("não pode votar. \nVota inválido.");
        }else if (idade >= 16 && idade < 18 || idade > 70){
            System.out.print(" pode votar se quiser. \nVoto opcional.");
        }else{
            System.out.println("tem que votar. \nSeu voto é obrigatório.");
        }
            
    }
    
    
}
