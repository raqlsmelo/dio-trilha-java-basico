package one.digitalinnovation.gof.Strategy;

public class Robo {
    
    private Comportamento comportamento;

    public void setcomportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }

}
