public class Forloop {
    public static void main(String[] args) {
        int [] numbers = new int[10];   //vetor
        //new Int: novo obj ao vetor

        for(int x=0;x<=9;x++) {
             int y = x;
            numbers[x] = y+1;
            System.out.println(numbers[x]);
        }
    }
}
