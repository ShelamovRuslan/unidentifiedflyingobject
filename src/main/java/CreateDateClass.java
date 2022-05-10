public interface CreateDateClass {

    default DateClass createDateClassCargo() {
        return new DateClass(
                250_000,
                84,
                285_000,
                405_000,
                "ТР ДД Д-18Т",
                6
        );

    }


     // Планирую переписать интерфейс с использованием данных из базы.

}
