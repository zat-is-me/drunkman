public class DrunkMan {
    public static void main(String[] args) {
       int solution =  drunkman(2,2,1);
       if (solution < 0){
           System.out.println ("He will never reach to the top");
       }
       else if(solution ==1){
           System.out.println ("He will reach at the top "+solution+" day");
       }
       else if (solution >= 0)
           System.out.println ("He will reach at the top the tree "+solution+" days");
    }

    //drunk man clim up on the tree on day time and fall down at night.
    //how many days will take
    private static int drunkman(int treeHieght, int day, int night) {
        int numberOfDays = 0;
        for(int i = treeHieght;i>=0;i--){
         if ()
            treeHieght -= day;
            treeHieght += night;

            numberOfDays++;
        }
        return numberOfDays;
    }
}
