package combinacoes.predefinidas.testes;

import java.util.ArrayList;
import regras.negocio.Utilitarios;

public class testeSortePorNumeros {
     public testeSortePorNumeros() {
        
    }
    
<<<<<<< HEAD
    public  Integer[] geraCartela20Numeros(ArrayList<Integer> numerosSelecionados){
        Integer[] cartelaPronta = new Integer[15];
        Integer[] numerosAleatorios = Utilitarios.gerarRandom(0, 20, 15); //Gera 15  numeros rand de 0 a 19
=======
    public  int[] geraCartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] numerosAleatorios = Utilitarios.gerarRandom(0, 20, 15); //Gera 15  numeros rand de 0 a 19
>>>>>>> b77eeab93c403cbfdd6889f99062874099d95ace
        
        for (int i = 0; i < 15; i++) {
            cartelaPronta[i] = numerosSelecionados.get(numerosAleatorios[i]); // Pega os números rand sorteando nos números do usuario  
        }
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
<<<<<<< HEAD
    public  Integer[] geraCartela22Numeros(ArrayList<Integer> numerosSelecionados){
        Integer[] cartelaPronta = new Integer[15];
        Integer[] numerosAleatorios = Utilitarios.gerarRandom(0, 22, 15);
=======
    public  int[] geraCartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] numerosAleatorios = Utilitarios.gerarRandom(0, 22, 15);
>>>>>>> b77eeab93c403cbfdd6889f99062874099d95ace
        
        for (int i = 0; i < 15; i++) {
            cartelaPronta[i] = numerosSelecionados.get(numerosAleatorios[i]);     
        }
        
        return Utilitarios.ordenarCartela(cartelaPronta);
    }
}
