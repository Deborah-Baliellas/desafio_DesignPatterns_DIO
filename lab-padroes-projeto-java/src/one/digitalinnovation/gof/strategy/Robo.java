package one.digitalinnovation.gof.strategy;

public class Robo {
    private Comportamento strategyComportamento;

    public void setStrategyComportamento(Comportamento strategyComportamento) {
        this.strategyComportamento = strategyComportamento;
    }
        
    public void mover() {
        strategyComportamento.mover();
    }
    
}
