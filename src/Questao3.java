public class Questao3 {
    public static void main(String[] args) {


        System.out.println("a)");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("b)");
        for (int i = 2; i <= 128; i *= 2) {
            System.out.print(i + " ");
        }

        int cont = 1;
        int log = 3;

        System.out.println("\n");
        System.out.println("c)");
        System.out.print("0 ");

        for (int i = 1; i <= 7; i++) {
            System.out.print(cont + " ");
            cont += log;
            log += 2;
        }

        System.out.println("\n");
        System.out.println("d)");
        int count = 12;
        for (int i = 4;count<=100; count = count+8) {
            if(count <= 12) {
                System.out.print(i + " ");
                System.out.print(i + count + " ");
            }
            System.out.print(count + " ");
        }

        System.out.println("\ne)");
        int num1 = 1, num2 = 0;

        System.out.print(num1 + " ");

        for (int i = 0; i < 6; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;

            System.out.print(num1 + " ");
        }


        //O próximo número é 200 pois começa com D
        System.out.println("\n");
        System.out.println("f)");
        System.out.println("2 10 12 16 17 18 19 200");
    }
}
