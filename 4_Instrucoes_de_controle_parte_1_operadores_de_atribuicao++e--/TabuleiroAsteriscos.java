public class TabuleiroAsteriscos {
    public static void main(String[] args) {
        int linha = 8;
        int contadorLinha = 1;
        int coluna = 8;
        int contadorColuna = 1;
        
        while(contadorLinha <= linha){
            if(contadorLinha % 2 == 0 ){
                System.out.print(" ");
            }
            while (contadorColuna <= coluna) {
                System.out.print("* ");
                ++contadorColuna;
            }
            ++contadorLinha;
            contadorColuna = 1;
            System.out.println();
        }
    }
}
