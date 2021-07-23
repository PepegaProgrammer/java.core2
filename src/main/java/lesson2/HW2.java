package lesson2;

public class HW2 {

    public static void main(String[] args) {

        String[][] arr = new String[][] {{"53", "2", "29", "29",}, {"43", "81", "69", "4"}, {"-1201", "7", "383", "650"}, {"4", "4", "4", "4"}};
        try {
            try {
                int rez = method(arr);
                System.out.println(rez);
            }
                catch (MyArraySizeException e) {

                System.out.println("Размер массива неверный");

            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильный тип данных в ячейке массива");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
