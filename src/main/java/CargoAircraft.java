import java.util.Date;

import static java.lang.String.format;

public class CargoAircraft extends Plane{
    @Override
    public void create() {
        this.body = new CargoBody();
        this.gasTank = new GasTank(405_000);
        this.engine = new Engine[] {new TurbojetEngine(), new TurbojetEngine(), new TurbojetEngine(), new TurbojetEngine(), new TurbojetEngine(), new TurbojetEngine()} ;
        this.cargoBay = new CargoBay(250_000);
        this.pilotCabine = new CargoCabine();
    }

    @Override
    public void fly() {
        if (isDisease())
            System.out.println("Пилот болен, рейс отменен.");
        else if (getAge())
            System.out.println("Ваш пилот вышел на пенсию, найдите нового!");
        else
            System.out.println("Груз доставлен");
    }

    private boolean isDisease (){
        if (pilotCabine.pilotFirst.disease && pilotCabine.pilotSecond.disease){
            return true;} else {return false;}
    }

    private boolean getAge (){
        if (pilotCabine.pilotFirst.age < 50 && pilotCabine.pilotSecond.age < 50){
            return false;} else {return true;}
    }
    @Override
    public void report () {
        Date date = new Date();
        System.out.println (String.format ("""
                Доклад № %s.
                Грузовой самолет ожидает в ангаре.
                Длина %s метра.
                Вес самолета %d кг.
                Количество двигателей %d.
                Модель двигателя %s.
                Комерческий груз %d тонн.
                Вместимость баков %d. 
                """, date ,
                this.body.size,
                this.body.weight,
                this.engine.length,
                this.engine[0].model,
                this.cargoBay.weight/1000,
                this.gasTank.fuel));
        if (isDisease())
            System.out.println("Пилот болен, рейс не будет совершен.");
        else if (getAge())
            System.out.println("Ваш пилот вышел на пенсию, найдите нового!");
    }
}
