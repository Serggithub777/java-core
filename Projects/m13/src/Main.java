import java.util.Arrays;

import static java.lang.String.valueOf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //d любом месте кода можно создать объект класса Object
        //Object object = new Object();
        //System.out.println(object.toString());

        MyClass myClass1 = new MyClass();
        System.out.println(myClass1.toString());

        MyClass myClass2 = new MyClass();
        System.out.println(myClass2.toString());

        System.out.println(myClass1 == myClass2);
        System.out.println(myClass1.equals(myClass2));

        // создание массива
        int[] array = new int[10];
        int[] array1 = {0, 1, 2, 3};
        MyClass[] objArr = new MyClass[5];
        System.out.println(array1.toString());
        for (int e : array1
        ) {
            System.out.print(e);
        }
        System.out.println();
        //создание строк
        String text = " abcc ";
        System.out.println(text);
        char[] textArr = text.toCharArray();
        String text2 = new String(textArr);
        System.out.println(text2);
        //основные методы
        System.out.println(text.length()); // длина
        System.out.println(text.isEmpty()); //пустая
        System.out.println(text.charAt(1)); //символ на позиции 1
        System.out.println(text.startsWith("ab")); //строка начинается с подстроки ab
        System.out.println(text.endsWith("bc")); //строка заканчивается на подстроку bc
        System.out.println(text.indexOf("b")); // возвращает номер позиции b
        System.out.println(text.lastIndexOf("c")); //возвращает позицию указанного символа последнего имеющегося в строке
        System.out.println(text.substring(1, 3)); // вернет подстроку с начальным и конечными индексами строки
        System.out.println(text.replace('c', 'f'));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.trim());
        String str = String.valueOf(75);
        System.out.println(str.getClass());
        System.out.println(str);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i).append("_");
        }
        System.out.print(builder.toString());
        System.out.println();

//перегрузка методов отличаются входными параметрами

//класс java.utils.Arrays содержит статические методы для работы с массивами
        int[] intArray = new int[]{1, 5, 9, 8, 7,6, 2, 3, 4};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        for (int e: intArray
             ) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(intArray,7));
    }


}
