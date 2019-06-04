package Entities;

public class Decorator implements Cronometro {
    private Cronometro cronometro;

    public Decorator(Cronometro cronometro) {
        this.cronometro = cronometro;
    }

    public void executarTarefa() {
        long antes = System.currentTimeMillis();
        cronometro.executarTarefa();
        long depois = System.currentTimeMillis();
        System.out.println((depois - antes) + " ms");
    }
}