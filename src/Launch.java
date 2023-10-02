import java.util.*;
public class Launch{
    public static void main(String[] args) {
        System.out.println("Welcome to Job Portal");
        String role = " ";


        Job[] jobs = new Job[10];
        Job job1 =  new Job(101,"Java Dev","Java");
        Job job2 =  new Job(102,".Net Dev","ASP,C#");
        Job job3 =  new Job(103,"Python Dev","Python,Django");
        Job job4 =  new Job(104,"Php Dev","Php");
        jobs[0]=job1;
        jobs[1]=job2;
        jobs[2]=job3;
        jobs[3]=job4;

        int i = 4;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter your role: ");
            Scanner sc = new Scanner(System.in);
            role = sc.nextLine();
            if (role.equals("HR")) {
                System.out.println("Hi HR, Please Enter your Job details");
                Job j1 = new Job();
                System.out.println("Enter ID");
                j1.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter profile");
                j1.setProfile(sc.nextLine());
                System.out.println("Enter technology");
                j1.setTech(sc.nextLine());

                jobs[i] = j1;

                System.out.println(j1.toString());
                System.out.println("We will get back to you asap....");
            } else if (role.equals("JS")) {
                for (Job job : jobs){
                    if (job != null)
                        System.out.println(job);
                }
            }
            else if(role.equals("Exit")){
                flag=false;
            }
        }
    }
}
