
//aula
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);

        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if(dataPrimeiraParcela.isEqual(LocalDate.now())){
            System.out.println("Hoje e o dia do vencimento");
        }else{
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcelo: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + formato);

        ZonedDateTime dataConclucaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusao compra: " + dataConclucaoCompra);
        ZonedDateTime dataCompraNy = dataConclucaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusao compra NY: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim = LocalTime.of(17,30);

        Duration duration = Duration.between(inicio,fim);
        System.out.println("Duracao do expediente: " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");

        Period periodo = Period.between(dataCompra,dataPagamento);

        System.out.println("Diferenca de " + periodo.getMonths() + " meses " + periodo.getDays() + " e dias.");

    }
}
