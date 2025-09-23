
/*class Exercicio1l3{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Printando vetor de forma literal" + nums);
        System.out.println("Agora vamos ver os itens do vetor");
        for(int i = 0; i < nums.length; i++){
            System.out.println("Item:" + nums[i]);
        }
    }
}
*/

/*
class Exercicio2l3{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {a[0] * 2, a[1] * 2, a[2] * 2, a[3] * 2, a[4] * 2, a[5] * 2, a[6] * 2, a[7] * 2, a[8] * 2, a[9] * 2, };
        System.out.println("Aqui as duas coleções");
        for(int i = 0; i<a.length; i++){
            System.out.println("Item:" + a[i] + " Da lista A");
        }
        for(int j = 0; j<b.length; j++){
            System.out.println("Item:" + a[j] + " Da lista B");
        }
    }
}
*/

//Exercicios 8
import java.util.Scanner;

public class Aluno{
    private String nome;
    private double notaTrimestre1;
    private double notaTrimestre2;
    private double notaTrimestre3;


    public Aluno(String nome, double notaTrimestre1, double notaTrimestre2, double notaTrimestre3){
        this.nome = nome;
        this.notaTrimestre1 = notaTrimestre1;
        this.notaTrimestre2 = notaTrimestre2;
        this.notaTrimestre3 = notaTrimestre3;
    }

    public double media(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro trimestre:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota do segundo trimestre:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre:");
        double nota3 = scan.nextDouble();
        System.out.println("Agora digite o nome do aluno:");
        String nome = scan.nextLine();
        Aluno al = new Aluno(nome, nota1, nota2, nota3);
        double calc = nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35 / 1;
        scan.close();
        return calc;
    }

    public void media(double nota){
        if(nota < 6){
            System.out.println("O aluno não alcançou a nota minima, faltou:" + (nota-10) + "para alcançar o esperado" );
        }
    }

}