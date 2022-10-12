public class Main {


    public static void main(String[] args) {
        int[]rand = new int[10];

        for(int i = 0; i < 10; i++){
            double x = Math.random()*10;
            rand[i]=(int)x;

//            rand[i] = (int)Math.random();

        }

        for(int i = 0; i < 10; i++){
            System.out.println(rand[i]);

        }



    }
}