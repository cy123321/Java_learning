package Generics;

class Holder<T>{
    private T t;
    public void init(IFactory<T> factory){
        this.t = factory.create();  // 此处即为new T()的工厂方法的实现
    }
}

interface IFactory<T>{  //接口也可以参数化
    T create();
}

class IntegerFactory implements IFactory<Integer>{
    public Integer create(){
        return new Integer(10);
    }
}

public class NewTwithFactory {
    public static void main(String[] args){
        Holder<Integer> holder = new Holder<>();
        holder.init(new IntegerFactory());
    }
}
