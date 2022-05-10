public class CargoBody extends Body{

    public CargoBody(double size, int weight) {
        this.size = size;
        this.weight = weight;
        setDefective();
        while (test("Проверка корпуса самолета выявила дефекты." ,"Наши механики не обнаружили нарушения герметизации корпуса.", this.defective)){
            this.defective = repair();
        }
    }
}
