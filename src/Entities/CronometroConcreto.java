package Entities;

public class CronometroConcreto implements Cronometro {
    public void executarTarefa() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}