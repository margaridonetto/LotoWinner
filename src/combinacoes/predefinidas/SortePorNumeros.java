package combinacoes.predefinidas;

import java.util.ArrayList;
import regras.negocio.Utilitarios;

public class SortePorNumeros {
     public SortePorNumeros() {
        
    }
    
<<<<<<< HEAD
    public  Integer[] geraCartela20Numeros(ArrayList<Integer> numerosSelecionados){
        Integer[] cartelaPronta = new Integer[15];
        Integer[] numerosAleatorios = Utilitarios.gerarRandom(0, 20, 15); //Gera 15  numeros rand de 0 a 19
        
        for (int i = 0; i < 15; i++) {
            cartelaPronta[i] = numerosSelecionados.get(numerosAleatorios[i]); // Pega os números rand sorteando nos números do usuario  
        }
=======
    public  int[] gera01Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(0);
        cartelaPronta[1] = numerosSelecionados.get(1);
        cartelaPronta[2] = numerosSelecionados.get(2);
        cartelaPronta[3] = numerosSelecionados.get(3);
        cartelaPronta[4] = numerosSelecionados.get(5);
        cartelaPronta[5] = numerosSelecionados.get(6);
        cartelaPronta[6] = numerosSelecionados.get(7);
        cartelaPronta[7] = numerosSelecionados.get(8);
        cartelaPronta[8] = numerosSelecionados.get(9);
        cartelaPronta[9] = numerosSelecionados.get(10);
        cartelaPronta[10] = numerosSelecionados.get(11);
        cartelaPronta[11] = numerosSelecionados.get(12);
        cartelaPronta[12] = numerosSelecionados.get(14);
        cartelaPronta[13] = numerosSelecionados.get(15);
        cartelaPronta[14] = numerosSelecionados.get(19);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera02Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(0);
        cartelaPronta[1] = numerosSelecionados.get(1);
        cartelaPronta[2] = numerosSelecionados.get(3);
        cartelaPronta[3] = numerosSelecionados.get(4);
        cartelaPronta[4] = numerosSelecionados.get(5);
        cartelaPronta[5] = numerosSelecionados.get(7);
        cartelaPronta[6] = numerosSelecionados.get(9);
        cartelaPronta[7] = numerosSelecionados.get(10);
        cartelaPronta[8] = numerosSelecionados.get(11);
        cartelaPronta[9] = numerosSelecionados.get(13);
        cartelaPronta[10] = numerosSelecionados.get(14);
        cartelaPronta[11] = numerosSelecionados.get(15);
        cartelaPronta[12] = numerosSelecionados.get(16);
        cartelaPronta[13] = numerosSelecionados.get(17);
        cartelaPronta[14] = numerosSelecionados.get(18);
>>>>>>> b77eeab93c403cbfdd6889f99062874099d95ace
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
<<<<<<< HEAD
    public  Integer[] geraCartela22Numeros(ArrayList<Integer> numerosSelecionados){
        Integer[] cartelaPronta = new Integer[15];
        Integer[] numerosAleatorios = Utilitarios.gerarRandom(0, 22, 15);
        
        for (int i = 0; i < 15; i++) {
            cartelaPronta[i] = numerosSelecionados.get(numerosAleatorios[i]);     
        }
        
        return Utilitarios.ordenarCartela(cartelaPronta);
    }
}
=======
    public  int[] gera03Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(0);
        cartelaPronta[1] = numerosSelecionados.get(2);
        cartelaPronta[2] = numerosSelecionados.get(3);
        cartelaPronta[3] = numerosSelecionados.get(4);
        cartelaPronta[4] = numerosSelecionados.get(5);
        cartelaPronta[5] = numerosSelecionados.get(6);
        cartelaPronta[6] = numerosSelecionados.get(8);
        cartelaPronta[7] = numerosSelecionados.get(9);
        cartelaPronta[8] = numerosSelecionados.get(11);
        cartelaPronta[9] = numerosSelecionados.get(12);
        cartelaPronta[10] = numerosSelecionados.get(13);
        cartelaPronta[11] = numerosSelecionados.get(16);
        cartelaPronta[12] = numerosSelecionados.get(17);
        cartelaPronta[13] = numerosSelecionados.get(18);
        cartelaPronta[14] = numerosSelecionados.get(19);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera04Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(1);
        cartelaPronta[1] = numerosSelecionados.get(2);
        cartelaPronta[2] = numerosSelecionados.get(4);
        cartelaPronta[3] = numerosSelecionados.get(6);
        cartelaPronta[4] = numerosSelecionados.get(7);
        cartelaPronta[5] = numerosSelecionados.get(8);
        cartelaPronta[6] = numerosSelecionados.get(10);
        cartelaPronta[7] = numerosSelecionados.get(12);
        cartelaPronta[8] = numerosSelecionados.get(13);
        cartelaPronta[9] = numerosSelecionados.get(14);
        cartelaPronta[10] = numerosSelecionados.get(15);
        cartelaPronta[11] = numerosSelecionados.get(16);
        cartelaPronta[12] = numerosSelecionados.get(17);
        cartelaPronta[13] = numerosSelecionados.get(18);
        cartelaPronta[14] = numerosSelecionados.get(19);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    ///////////////////////////////////////////////
    
    public  int[] gera01Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(0);
        cartelaPronta[1] = numerosSelecionados.get(1);
        cartelaPronta[2] = numerosSelecionados.get(3);
        cartelaPronta[3] = numerosSelecionados.get(5);
        cartelaPronta[4] = numerosSelecionados.get(7);
        cartelaPronta[5] = numerosSelecionados.get(10);
        cartelaPronta[6] = numerosSelecionados.get(11);
        cartelaPronta[7] = numerosSelecionados.get(12);
        cartelaPronta[8] = numerosSelecionados.get(13);
        cartelaPronta[9] = numerosSelecionados.get(14);
        cartelaPronta[10] = numerosSelecionados.get(15);
        cartelaPronta[11] = numerosSelecionados.get(16);
        cartelaPronta[12] = numerosSelecionados.get(17);
        cartelaPronta[13] = numerosSelecionados.get(18);
        cartelaPronta[14] = numerosSelecionados.get(19);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera02Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(2);
        cartelaPronta[1] = numerosSelecionados.get(4);
        cartelaPronta[2] = numerosSelecionados.get(6);
        cartelaPronta[3] = numerosSelecionados.get(8);
        cartelaPronta[4] = numerosSelecionados.get(9);
        cartelaPronta[5] = numerosSelecionados.get(10);
        cartelaPronta[6] = numerosSelecionados.get(12);
        cartelaPronta[7] = numerosSelecionados.get(13);
        cartelaPronta[8] = numerosSelecionados.get(14);
        cartelaPronta[9] = numerosSelecionados.get(15);
        cartelaPronta[10] = numerosSelecionados.get(16);
        cartelaPronta[11] = numerosSelecionados.get(17);
        cartelaPronta[12] = numerosSelecionados.get(18);
        cartelaPronta[13] = numerosSelecionados.get(19);
        cartelaPronta[14] = numerosSelecionados.get(20);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera03Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(0);
        cartelaPronta[1] = numerosSelecionados.get(1);
        cartelaPronta[2] = numerosSelecionados.get(3);
        cartelaPronta[3] = numerosSelecionados.get(5);
        cartelaPronta[4] = numerosSelecionados.get(7);
        cartelaPronta[5] = numerosSelecionados.get(11);
        cartelaPronta[6] = numerosSelecionados.get(13);
        cartelaPronta[7] = numerosSelecionados.get(14);
        cartelaPronta[8] = numerosSelecionados.get(15);
        cartelaPronta[9] = numerosSelecionados.get(16);
        cartelaPronta[10] = numerosSelecionados.get(17);
        cartelaPronta[11] = numerosSelecionados.get(18);
        cartelaPronta[12] = numerosSelecionados.get(19);
        cartelaPronta[13] = numerosSelecionados.get(20);
        cartelaPronta[14] = numerosSelecionados.get(21);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera04Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
 
        cartelaPronta[0] = numerosSelecionados.get(2);
        cartelaPronta[1] = numerosSelecionados.get(4);
        cartelaPronta[2] = numerosSelecionados.get(6);
        cartelaPronta[3] = numerosSelecionados.get(8);
        cartelaPronta[4] = numerosSelecionados.get(9);
        cartelaPronta[5] = numerosSelecionados.get(12);
        cartelaPronta[6] = numerosSelecionados.get(13);
        cartelaPronta[7] = numerosSelecionados.get(14);
        cartelaPronta[8] = numerosSelecionados.get(15);
        cartelaPronta[9] = numerosSelecionados.get(16);
        cartelaPronta[10] = numerosSelecionados.get(17);
        cartelaPronta[11] = numerosSelecionados.get(18);
        cartelaPronta[12] = numerosSelecionados.get(19);
        cartelaPronta[13] = numerosSelecionados.get(20);
        cartelaPronta[14] = numerosSelecionados.get(21);
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    //Júnior
}

>>>>>>> b77eeab93c403cbfdd6889f99062874099d95ace
