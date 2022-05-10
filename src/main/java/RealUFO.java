public class RealUFO implements UFO {

    boolean detectedUFO;

    @Override
    public void create () {
        if (this.detectedUFO == true) {
            System.out.println(""" 
                    СЕНСАЦИЯ!
                    Двадцатипятилетний работник завода снял видео полета НЛО!
                    Начальство обязательно выпишет ему премию!
                    И это не смотря на то что у него и так зарплата 1000$.
                    За пять лет что он у нас проработал такое произошло впервые.
                    """);
        } else {
            System.out.println("Сегодня был очень жаркий солнечный день, один из работников сфотографировал отличный закат.");

        }

    }
    @Override
    public void fly () {
        isDetectedUFO(true);
        System.out.println("Над аэропортом пролетело НЛО");
    }

    @Override
    public void report () {
        System.out.println("Информация засекречена...");
    }

    public void isDetectedUFO (boolean detectedUFO) {
        this.detectedUFO = detectedUFO;
    }
}
