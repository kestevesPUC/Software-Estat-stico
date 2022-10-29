//EX 1
/**
 * a) Em um minuto cheguem 2 chamadas?                                 
 *                                                                             Formulas:
 *                                                                                λ = 300/60 -> 5 chamadas p/ minuto (taxa)
 *                                                                                
 *                                                                                P(X = x) =  e^-λ(λ^x) /x!
 *                                                                                P(X = 2) =  e^-5(5^2) /1! = 0,0842
 *                                                                                P(X = 1) =  e^-0,1(0,1^1) /1! = 0,0842
 */

 //EX 2
 /**
  * O tempo entre as chamadas para uma loja de suprimentos de encanamentos é distribuído exponencialmente,
  * com um tempo médio de 15 minutos entre as chamadas.
  *
  * (a) Qual é a probabilidade de não haver chamadas dentro do intervalo de 30 minutos?
  * (b) Qual é a probabilidade de que no mínimo uma chamada chegue dentro do intervalo de 10 minutos?
  */
public class Poisson {
    private double lambda; // <- λ
    private int x; // <- X
    private double ocorrencias; //EX em uma loja chega 300 ligações
    private double tempo; //Tempo em que chega as 300 ligações

    
    public double calculateEquacao() {
        this.calculateLambda();
        return (double)Math.pow(Math.E,-this.lambda)*(Math.pow(this.lambda,this.x)) / this.fatorialDeX();
    }

    public double calculateLambda() {
        return this.lambda = (double)this.ocorrencias/this.tempo;
    }

    public int fatorialDeX() {
        int fatorial = this.x;
        for(int i = fatorial; i > 1; i--){
            fatorial *= i-1;
        }
        return fatorial;
    }
    
    //Get and Set

    public void setX(int x) {
        this.x = x;
    }
    
    public double getX() {
        return this.x;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getLambda() {
        return this.lambda;
    }
    public double getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(double ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

}
