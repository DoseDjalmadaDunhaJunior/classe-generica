/*
a letra E e Z viram o tipo das variaveis que o usuario inserir
 */
public class GenericoParaDois <E,Z>{


    public void setTudo(E a, Z b){
        um = a;
        dois = b;
    }

     public E getUm(){
        return um;
     }

     public Z getDois(){
        return dois;
     }

    private E um;
    private Z dois;

}
