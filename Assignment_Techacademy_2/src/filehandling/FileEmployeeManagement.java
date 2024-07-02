package filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEmployeeManagement {
	
		private static final String FILE_NAME = "employee_records.txt";
		
		public static void main(String[]args){
			try{
			File file=new File(FILE_NAME);  
			if (!file.exists()) {
				file.createNewFile();
			}
			
			Scanner scanner=new Scanner(System.in);
			int choice;
			do{
			System.out.println("\n1. Add Employee Record");
			System.out.println("2. Display All Employee Records"); 
			System.out.println("3.Search Employee Record by ID");
			System.out.println("4. Update Employee Salary by ID");
			System.out.println("5.Delete Employee Record by ID");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: "); 
			choice = scanner.nextInt();
			scanner.nextLine();//Consume newline 
			switch (choice) {
			case 1: 
				addEmployeeRecord(); 
				break;
			case 2: 
				displayAllEmployeeRecords();
				break;
			case 3:
				searchEmployeeByID();
				break;
			case 4: 
				updateEmployeeSalary();
				break;
			 
			case 5:
//	   	         deleteEmployeeRecord();
	      	     break; 
			case 6:
			System.out.println("Exiting...");
			break;
			default:
			System.out.println("Invalidchoice.Pleaseenteranumber between 1 and 6.");
			}
			}while(choice!=6);
			} catch (IOException e) {
				System.out.println("Error:"+e.getMessage());
			}
			}
			
			private static void addEmployeeRecord()throws IOException
			{
			//GetEmployee data from user
			//Create employee object say employee and pass it to employee constructor
			try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME, true))) {
				   
				Object employee = null;
				writer.write(employee.toString());
			
			writer.newLine();
			System.out.println("Employee record added successfully.");
			}
			}
			private static void displayAllEmployeeRecords()throws IOException{
			try(BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))) {
			 
			String line;
			System.out.println("\nEmployee Records:"); 
			while ((line = reader.readLine()) != null) { 
				System.out.println(line);
			}
			}
			}
			
			private static void searchEmployeeByID()throws IOException{
			try(BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))) {
			String line;
			boolean found =false;
			String searchID = null;
			while((line=reader.readLine())!=null){
			if (line.startsWith("ID: "+ searchID)) { 
				System.out.println("EmployeeRecordfound:"); 
				System.out.println(line);
		    found=true;
			break;
			}
			}
			if(!found){
			System.out.println("EmployeewithID"+searchID+"not found.");
			}
			}
	        }
			private static void updateEmployeeSalary()throws IOException{
			 
			Scanner scanner= new Scanner(System.in);
			System.out.print("EnterEmployeeIDtoupdatesalary:"); 
			String updateID = scanner.nextLine();
			StringBuilder newRecords=new StringBuilder();
			boolean updated=false;
			try(BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))) {
			String line;
			while((line=reader.readLine())!=null){ 
				if (line.startsWith("ID: "+ updateID)) {
					String[] parts = line.split(", ");
			System.out.print("Enter new Salary for"+parts[1]+":$");
			double newSalary=scanner.nextDouble(); 
			parts[3] = "Salary: $"+ newSalary;
			line=String.join(",",parts); 
			updated = true;
			}
			newRecords.append(line).append("\n");
			}
			}
			if(!updated){
			System.out.println("Employee with ID"+updateID+"not found.");
			}else{
			try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME))) {
				writer.write(newRecords.toString());
				System.out.println("Salary updated successfully.");
			}
			}


			}
	}
			


