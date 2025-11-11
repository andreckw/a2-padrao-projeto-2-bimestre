package classes;

import java.time.LocalDate;

public class ValidarXml {
    
    private Cadeia primeiraValidacao;

    public ValidarXml() {

        Cadeia primeiraValidacao = new ValidadorXml();
        Cadeia segundaValidacao = new CertificadoDigital();
        Cadeia terceiraValidacao = new RegrasFiscais();
        Cadeia quartaValidacao = new Duplicidade();        
        Cadeia ultimaCadeia = new SefazServico();

        ultimaCadeia.antigaCadeia = quartaValidacao;
        quartaValidacao.proximaCadeia = ultimaCadeia;
        terceiraValidacao.proximaCadeia = quartaValidacao;
        segundaValidacao.proximaCadeia = terceiraValidacao;
        primeiraValidacao.proximaCadeia = segundaValidacao;
        
        this.primeiraValidacao = primeiraValidacao;
    }

    public void validar(String nomeArquivo, LocalDate data, Double calculoImpost, String notaNumero, String dacte) {
        primeiraValidacao.processarRequisicao(nomeArquivo, data, calculoImpost, notaNumero, dacte);
    }

}
