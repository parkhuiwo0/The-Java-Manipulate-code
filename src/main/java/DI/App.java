package DI;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/08
 * Time: 6:05 오후
 */
public class App {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<Book> bookClass = Book.class; // Type을 통해서 가져오기

        Book book = new Book();
        Class<? extends Book> aClass = book.getClass(); // 인스턴스를 통해서 가져오기

        Class<?> aClass1 = Class.forName("DI.Book"); // Full Qualified Class Name

        Arrays.stream(bookClass.getFields()).forEach(System.out::println);

        /*
        조회가 안된다. 기본적으로 주석과 같은 취급을 바등ㅁ.
         */
        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);

        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            Arrays.stream(f.getAnnotations()).forEach(System.out::println);
        });


    }
}
