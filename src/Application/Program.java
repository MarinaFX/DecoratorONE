package Application;

import Entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        System.out.println("Olá, programa de interceptadores de cronometros");
        Decorator logAntes = new LogPriori(new CronometroConcreto());
        Decorator logPar = new LogPar(new CronometroConcreto());

        System.out.println("Log antes de executar a tarefa ↓");
        ((LogPriori) logAntes).logAntes();
        System.out.println();
        System.out.println("Log de numeros pares: ↓");
        ((LogPar) logPar).logNumeroPar();

    }


}
