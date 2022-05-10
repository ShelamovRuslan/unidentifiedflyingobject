public class TurbojetEngine extends Engine {
    public TurbojetEngine(String model) {
        this.model = model;
        setDefective();
        while (test("Проверка двигателя самолета выявила дефекты." ,"Engine system ... OK." , this.defective)){
            this.defective = repair();
        }
    }
}
