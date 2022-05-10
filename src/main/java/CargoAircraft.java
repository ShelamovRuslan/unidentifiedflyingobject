import java.util.Date;

public class CargoAircraft extends Plane implements СreateDateClass {
    @Override
    public void create() {
        DateClass date = createDateClassCargo();
        this.body = new CargoBody(date.cargoBodySize(), date.cargoBayWeight());
        this.gasTank = new GasTank(date.cargoFuel());
        this.engine = new Engine[date.TurbojetEngineQuantity()];
        for (byte i = 0; i < date.TurbojetEngineQuantity(); i++) {
            this.engine[i] = new TurbojetEngine(date.TurbojetEngine());
        }
        this.cargoBay = new CargoBay(date.cargoBayWeight());
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


     // Планирую переписать реализацию метода .fly().


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
            System.out.println("Пилот выглядит уставшим.");
        else if (getAge())
            System.out.println("Подздравляем пилота с днем рождения!");
    }
}
