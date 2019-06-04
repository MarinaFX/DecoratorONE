package Entities;

import java.time.LocalTime;

public class LogPar extends Decorator {

    public LogPar(Cronometro cronometro) {
        super(cronometro);
    }

    public void logNumeroPar(){
        LocalTime tempo = LocalTime.now();
        long antes = System.currentTimeMillis();
        int minuto = (int) (antes/60000);
        for (int i = 0; i < 10; i++) {
            super.executarTarefa();
            if(!(antes % 2 == 0)) {
                tempo = LocalTime.now();
                System.out.println("“Execução interrompida em minuto par: <hora atual>: " + tempo);
            }
        }
    }
}
