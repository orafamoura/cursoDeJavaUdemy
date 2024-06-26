import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class revisaoJava {
    public static void main(String[] args) {
        /**
         javaDoc para documentacao
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor fahrenheit: ");

        //Const sempre LETRA MAIUSCULA
        final double FATOR = 32;
        final double FATOR2 = 5.0 / 9.0;

        double f = sc.nextDouble();
        double celsius = (f - FATOR) * FATOR2;

        System.out.println(celsius);
        sc.close();
    }

    public static void tiposString(String[] args) {
        System.out.println("Ola mundo".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!"); // Mesmo resultado que o concat
        System.out.println(s.startsWith("Boa")); // True
        System.out.println(s.startsWith("boa")); //False
        System.out.println(s.toLowerCase().startsWith("boa")); //True
        System.out.println(s.equals("boa tarde")); //False
        System.out.println(s.equalsIgnoreCase("boa tarde"));//True

        var nome = "rafa";
        var idade = 25;
        System.out.println("Nome: " + nome +  "\nidade: " + idade); //Muito grande
        System.out.printf("Nome: %s %d", nome, idade); //Melhor forma
        // %s para strings
        // %d para inteiros
        // %f para compostos
    }

    public static void conversoesTiposPrimitivos(String[] args){
        double a = 1; //implicit
        float b = (float) 12.34565789101112; //explicit (cast)

        int c = 130;
        byte d = (byte) c; //explicit retorna o valor -126

        double e = 1.999999;
        int f = (int) e; //explicit retorna o valor 1
    }

    public static void conversoesNumeroString(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());
    }

    public static void conversoesStringNumero(String[] args){
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro numero");

        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo numero");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("soma e: " + soma);
        System.out.println("media e: " + soma / 2);
    }

    public static void desafioConversao(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro salario");
        String valor1 = sc.next().replace(",", ".");

        System.out.println("Segundo salario");
        String valor2 = sc.next().replace(",", ".");

        System.out.println("Terceiro salario");
        String valor3 = sc.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A media salarial e: " + media);
        sc.close();
    }

    public static void desafioOperadores(String[] args){
        double a = (Math.pow(6 * (3+2), 2) / (3 * 2)) - (Math.pow(((double) ((1 - 5) * (2 - 7)) / 2), 2));
        double result = Math.pow(a, 3) / Math.pow(10, 3);

        System.out.println(result);
    }

    public static void unarios(String[] args){
        int a = 1;
        int b = 2;

        //aqui da verdadeiro por conta da precedencia ++ na frente do A, o resultado e contabilizado antes do valor ser atribuido
        System.out.println(++a == b--);
        //aqui ja da falso pois os valores ja estao atribuidos
        System.out.println(a == b);

    }

    public static void ternario(String[] args){
        double media = 5.6;

        //expressao = ? e os valores T ou F = :
        String resultado = media >= 7.0 ?
                "aprovado" : "reprovado";
    }

    public static void tipoStringEquals(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next(); // next tira os espacos em branco
        String s2 = sc.nextLine(); //nextLine nao tira os espacoes em branco

        //ex de entrada: s1 = 2 e s2 =     2 valor s2 com espaco no comeco

        System.out.println(s1 == s2.trim()); // da false, comparar string melhor usar o equals
        System.out.println(s1.equals(s2.trim())); // da true

        sc.close();
    }

    public static void desafioCalculadora(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro numero: ");
        double n2 = sc.nextDouble();
        System.out.println("Qual tipo de conta vai ser (+ - * / %): ");
        String aux = sc.next();

        double resultado = aux.equals("+") ? n1 + n2 : 0;
        resultado = aux.equals("-") ? n1 - n2 : resultado;
        resultado = aux.equals("*") ? n1 * n2: resultado;
        resultado = aux.equals("/") ? n1 / n2: resultado;
        resultado = aux.equals("%") ? n1 % n2: resultado;

        System.out.println(resultado);
        sc.close();
    }


}
