package preferencias;

public class Somatoria {

    public static int somatoria(int combinacao[]) {
        int soma = 0;
        for (int numeros = 0; numeros < combinacao.length; numeros++) {
            soma += combinacao[numeros];
        }
        return soma;
    }

    public static int[] aplicarPreferencia(int combinacao[], int min, int max, int priorizar[], int excluir[]) {
        int[] combinacaoPronta = new int[15];
        int soma = Somatoria.somatoria(combinacao);
        int grupoParaMudar;

        while (soma < min || soma > max) {
            if (soma < min) {
                grupoParaMudar = ParesImpares.gerarNumero(1, 3);
                if(grupoParaMudar == 1){
                    for(int cont = 0; cont < 5; cont++){
                        
                    }
                }else if (grupoParaMudar == 2){
                    for(int cont = 5; cont < 10; cont++){
                        
                    }
                }else{
                    for(int cont = 10; cont < 15; cont++){
                        
                    }
                }
            } else if (soma > max) {
                grupoParaMudar = ParesImpares.gerarNumero(1, 3);
                if(grupoParaMudar == 1){
                   for(int cont = 4; cont >= 0; cont--){
                        
                   }
                }else if (grupoParaMudar == 2){
                   for(int cont = 9; cont >= 5; cont--){
                        
                   }
                }else{
                   for(int cont = 14; cont >= 10; cont--){
                        
                   }
                }
            } else {
                combinacaoPronta = combinacao;
            }
        }
        return combinacaoPronta;
    }
}
