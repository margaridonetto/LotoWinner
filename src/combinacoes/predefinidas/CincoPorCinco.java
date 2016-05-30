package combinacoes.predefinidas;

public class CincoPorCinco {
    private int[] a = new int[5];
    private int[] b = new int[5];
    private int[] c = new int[5];
    private int[] d = new int[5];
    
    public CincoPorCinco(){}
    
    public int[] montarFAB(int[] fixas){
        int[] fab = new int[15];
        for(int quant = 0; quant < fixas.length; quant++){
            fab[fab.length] = fixas[quant];
        }
        for(int quant = 0; quant < fixas.length; quant++){
            fab[fab.length] = a[quant];
        }
        for(int quant = 0; quant < fixas.length; quant++){
            fab[fab.length] = b[quant];
        }
        return fab;
    }    
    
}
