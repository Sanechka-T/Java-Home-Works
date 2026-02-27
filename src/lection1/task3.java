import java.util.Scanner;

void weight_lift(){
    Scanner in = new Scanner(System.in);
    int count = 0;
    int weight = 0;
    boolean stopByCount;
    while (true){
        if (count + 1 > 6){
            stopByCount = true;
            break;
        }
        System.out.print("Введите вес человека: ");
        int new_weight = in.nextInt();
        if(weight + new_weight > 450){
            stopByCount = false;
            break;
        }
        ++count;
        weight += new_weight;
    }
    System.out.println("Количество людей в лифте: " + count);
    System.out.println("Общий вес: " + weight + " кг");

    if (stopByCount) {
        System.out.println("Причина остановки: превышение лимита по количеству людей");
    } else {
        System.out.println("Причина остановки: превышение лимита по весу");
    }

    in.close();
}



void main(){
    weight_lift();
}
