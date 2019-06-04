package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LogPriori extends Decorator {

    public LogPriori(Cronometro cronometro) {
        super(cronometro);
    }

    public void logAntes(){
        LocalDate data = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("<data/hora>: " + data + "/" + time);
        super.executarTarefa();
    }

}
