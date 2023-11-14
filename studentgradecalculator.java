import java.util.*;
class studentgradecalculator
{
class student 
{
    int rollno,p,c,m;
    double avg,total;
    char grade;
}
void calculate()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of students");
    int n=sc.nextInt();
    student marks[]=new student[n];
    int i;
    for( i=0;i<n;i++)
    {
        marks[i]=new student();
        System.out.println("enter rollno");
        marks[i].rollno=sc.nextInt();
        System.out.println("enter phy marks");
        marks[i].p=sc.nextInt();
        System.out.println("enter chem marks");
        marks[i].c=sc.nextInt();
        System.out.println("enter math marks");
        marks[i].m=sc.nextInt();
        marks[i].total=marks[i].p+marks[i].c+marks[i].m;
        marks[i].avg=marks[i].total/3;
        if(marks[i].avg>=0 && marks[i].avg<20)
           {
             marks[i].grade='F';
           }
           else if(marks[i].avg>=20 && marks[i].avg<30)
           {
              marks[i].grade='E'; 
           }
           else if(marks[i].avg>=30 && marks[i].avg<50)
           {
              marks[i].grade='D'; 
           }
           else if(marks[i].avg>=50 && marks[i].avg<70)
           {
              marks[i].grade='C'; 
           }
           else if(marks[i].avg>=70 && marks[i].avg<80)
           {
              marks[i].grade='B'; 
           }
           else if(marks[i].avg>=80 && marks[i].avg<90)
           {
              marks[i].grade='A'; 
           }
           else if(marks[i].avg>=90 && marks[i].avg<100)
           {
              marks[i].grade='O'; 
           }
           else            
           {
              System.out.println("error"); 
           }
    }
        System.out.println("Rollno\tPhy\tChem\tMaths\tTotal\tAvg%\tGrade");
         System.out.println("-----------------------------------------------------");
         for(i=0;i<n;i++)
         {
            System.out.println(marks[i].rollno+"\t"+marks[i].p+"\t"+marks[i].c+"\t"+marks[i].m+"\t"+marks[i].total+"\t"+marks[i].avg+"\t"+marks[i].grade);
         } 
}
public static void main()
{
    studentgradecalculator obj1=new studentgradecalculator();
    obj1.calculate();
    
}
}
