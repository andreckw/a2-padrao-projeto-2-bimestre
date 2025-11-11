package classes;

import java.time.LocalDate;

public class CertificadoDigital extends Cadeia {

    @Override
    public void processarRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        if (podeContinuar(nomeArquivo, data, calculoImpost, notaNumero, dacte)) {
            System.out.println("Erro: Nota expirou");
            return;
        }

        proximaCadeia.processarRequisicao(nomeArquivo, data, calculoImpost, notaNumero, dacte);
    }

    @Override
    public boolean podeContinuar(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero, String dacte) {
        LocalDate dataAntiga = LocalDate.now().minusYears(1);
        return data.isBefore(dataAntiga);
    }

    @Override
    public void retrocederRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        
    }

    


    
}
