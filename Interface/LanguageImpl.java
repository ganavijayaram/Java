package Interface;

public class LanguageImpl {
    public static void main(String args[]) {
        Language java = new Java();
        Language kannada = new Kannada();
        java.getVersion();
        kannada.getVersion();

    }
}
