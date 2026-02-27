import java.util.Random;

void fill_array(List<Integer> array, int size){
    Random random = new Random();
    for (int i = 0; i < size; i++) {
        array.add(random.nextInt(100));
    }
}

void main()
{
    List<Integer> array1 = new ArrayList<>();
    List<Integer> array2 = new ArrayList<>();
    fill_array(array1, 10);
    fill_array(array2, 8);
    System.out.println("Первый массив: " + array1);
    System.out.println("Второй массив: " + array2);
    List<Integer> result = new ArrayList<>(array1);
    result.removeAll(array2);
    System.out.println("Итоговый массив: " +result);
}