package oo.faculdade.prova;

public class Classes {

    public static void main(String[] args) {

        Classes classes = new Classes();

        try {
            classes.x();
            System.out.println("1");
        } catch (Exception e) {
            try {
                classes.y();
                System.out.println("2");
            } catch (Exception b) {
                System.out.println("3");
            }
        }
    }

    public void x() {
        throw new Error();
    }

    public void y() {
        throw new RuntimeException();
    }

}
