import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import java.io.File;
import java.io.IOException;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/08
 * Time: 4:44 오후
 */
public class Masulsa {

    public static void main(String[] args) {

        try {
            new ByteBuddy().redefine(Moja.class)
                    .method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit !"))
                    .make().saveIn(new File("/Users/common/Desktop/study-project/build/classes/"));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new Moja().pullOut());


    }
}
