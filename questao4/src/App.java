import java.time.LocalDate;

import classes.ValidarXml;

public class App {
    public static void main(String[] args) throws Exception {
        ValidarXml validarXml = new ValidarXml();
        
        String nomeArquivo = "9032.xml";
        LocalDate date = LocalDate.now();
        Double calculoImpost = 20.0;
        String notaNumero = "93029310";
        String dacte = "3910293019231";

        validarXml.validar(nomeArquivo, date, calculoImpost, notaNumero, dacte);

        String newArquivo = "9032";
        validarXml.validar(newArquivo, date, calculoImpost, notaNumero, dacte);

        LocalDate newDate = date.minusYears(2);
        validarXml.validar(nomeArquivo, newDate, calculoImpost, notaNumero, dacte);

        Double newcalculoImpost = -1.0;
        validarXml.validar(nomeArquivo, date, newcalculoImpost, notaNumero, dacte);

        String newnotaNumero = "02340";
        validarXml.validar(nomeArquivo, date, calculoImpost, newnotaNumero, dacte);

        String newDacte = "0";
        validarXml.validar(nomeArquivo, date, calculoImpost, notaNumero, newDacte);
    }
}
