boolean isDotInCircle(int x_circle, int y_circle, int radius, int x_dot, int y_dot ) {
    double distance = Math.sqrt(Math.pow(x_dot - x_circle, 2) + Math.pow(y_dot - y_circle, 2));

    return distance <= radius;
}

void main (){
    if(isDotInCircle(0,0,5,4,4)){
        System.out.print("Точка находится внутри круга");
    }
    else{
        System.out.print("Точка находится за границей круга");
    }
}