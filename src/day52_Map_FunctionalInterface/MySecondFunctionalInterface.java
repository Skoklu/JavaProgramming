package day52_Map_FunctionalInterface;

@FunctionalInterface
public interface MySecondFunctionalInterface <T>{

    void test(T data);

// "T"  represents any Generic names like: (Car, Animal, String, Integer...) which means Non-Primitives data type
}
