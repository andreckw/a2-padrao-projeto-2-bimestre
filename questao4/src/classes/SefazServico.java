package classes;

import java.time.LocalDate;

public class SefazServico extends Cadeia {

    @Override
    public void processarRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        if (podeContinuar(nomeArquivo, data, calculoImpost, notaNumero, dacte)) {
            System.out.println("Erro: Arquivo nao e autorizado");
            antigaCadeia.retrocederRequisicao(nomeArquivo, data, calculoImpost, notaNumero, dacte);
            return;
        }

        System.out.println("Nota funcionou");
    }

    @Override
    public boolean podeContinuar(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        return dacte == "0";
    }

    @Override
    public void retrocederRequisicao(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero,
            String dacte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retrocederRequisicao'");
    }

}
