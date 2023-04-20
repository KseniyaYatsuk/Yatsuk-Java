package tasks;

import tasks.donut.ChocolateDonut;
import tasks.donut.Donut;
import tasks.donut.DonutType;
import tasks.donut.StrawberryDonut;

public class Factory {

    public Donut getDonut(DonutType donutType) {
        Donut donut = null;
        switch (donutType) {
            case STRAWBERRY:
                donut = new StrawberryDonut();
                break;
            case CHOCOLATE:
                donut = new ChocolateDonut();
                break;
        }
        return donut;
    }
}
