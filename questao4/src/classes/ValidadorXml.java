package classes;

import java.time.LocalDate;

public class ValidadorXml extends Cadeia {

    @Override
    public void processarRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        if (podeContinuar(nomeArquivo, data, calculoImpost, notaNumero, dacte)) {
            System.out.println("Erro: Arquivo nao e xml");
            return;
        }

        proximaCadeia.processarRequisicao(nomeArquivo, data, calculoImpost, notaNumero, dacte);
    }

    @Override
    public boolean podeContinuar(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        return !nomeArquivo.contains(".xml");
    }

    @Override
    public void retrocederRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        
    }

    
}
