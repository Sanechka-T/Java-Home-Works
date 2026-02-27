import java.util.Scanner;


void switch_nums() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите целое трёх значное положительное число: ");
    int number = in.nextInt();
    in.close();
    if (number < 100 | number > 999){
        System.out.print("Ошибка: Введите корректное число!");
    }
    char[] num = String.valueOf(number).toCharArray();
    char temp;
    if (number > 500){
        temp = num[0];
        num[0] = num[2];
    }
    else {
        temp = num[1];
        num[1] = num[2];
    }
    num[2] = temp;
    String new_num = new String(num);
    System.out.println("Полученное число " + new_num);
}

void main() {
    switch_nums();
}