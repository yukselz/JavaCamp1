public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println(" Mükemmel Geçtiniz ");
                break;
            case'B':
                System.out.println(" İyi Geçtiniz ");
                break;
            case'C':
                System.out.println(" Geçtiniz ");
                break;
            case'D':
                System.out.println(" İdare Eder ");
                break;
            case'F':
                System.out.println(" Sonuç Başarısız ");
                break;
                default:
                    System.out.println(" Geçersiz Not Girdiniz !");


        }

    }
}