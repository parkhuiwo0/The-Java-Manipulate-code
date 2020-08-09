package DI;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/08
 * Time: 6:05 오후
 */
public class App {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<Book> bookClass = Book.class; // Type을 통해서 가져오기
//
//        Book book = new Book();
//        Class<? extends Book> aClass = book.getClass(); // 인스턴스를 통해서 가져오기
//
//        Class<?> aClass1 = Class.forName("DI.Book"); // Full Qualified Class Name
//
//        Arrays.stream(bookClass.getFields()).forEach(System.out::println);
//
//        /*
//        조회가 안된다. 기본적으로 주석과 같은 취급을 바등ㅁ.
//         */
//        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
//
//        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
//            Arrays.stream(f.getAnnotations()).forEach(System.out::println);
//        });

        Class<?> bookClass = Class.forName("DI.Book.class");
        Constructor<?> constructor = bookClass.getConstructor(null); // 기본 생성자
        Constructor<?> constructor2 = bookClass.getConstructor(String.class); // 파라미터 있는 생성자
        Book o = (Book) constructor.newInstance(); // book 인스턴스 생성
        Book book2 = (Book) constructor2.newInstance("parameter"); // Book 인스턴스 생성 (파라미터 O)

        System.out.println(book2);

        Field a = Book.class.getDeclaredField("A"); // static field
        System.out.println(a.get(null)); // 특정한 오브젝트를 넘겨줄 게 없다. static field라서
        a.set(null, "AAAAA"); // 특정한 인스턴스에 해당하는 게 아니라 class에 해당하느 ㄴ것이라 null을 넘겨주고 주고싶은 값을 세팅
        System.out.println(a.get(null));

        Field b = Book.class.getDeclaredField("B"); // 인스턴스가 있어야 쓸 수 있는 Field 위에거처럼 Null로는 가져올 수 없다.
        b.setAccessible(true);
        System.out.println(b.get(book2)); // 가져올 수는 있기 하나 private 이기 떄문에 접근제어를 true로 설정
        b.set(book2, "BBBBBB");
        System.out.println(b.get(book2));





    }
}
