

//Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.


public class  Masiv {
    public static void main(String[] args) {



        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int size = 9;

        int a, b, t;
        for (int i = 0; i < nums.length; i++){
            System.out.print(" " +nums[i]);
        }

        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] < nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Масив в обратном порядке: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

    }
}






