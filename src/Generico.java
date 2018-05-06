public class Generico <E>{
    public  Generico(){}

    public Generico(E v1){
        value1 = v1;
    }

    public E getValue1(){
        System.out.println(value1);
        return value1;
    }
    public void setValue1(E v1){
        value1 = v1;
    }

    private E value1;
}
