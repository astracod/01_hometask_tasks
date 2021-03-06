package com.company.test_2.oop;

//  Имеется массив строк, выбрать из него (в новый массив) все анаграммы к заданому слову
//каземат(1), чесотка(4), корсет(3)

/*вообще, если тебе нужно проверить, является ли слово в массиве анаграммой, то нужны два условия:
1. Слово в массиве !== введенное слово
2. Сумма букв слова в массиве == сумме букв введенного слова*/

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Task_9 {
    String[] oldStr;
    String[] bigStr;
    String str;
    int k = 0;

    public Task_9() {
        this.oldStr = new String[]{"заметка", "отсечка", "сеточка", "стоечка", "тесачок", "костер", "сектор", "стокер", "баа"};
        this.str = "";
    }


    public void element(String b) throws UnsupportedEncodingException {
        boolean equalLength = false;
        boolean stringIdentity = false;
        boolean identitySymbols = true;
        boolean eachElement = false;

        String[] buf = new String[0];
        for (int i = 0; i < oldStr.length; i++) {

            str = oldStr[i];
            equalLength = objectLength(str, b); // Проверка строк  на соответствие длины

            if (equalLength) stringIdentity = str.equalsIgnoreCase(b); // Проверка  строк на идентичность
            if (!stringIdentity) identitySymbols = conformity(str, b);// Проверка строк на идентичность символов
            if (identitySymbols) {
                eachElement = oneElement(str, b);// Проверка строка на соответствие эелементов на сумму байт
                if (eachElement) {
                    k++;
                    buf = addStr(buf, str);
                }
            }
        }

        bigStr = new String[k];
        bigStr = buf;
        System.out.println(" Массив с анаграммами : " + Arrays.toString(bigStr));
    }

    //    Проверка строк на соответствие количества символов
    public boolean oneElement(String a, String b) throws UnsupportedEncodingException {

        int sumA = 0;
        int sumB = 0;
        byte[] strA = a.getBytes("KOI8_R");
        byte[] strB = b.getBytes("KOI8_R");
        for (int i = 0; i < strA.length; i++) {
            sumA += strA[i];
        }
        for (int i = 0; i < strB.length; i++) {
            sumB += strB[i];
        }
        return sumA == sumB;
    }

    //  Проверка на длину сроки, если равная то возвращает true

    public boolean objectLength(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        return l1 == l2;
    }

    // Взвращает true , если в строках одинаковые символы
    public boolean conformity(String a, String b) {
        boolean conformity = false;
        int k = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == a.charAt(i)) {
                    k++;
                }
                if (k == a.length()) {
                    conformity = true;
                }
            }
        }
        return conformity;
    }

    // 2 написанный Ильей метод.
    public String[] addStr(String[] arr, String b) {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = b;
        return newArray;
    }

}
// Для АРТУРА :
// Последние 2 метода с дополнением в массив написал мне Илья. Я сам до этого не догнал. Мой первый из закоменченных.
// Считаю, если это мой пробел
// в знаниях, то надо учитывать в дальнейших д/з. Я ахуел не много.

// Первый метод мой, не работающий. Второй Ильи работающий, но с не привычным мне copy.
    /*    public String[] addStr(String[] arr, String b) {
            String[] newArr = new String[arr.length + 1];
            if (newArr[0] == null) {
                newArr[0] = b;
            }
            for (int i = 1; i < newArr.length; i++) {
                    newArr[i] = b;
            }

            arr = newArr;
            return arr;
        }*/
// 1 метод Ильи с copy.
/*    public String[] addStr(String[] arr, String b) {
        String[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = b;
        return newArray;
    }*/