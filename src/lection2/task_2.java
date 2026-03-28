
/*void printNumbers(int n ) { Вариант когда числа выводятся в обратном порядке
    if (n != 0) {
        System.out.print(n % 10 + " ");
        n = n / 10;
        printNumbers(n);
    }
}*/

void printNumbers(int n, int order ) {
    if (order > 0) {
        System.out.print((n / order) + " ");
        printNumbers(n % order, order / 10);
    }
}

// функция вычисления порядка числа
private static int getOrder(int n) {
    if (n < 10) {
        return 1;
    }
    return getOrder(n / 10) * 10;
}

void main (){
    int x = 12345;
    printNumbers(x, getOrder(x));
}