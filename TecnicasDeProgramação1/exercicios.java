
//import java.util.Scanner;

/*
class Exercio1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextInt();
        float n2 = scanner.nextInt();
        System.out.println(n1 + n2);
    }

}
*/

/*
class Exercicio2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float celsius = scanner.nextFloat();
        float heit = (9 * celsius + 160)/5;
        System.out.println(heit);
    }
}
*/

/*
class Exercicio3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float heit = scanner.nextFloat();
        float cel = (heit - 32) * 5/9;
        System.out.println(cel);
    }
}
*/

/*
class Exercicio4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextFloat();
        double altura = scanner.nextFloat();
        double vol = 3.14159d * altura * Math.pow(raio, 2) ;
        System.out.println(vol); 
    }
}
*/

/*
class Exercicio5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        System.out.println(dia + (mes * 30) + ((2025 - ano) * 365));
    }
}
*/

/*
class Exercicio6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextFloat();
        double circu = 3.14159d * 2 * r;   
        System.out.println((circu));     
    }
}
*/

/*
class Exercicio7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float val = scanner.nextFloat();
        float taxa = scanner.nextFloat();
        int tempo = scanner.nextInt();
        float pres = val + (val * (taxa/100) * tempo);
        System.out.println(pres);     
    }
}
*/

/*
class Exercicio8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float qtDolar = scanner.nextFloat();
        float valCotacao = scanner.nextFloat();
        float valReal = qtDolar * valCotacao;
        System.out.println(valReal);     
    }
}
*/

/*
class Exercicio9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a;
        System.out.println(a = b);
        System.out.println(c);
    }
}
*/

/*
class Exercicio10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        System.out.println(num * num);     
    }
}
*/

/*
class Exercicio11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        System.out.println(num % 6 );     
    }
}
*/

// SEGUNDA LISTA DE EXERCICIOS ------------------------------------------------------

/*
class Exercicio1l2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int maior, menor, meio;
        if(num1  > num2 && num1 > num3){
            maior = num1;
            if(num2 > num3){
                meio = num2;
                menor = num3;
            }else{
                meio = num3;
                menor = num2;
            }
        }else if(num2 > num3 && num2 > num1){
            maior = num2;
            if(num1 > num3){
                meio = num1;
                menor = num3;
            }
            else{
                meio = num3;
                menor = num1;
            }
            
        }else{
            maior = num3;
            if(num1 > num2){
                meio = num1;
                menor = num2;
            }else{
                meio = num2;
                menor = num1;
            }
        }

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
    }
}
*/

/*
class Exercicio2l2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nt1 = scanner.nextFloat();
        float nt2 = scanner.nextFloat();
        float nt3 = scanner.nextFloat();
        float nt4 = scanner.nextFloat();
        float md = nt1 + nt2 + nt3 + nt4 / 4;
        if(md >= 7){
            System.out.println("aluno aprovado" + " " + md);
        }else{
            System.out.println("aluno reprovado" + " " + md);
        }
    }
}
*/

/*
class Exercicio3l2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(n1);
        }else if(n2 > n3){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        }
    }
}
*/

