public class ImpressaoTriangulos {
    public static void main(String[] args) {

        // linhas
        for (int i = 1; i <= 10; i ++ ){
            System.out.println();
            for (int j = 1; j <= i; j++){
                System.out.print(' ');
                System.out.print('*');

            }
        }

        System.out.println();

        for (int i = 10; i >= 2; i -- ){
            System.out.println();
            for (int j = 1; j <= i; j++){
                System.out.print(' ');
                System.out.print('*');

            }
        }


        System.out.println();

        for (int i = 0; i < 10; i++) {
            // Imprimir espaços
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 0; k < 10 - i; k++) {
                System.out.print(" ");
                System.out.print("*");
            }

            // Mover para a próxima linha
            System.out.println();
        }
    }
}
