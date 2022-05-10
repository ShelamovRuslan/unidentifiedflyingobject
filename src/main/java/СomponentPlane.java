public abstract class СomponentPlane implements TestComponent {

    protected boolean defective;

    public void setDefective() {
        this.defective =  ((int) (Math.random() * (3 - 1)) + 1) == 2? true : false;
    }


}
