package day53_FunctionalInterface;

@FunctionalInterface
public interface Function <T, R>{

    R apply (T t);

}
