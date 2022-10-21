public class assignment2 {
    public static void main(String[] args) throws Exception {
    int count1 = 0;
    while (count1 !=3){
    System.out.println("ANDREI JEFFERSON");
    count1 ++;
    }
    int count2 = 0;
    do {
        System.out.println("SISNEROS");
        count2 ++;
    } while (count2 != 4);
    for (int count3 = 0; count3  != 5;  count3 ++) {
    System.out.println("ASERON");
    }
    char [] myFirstName = {'A','N','D','R','E','I','J','E','F','F','E','R','S','O','N'};
    for (int i = 0; i < myFirstName.length; i++){
    System.out.println(myFirstName[i]);
    }  
    for (int i = myFirstName.length - 1; i >= 0; i--) {
    System.out.println(myFirstName[i]);
        }
    }
}
