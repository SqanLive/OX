
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        char[][] tablica = new char[4][4];
        int wsp =0, wsp2 =0;

        wstepnaplansza();
        tablicowanie(tablica);
        skanowanie(wsp, wsp2, tablica);

    }
    
    public static void wstepnaplansza() {
    	  System.out.println("---------");
          System.out.println("| " + " " + " " + " " + " " + " " + " |");
          System.out.println("| " + " " + " " + " " + " " + " " + " |");
          System.out.println("| " + " " + " " + " " + " " + " " + " |");
          System.out.println("---------");
    }
    
    
    public static void skanowanie(int wsp, int wsp2, char[][] tablica) {
    	System.out.println("Enter the cordinates: ");
        Scanner scanner = new Scanner(System.in);
        try {
        wsp = scanner.nextInt();
        wsp2 = scanner.nextInt();
        }
        catch(Exception e){
        	System.out.println("Podaj liczby");
        	skanowanie(wsp, wsp2, tablica);
        }
        podmianka(tablica, wsp, wsp2);
    }
    
    public static void podmianka(char[][] tablica, int wsp, int wsp2) {
    	int krzyzyk = 0;
        int kolko = 0;
        
        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 4; j++) {
            	if(tablica[i][j] == 'X') {
            		krzyzyk++;
            	}
            	else if(tablica[i][j] == 'O') {
            		kolko++;
            	}
            }
        }
        if(wsp != 1 && wsp != 2 && wsp != 3) {
        	System.out.println("ERROR INTÓW");
        	skanowanie(wsp, wsp2, tablica);
        }
        if(wsp2 != 1 && wsp2 != 2 && wsp2 != 3) {
        	System.out.println("ERROR INTÓW 2");
        	skanowanie(wsp, wsp2, tablica);
        }

        if(tablica[wsp][wsp2] != ' ') {
    		System.out.println("ERROR DANYCH");
    		skanowanie(wsp, wsp2, tablica);
    	}
    	if( krzyzyk > kolko) {
    		tablica[wsp][wsp2] = 'O';
    		if(kolko + krzyzyk == 8) {
        		System.out.println("Draw");
        	}
    		else {
        	rysujplansze(wsp, wsp2,tablica);
    		}
    	}
    	if (krzyzyk <= kolko ) {
    		tablica[wsp][wsp2] = 'X';
    		if(kolko + krzyzyk == 8) {
        		System.out.println("Draw");
        	}
    		else {
        	rysujplansze(wsp, wsp2, tablica);
    		}
    	}
  
    }
    
    public static void tablicowanie(char tablica[][]) {
    	tablica[1][3] = ' ';
    	tablica[2][3] = ' ';
    	tablica[3][3] = ' ';
    	tablica[1][2] = ' ';
    	tablica[2][2] = ' ';
    	tablica[3][2] = ' ';
    	tablica[1][1] = ' ';
    	tablica[2][1] = ' ';
    	tablica[3][1] = ' ';
    	
    }



    public static void rysujplansze(int wsp, int wsp2, char tablica[][]){
        System.out.println("---------");
        System.out.println("| " + tablica[1][3] + " " + tablica[2][3] + " " + tablica[3][3] + " |");
        System.out.println("| " + tablica[1][2] + " " + tablica[2][2] + " " + tablica[3][2] + " |");
        System.out.println("| " + tablica[1][1] + " " + tablica[2][1] + " " + tablica[3][1] + " |");
        System.out.println("---------");
        okreslstan(wsp, wsp2, tablica);
    }

    public static void okreslstan(int wsp, int wsp2, char tablica[][]){


        if((tablica[1][3] == tablica[2][3] && tablica[2][3] == tablica[3][3]) && (tablica[1][3] == 'X' || tablica[1][3] == 'O')){
             System.out.println(tablica[1][3] + " wins.");
        }
        else if(tablica[1][2] == tablica[2][2] && tablica[2][2] == tablica[3][2] && (tablica[1][2] == 'X' || tablica[1][2] == 'O')){
        	System.out.println(tablica[1][2] + " wins.");
        }
        else if(tablica[1][1] == tablica[2][1] && tablica[2][1] == tablica[3][1] && (tablica[1][1] == 'X' || tablica[1][1] == 'O')){
        	System.out.println(tablica[1][1] + " wins.");
        }
        else if(tablica[1][3] == tablica[1][2] && tablica[1][2] == tablica[1][1] && (tablica[1][3] == 'X' || tablica[1][3] == 'O')){
        	System.out.println(tablica[1][3] + " wins.");
        }
        else if(tablica[2][3] == tablica[2][2] && tablica[2][2] == tablica[2][1] && (tablica[2][3] == 'X' || tablica[2][3] == 'O')){
        	System.out.println(tablica[2][3] + " wins.");
        }
        else if(tablica[3][3] == tablica[3][2] && tablica[3][2] == tablica[3][1] && (tablica[3][3] == 'X' || tablica[3][3] == 'O')){
        	System.out.println(tablica[3][3] + " wins.");
        }
        else if(tablica[1][1] == tablica[2][2] && tablica[2][2] == tablica[3][3] && (tablica[1][1] == 'X' || tablica[1][1] == 'O')){
        	System.out.println(tablica[1][1] + " wins.");
        }
        else if(tablica[1][3] == tablica[2][2] && tablica[2][2] == tablica[3][1] && (tablica[1][3] == 'X' || tablica[1][3] == 'O')){
        	System.out.println(tablica[1][3] + " wins.");
        }
        else {
        	skanowanie(wsp,wsp2,tablica);
        }
        


    }

}
