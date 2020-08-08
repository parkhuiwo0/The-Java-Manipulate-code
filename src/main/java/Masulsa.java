//import net.bytebuddy.ByteBuddy;
//import net.bytebuddy.dynamic.ClassFileLocator;
//import net.bytebuddy.implementation.FixedValue;
//import net.bytebuddy.matcher.ElementMatchers;
//import net.bytebuddy.pool.TypePool;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// * Created by Huiwoo Park
// * User: common
// * Date: 2020/08/08
// * Time: 4:44 오후
// */
//public class Masulsa {
//
//    public static void main(String[] args) {
////        ClassLoader classLoader = Masulsa.class.getClassLoader();
////        TypePool typePool = TypePool.Default.of(classLoader);
////
////        try {
////            new ByteBuddy().redefine(
////                    typePool.describe("Moja").resolve(),
////                    ClassFileLocator.ForClassLoader.of(classLoader))
////                    .method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit !"))
////                    .make().saveIn(new File("/Users/common/Desktop/study-project/build/classes/"));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
////        try {
////            new ByteBuddy().redefine(Moja.class)
////                    .method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit !"))
////                    .make().saveIn(new File("/Users/common/Desktop/study-project/build/classes/"));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        System.out.println(new Moja().pullOut());
//
//
//    }
//}
