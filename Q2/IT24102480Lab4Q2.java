import java.util.Scanner;
public class IT24102480Lab4Q2 {
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("Please enter exam marks (out of 100): ");
 double examMarks = scanner.nextDouble();

if (examMarks < 0 || examMarks > 100){
System.out.println("Invalid input for exam marks,Please enter exam marks (out of 100)");
return;
}

System.out.print("Please enter labSubmission marks (out of 100):");
 double labMarks = scanner.nextDouble();
if (labMarks < 0 || labMarks > 100){
System.out.print("Invalid input for lab marks,Please enter exam marks (out of 100):");
return;
}

System.out.print("Please enter the percentage given for the exam: ");
 double examPercentage = scanner.nextDouble();

System.out.print("Please enter the percentage given for the lab submisson: ");
 double labPercentage = scanner.nextDouble();
if (examPercentage + labPercentage != 100){
System.out.print("Invalid percentages.The sum of exam and lab percentage must be 100.");
return;

}

double finalMarks = (examMarks *  examPercentage / 100) + (labMarks * labPercentage / 100);
System.out.print("Final Exam Mark is : " + finalMarks);
 }
}