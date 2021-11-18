package acerte_numero;

import java.util.Random;
import java.util.Scanner;

public class Acerte_numero {

    public static int num_easy(){
        
        Random random = new Random();
        int num = random.nextInt(11);
        
        return num;   
    }
    
    public static int num_medium(){
        
        Random random = new Random();
        int num = random.nextInt(26);
        
        return num;   
    }
    
    public static int num_hard(){
        
        Random random = new Random();
        int num = random.nextInt(51);
        
        return num;   
    }
    
    public static int num_insane(){
        
        Random random = new Random();
        int num = random.nextInt(151);
        
        return num;   
    }
    
    public static int choose_nivel(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha o nível!");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");
        System.out.println("4 - Insane");
        
        int nivel = input.nextInt();
        
        return nivel;
    }
    
    public static int easy_medium_tentative(){
        
        int tentative = 5;
        
        return tentative;
    }
    
    public static int hard_insane_tentative(){
        
        int tentative = 3;
        
        return tentative;
    }
    
    public static void loop(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Deseja jogar de novo?");
        System.out.println("Y - Yes");
        System.out.println("N - No");
        
        String loop = input.nextLine();
        
        if(null == loop){
            System.out.println("Comando inválido!");
        }else switch (loop) {
            case "Y", "y" -> right_or_wrong();
            case "N", "n" -> System.out.println("Bye!");
            default ->  System.out.println("Tecla Inválida!");
        }
    } 
    
    public static void right_or_wrong(){
        
        int rw = choose_nivel();
        
        switch(rw){
            
            case 1 ->{
                int r = num_easy();
                int tentative = easy_medium_tentative();
                int rodada = 1;
                
                while(rodada <= tentative){
                    
                    System.out.println("São 5 tentativas");
                    System.out.println("Escolha um número entre 0 e 10");
                    System.out.println("Tentativa "+rodada+" de "+tentative);
                    Scanner input = new Scanner(System.in);
        
                    System.out.println("Digite o seu número: ");
                    int chute = input.nextInt();
                    System.out.println("Você digitou: "+chute);
                    
                    if(r == chute){
                        System.out.println("Você acertou!");
                        break;                        
                    }else if(r > chute){
                        System.out.println("Você errou! O seu chute foi maior que o número secreto");
                    }else if(r < chute){
                        System.out.println("Você errou! O seu chute foi menor que o número secreto");
                    }
                    rodada += 1;    
                }
                System.out.println("Fim do Jogo!");
                loop();
            }
            
            case 2 ->{
                int r = num_medium();
                int tentative = easy_medium_tentative();
                int rodada = 1;
                
                while(rodada <= tentative){
                    
                    System.out.println("São 5 tentativas");
                    System.out.println("Escolha um número entre 0 e 25");
                    System.out.println("Tentativa "+rodada+" de "+tentative);
                    Scanner input = new Scanner(System.in);
        
                    System.out.println("Digite o seu número: ");
                    int chute = input.nextInt();
                    System.out.println("Você digitou: "+chute);
                    
                    if(r == chute){
                        System.out.println("Você acertou!");
                        break;                        
                    }else if(r > chute){
                        System.out.println("Você errou! O seu chute foi maior que o número secreto");
                    }else if(r < chute){
                        System.out.println("Você errou! O seu chute foi menor que o número secreto");
                    }
                    rodada += 1;    
                }
                System.out.println("Fim do Jogo!");
                loop();
            }
            
            case 3 ->{
                int r = num_hard();
                int tentative = hard_insane_tentative();
                int rodada = 1;
                
                while(rodada <= tentative){
                    
                    System.out.println("São 3 tentativas");
                    System.out.println("Escolha um número entre 0 e 50");
                    System.out.println("Tentativa "+rodada+" de "+tentative);
                    Scanner input = new Scanner(System.in);
        
                    System.out.println("Digite o seu número: ");
                    int chute = input.nextInt();
                    System.out.println("Você digitou: "+chute);
                    
                    if(r == chute){
                        System.out.println("Você acertou!");
                        break;                        
                    }else if(r > chute){
                        System.out.println("Você errou! O seu chute foi maior que o número secreto");
                    }else if(r < chute){
                        System.out.println("Você errou! O seu chute foi menor que o número secreto");
                    }
                    rodada += 1;    
                }
                System.out.println("Fim do Jogo!");
                loop();
            }
            
            case 4 ->{
                int r = num_insane();
                int tentative = hard_insane_tentative();
                int rodada = 1;
                
                while(rodada <= tentative){
                    
                    System.out.println("São 3 tentativas");
                    System.out.println("Escolha um número entre 0 e 150");
                    System.out.println("Tentativa "+rodada+" de "+tentative);
                    Scanner input = new Scanner(System.in);
        
                    System.out.println("Digite o seu número: ");
                    int chute = input.nextInt();
                    System.out.println("Você digitou: "+chute);
                    
                    if(r == chute){
                        System.out.println("Você acertou!");
                        break;                        
                    }else if(r > chute){
                        System.out.println("Você errou! O seu chute foi maior que o número secreto");
                    }else if(r < chute){
                        System.out.println("Você errou! O seu chute foi menor que o número secreto");
                    }
                    rodada += 1;    
                }
                System.out.println("Fim do Jogo!");
                loop();
            }
        }
    }
    
    public static void main(String[] args) {
        right_or_wrong();
    }  
}
