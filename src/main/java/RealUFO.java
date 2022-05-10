public class RealUFO implements UFO {

    boolean detectedUFO;

    @Override
    public void create() {
        if (this.detectedUFO == true) {
            System.out.println(""" 
                    СЕНСАЦИЯ!
                    Двадцатипятилетний Иван, работник завода, видел НЛО!
                    Начальство обязательно выпишет ему премию!
                    И это не смотря на то что у него и так зарплата 1000$.
                    За пять лет что он у нас проработал такое произошло впервые.
                    """);
        } else {
            System.out.println("Сегодня был продуктивный день, Иван сделал отличную фотографию для своего инстаграм.");
        }
    }

    @Override
    public void fly() {
        String massage = switch ((int) (Math.random() * (6 - 1)) + 1){
            case 1:
                isDetectedUFO(true);
                yield "Над аэропортом пролетело НЛО";
            case 2:
                yield "Солнечно и при этом по-прежнему не очень жарко.";
            case 3:
                yield "Возле аэропорта работники видели странного мужчину в черном плаще, шляпе и солнцезащитных очках.";
            case 4:
                yield "Общую радужную картину подпортил только небольшой ветер и гроза.";
            default:
                yield "Очень красивый закат.";
        };

        System.out.println(massage);
    }

    @Override
    public void report() {

        if (detectedUFO) {
            System.out.println("""
                     
                     Репортер:
                     - Может быть, это было облако?
                     Очивидец Иван:
                     - Да, я знаю, что оно выглядело так, но я думаю, что это был НЛО, замаскированный под облако.
                     
                    """);
        } else {
            System.out.println("Информация засекречена...");
        }
    }

    public void isDetectedUFO(boolean detectedUFO) {
        this.detectedUFO = detectedUFO;
    }
}
