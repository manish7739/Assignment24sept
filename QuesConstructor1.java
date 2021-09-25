package task24sept;

public class QuesConstructor1 {
	int id;
	String StudentName;
	String SudentClgName;
	String phoneNumber;
	String batch;
	String stream;
	
	public QuesConstructor1(int id,String StudentName , String SudentClgName, String phoneNumber,String batch,String stream) {
		this.id=id;
		this.StudentName=StudentName;
		this.SudentClgName=SudentClgName;
			this.phoneNumber=phoneNumber;
		this.batch=batch;
		this.stream=stream;
		
		}
		public void display() {
			
			System.out.println(id+"    "+StudentName+"   "+SudentClgName+"     "+phoneNumber+"    "+batch+"   "+stream);
		}
	
public static void main(String args[]) {
	System.out.println("ID "+"   Name "+"   C.Name "+"  P.Number "+"    Batch "+" Stream");
	QuesConstructor1 qc= new QuesConstructor1(01,"manish","gzs","7739251434","2k16","CS/IT");
	QuesConstructor1 qc1= new QuesConstructor1(02,"Nitish","gzs","7739251434","2k16","CS/IT");
	QuesConstructor1 qc2= new QuesConstructor1(03,"Rabish","gzs","7739251434","2k16","CS/IT");
	QuesConstructor1 qc3= new QuesConstructor1(04,"Aahish","gzs","7739251434","2k16","CS/IT");
	QuesConstructor1 qc4= new QuesConstructor1(05,"Naveen","gzs","7739251434","2k16","CS/IT");
	qc.display();
	qc1.display();
	qc2.display();
	qc3.display();
	qc4.display();
	
	
}
}
