public class DrunkMan {
    //drunk man climb up on the tree on day time and fall down at night.
    //how many days will take to get to the top
    public static void main(String[] args) {
       int solution =  drunkman(10,1,1);
       if (solution < 0){
           System.out.println ("He will never reach to the top of the tree ");
       }
       else if(solution ==1){
           System.out.println ("He will reach at the top of the tree in "+solution+" day");
       }
       else if (solution >= 0)
           System.out.println ("He will reach at the top of the tree in "+solution+" days");
    }
    private static int drunkman(int treeHieght, int day, int night) {
        int numberOfDays = 0;
        for(int i = treeHieght;i>=0;i--){

         if (night >= day)//never climb up
             return -1;
         else if (treeHieght <= day) {
                numberOfDays ++;
                return numberOfDays;
            }
         else {
             treeHieght -= day;//the climbing up will decrease remaining height of the tree
             treeHieght += night;//the falling of the man will add the remaining height
             numberOfDays++;
         }
        }
        return numberOfDays;
    }
}
