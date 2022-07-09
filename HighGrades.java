import java.util.Scanner;
public class HighGrades {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please input the number of students: ");
		int i = userInput.nextInt();
		double [] students = new double[i];
		double sum = 0;


		for (int j = 0; j < i; j++) {
			System.out.println("Please input the grade of the student: " + (j+1));
			double k = userInput.nextDouble();
			students[j] = k; 
			sum += k;
		}
		System.out.println("Average is student grade is: " + sum/(students.length));
		
		int count = 0;
		for (int l = 0; l < students.length; l++) {

			if (students[l] > sum/(students.length)) {
				count++;
			}
		}
		System.out.println(count + " students have marks higher than average");
		userInput.close();
	}
}
