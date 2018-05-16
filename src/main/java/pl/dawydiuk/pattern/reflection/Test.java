package pl.dawydiuk.pattern.reflection;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {


    public static void main(String[] args) {
        Class reflectionClass = Volvo.class;


        String className = reflectionClass.getName();
        System.out.println(className+"\n");

        int classModifier = reflectionClass.getModifiers();
        System.out.println(Modifier.isPublic(classModifier)+"\n");


        Class[] interfaces = reflectionClass.getInterfaces();
        System.out.println(interfaces[0]+"\n");

        Class aClassSuper = reflectionClass.getSuperclass();
        System.out.println(aClassSuper+"\n");


        Method[] classMethodes = reflectionClass.getMethods();

        for (Method m:classMethodes) {
            System.out.println("Method name "+ m.getName()+"\n");

            Class[] parameterType = m.getParameterTypes();

            for (Class p:parameterType) {
                System.out.println("Parameter "+p.getName()+"\n");
            }


        }


        Field[] fields = reflectionClass.getDeclaredFields();

        for (Field f:fields){
            System.out.println(f.getName());
        }



    }






}
