sealed class A extends Thread implements clonable permits B,C{

}

non-sealed class B extends A {

} 

final class C extends A{

}

class D extends B {
// in sealed classes we can use sealed, non-sealed and Final keywords. 
// in sealed - we can permits specific classes with permit keyword other than permit classes , no vasses can extend.
// in final- we can final that specific keyword no classes can extend.
// non -sealed - it can extendable classes it's like a normal class, there is no differnce b/w non-sealed classes or normal classes
}

interface X permits Y{

}

interface Y permits X{
    // in interface we can use only sealed or non-sealed but dont use final keywords
}

public class SealedDemo {
    public static void main(String[] args){

    }
}
