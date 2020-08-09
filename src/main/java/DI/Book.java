package DI;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/08
 * Time: 5:59 오후
 */
@MyAnnotation(name2 = "huiwo0")
public class Book {

    private static String B = "BOOK";

    private static final String C = "BOOK";

    @MyAnnotation(name2 = "")
    private String a = "a";

    public String d = "d";

    protected String e = "e";

    public Book() {
    }

    @AnotherAnnotation
    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println("F");
    }

    public void g() {
        System.out.println("g");
    }

    public int h() {
        return 100;
    }


}
