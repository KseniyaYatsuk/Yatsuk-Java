package tasks;

import tasks.donut.Donut;

public class Singleton {

    private Donut donut;

    private Singleton() {
    }

    public Donut getDonut() {
        if (donut == null) {
            return donut = new Donut();
        }
        return donut;
    }
}
