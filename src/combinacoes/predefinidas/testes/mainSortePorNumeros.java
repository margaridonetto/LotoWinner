package combinacoes.predefinidas.testes;

import java.util.ArrayList;

public class mainSortePorNumeros {
    
    public static void main(String[] args) {
        
        testeSortePorNumeros sorte = new testeSortePorNumeros();
        
        ArrayList<Integer> entrada20 = new ArrayList<Integer>();
        entrada20.add(1);
        entrada20.add(2);
        entrada20.add(3);
        entrada20.add(4);
        entrada20.add(6);
        entrada20.add(7);
        entrada20.add(8);
        entrada20.add(12);
        entrada20.add(10);
        entrada20.add(13);
        entrada20.add(14);
        entrada20.add(15);
        entrada20.add(16);
        entrada20.add(17);
        entrada20.add(18);
        entrada20.add(19);
        entrada20.add(20);
        entrada20.add(21);
        entrada20.add(22);
        entrada20.add(25);
        
        ArrayList<Integer> entrada22 = new ArrayList<Integer>();
        entrada22.add(1);
        entrada22.add(2);
        entrada22.add(3);
        entrada22.add(4);
        entrada22.add(5);
        entrada22.add(6);
        entrada22.add(8);
        entrada22.add(9);
        entrada22.add(12);
        entrada22.add(13);
        entrada22.add(14);
        entrada22.add(15);
        entrada22.add(16);
        entrada22.add(17);
        entrada22.add(18);
        entrada22.add(19);
        entrada22.add(20);
        entrada22.add(21);
        entrada22.add(22);
        entrada22.add(23);
        entrada22.add(24);
        entrada22.add(25);
        
        
        
        System.out.println("Combinação de 20 números");
        for (int i = 0; i < 4; i++) {
            Integer[] teste1 = sorte.geraCartela20Numeros(entrada20);
            for (int j = 0; j < 15; j++) {
                if(teste1[j] < 10){
                    System.out.print("[ 0"+teste1[j]+" ] ");
                }else{
                    System.out.print("[ "+teste1[j]+" ] ");
                }  
            }
            System.out.println("");
        }
        
        System.out.println("Combinação de 22 números");
        for (int i = 0; i < 4; i++) {
            Integer[] teste2 = sorte.geraCartela22Numeros(entrada22);
            for (int j = 0; j < 15; j++) {
                if(teste2[j] < 10 ){
                    System.out.print("[ 0"+teste2[j]+" ] ");
                }else{
                    System.out.print("[ "+teste2[j]+" ] ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
       
        
    }
}
