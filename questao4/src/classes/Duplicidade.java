package classes;

import java.time.LocalDate;

public class Duplicidade extends Cadeia {

    @Override
    public void processarRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        if (podeContinuar(nomeArquivo, data, calculoImpost, notaNumero, dacte)) {
            System.out.println("Erro: Duplicidade de nota");
            return;
        }

        proximaCadeia.processarRequisicao(nomeArquivo, data, calculoImpost, notaNumero, dacte);
    }

    @Override
    public boolean podeContinuar(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        return notaNumero == "02340";
    }

    @Override
    public void retrocederRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        System.out.println("Retirado do banco a nota "+notaNumero);
    }
   
    
}
