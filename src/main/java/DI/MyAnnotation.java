package DI;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD}) // 제한
public @interface MyAnnotation {

    /*
    값듣은 primitive type이 Boxing된 Reference 타입만 가질 수 있다.
     */
    String name() default "huiwoo";

    String name2(); // 기본 값을 안주면 값들을 반드시 줘야한다.

    int number() default 100;




}
