import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        int n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota: ");
        n1 = console.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = console.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = console.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4 = console.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média entre as quatro notas bimestrais é de: " + media);
    }
}
