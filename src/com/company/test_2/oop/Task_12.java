package com.company.test_2.oop;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/

public class Task_12 {
    private String str;
    private StringBuilder newStr;
    boolean status;

    public Task_12() {
        this.newStr = new StringBuilder();
        this.str = "abc cde def";
    }


    public StringBuilder inquisition() {
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            status = false;
            for (int j = 0; j < newStr.length(); j++) {
                if (Character.isWhitespace(elem)){
                    status = true;
                }

                if (newStr.charAt(j) == elem){
                    status = true;

                }
            }
            if (status == false){
                newStr.append(elem);
            }
        }
        return newStr;
    }
}
