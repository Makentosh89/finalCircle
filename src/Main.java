public class Main {
    public static void main(String[] args) {
        /*
        Создать массив из 7 кругов.
        Обьявить его final.
        У каждого круга есть положение X,Y (ширина,высота,цвет.
        Заполнить массив.
        Создать новый массив используя текущую ссылку.
         */

        Circle circle1 = new Circle("Red", 5, 10);
        Circle circle2 = new Circle("Black", 8, 12);
        Circle circle3 = new Circle("White", 10, 18);
        Circle circle4 = new Circle("Blue", 7, 14);
        Circle circle5 = new Circle("Pink", 4, 8);
        Circle circle6 = new Circle("Yellow", 9, 14);
        Circle circle7 = new Circle("Orange", 11, 16);

       final Circle[] circlesArray = new Circle[7];
        circlesArray[0]=circle1;
        circlesArray[1]=circle2;
        circlesArray[2]=circle3;
        circlesArray[3]=circle4;
        circlesArray[4]=circle5;
        circlesArray[5]=circle6;
        circlesArray[6]=circle7;

        Circle[]circlesArray2=circlesArray;
        for (Circle cir : circlesArray2){
            System.out.println(cir);
            System.out.println();
        }
    }
}
