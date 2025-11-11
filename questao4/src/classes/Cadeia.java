package classes;

import java.time.LocalDate;


abstract class Cadeia {

    protected Cadeia proximaCadeia;
    protected Cadeia antigaCadeia;

    public void setAntigaCadeia(Cadeia antigaCadeia) {
        this.antigaCadeia = antigaCadeia;
    }


    public void setProximaCadeia(Cadeia proximaCadeia) {
        this.proximaCadeia = proximaCadeia;
    }


    public abstract void processarRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero, String dacte);

    public abstract boolean podeContinuar(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero, String dacte);

    public abstract void retrocederRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero, String dacte);

    public boolean timeout(int timeAtual, int timeOut) {
        return timeAtual > timeOut;
    }

}