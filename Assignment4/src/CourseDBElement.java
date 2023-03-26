public class CourseDBElement implements Comparable<CourseDBElement>{
    String courseID;
    int CRN;
    int noOfCreds;
    String roomNo;
    String name;

    int hashcode;
    
    public CourseDBElement(String courseID, int CRN, int noOfCreds, String roomNo, String name){
        this.courseID = courseID;
        this.CRN = CRN;
        this.noOfCreds = noOfCreds;
        this.roomNo = roomNo;
        this.name = name;
    }
    public CourseDBElement(){
        courseID = "";
        CRN = 0;
        noOfCreds = 0;
        roomNo = "";
        name = "";
    }

    @Override
    public int compareTo(CourseDBElement element) {
        if(this.getCRN() == element.getCRN())
            return 0;
        return 1;
    }

    public String toString() {
		return "\nCourse:"+courseID+" CRN:"+CRN+" Credits:"+noOfCreds+" Instructor:"+name+" Room:"+roomNo;
	}

    public void setCRN(int CRN){
        this.CRN = CRN;
    }

    public int getCRN(){
        return CRN;
    }
    public String getID(){
        return courseID;
    }
    public String getRoomNum(){
        return roomNo;
    }
}