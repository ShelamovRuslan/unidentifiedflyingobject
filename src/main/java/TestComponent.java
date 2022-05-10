public interface TestComponent {

    default boolean test (String massage, String massage2, boolean defective) {
        if (defective) {
            System.out.println(massage);
            return true;
        }
        else {
            System.out.println(massage2);
            return false;
        }
    }

    default boolean repair () {

        if (((int) (Math.random() * (3 - 1)) + 1) == 2? true : false){
            System.out.println("Починка прошла успешно");
            return false;
        } else {
            System.out.println("Не удалось починить");
            return true;
        }

    }
}
