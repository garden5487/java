package test6;

public class StudentScore {
	
	private String Name;     
    private String Id;    
    private String Sub;    
    private double Scor;
    
    public StudentScore(String Name, String Id, String Sub,double Scor) {
    	this.Name = Name;
    	this.Id = Id;
    	this.Sub = Sub;
    	this.Scor = Scor;
    }
    	
    // 학생 정보 출력 메서드
    public void printStudentInfo() {
        System.out.println("학생이름 : " + Name);
        System.out.println("학생 ID : " + Id);
        System.out.println("과목 : " + Sub);
        System.out.println("점수 : " + Scor);
    }

    // 점수 수정 메서드
    public void updateScore(double newScore) {
        if (newScore >= 0.0 && newScore <= 100.0) {
            this.Scor = newScore;
            System.out.println("점수 수정 완료");
        } else {
            System.out.println("잘못된 점수 입력");
        }
      /*  public String getName() {
    		return Name;
    	}
        public String getId() {
    		return Id;
    	}
        public String getSub() {
    		return Sub;
    	}
        public int getScor() {
        	return Scor;
        }
        public void setScor(int Scor) {
    		this.Scor = Scor;
    	} */

    }
}
