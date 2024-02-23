import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();

        String[] arr = new String[a];

        for(int i =0; i< a; i++){
            int valor = sc.nextInt();

            if(valor > 8000){
                arr[i] = "Mais de 8000!";
            }else{
                arr[i] ="Inseto!";
            }
        }

        for(String p : arr) {
            System.out.println(p);
        }

        sc.close();
    }
}
