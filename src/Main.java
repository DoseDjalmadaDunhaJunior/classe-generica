public class Main {
/*ultilidade disso é fazer com que uma classe possa receber algo do tipo que o usuario desejar
util para fazer um programa que precisa ler varios tipos diferentes porem a logica continua igual
porem temos que colocar o nome inteiro do tipo, ou seja int -> Intanger
  */
    public static void main(String[] args) {
        //inserindo os tipos que irao receber
        GenericoParaDois<Double,String> var = new GenericoParaDois<Double, String>();
        var.setTudo(3.14,"Usuario");
        System.out.println(var.getUm());
        System.out.println(var.getDois());
        System.out.println("======TIPOS DIFERENTES======");
        //inserindo os tipos que irao receber
        GenericoParaDois<Boolean,Integer> alternativo = new GenericoParaDois<Boolean, Integer>();
        alternativo.setTudo(true,200);
        System.out.println(alternativo.getUm());
        System.out.println(alternativo.getDois());
    }
}
