package chap1;

public class Name {
    final String adultName;
    String childName;

    public Name(String adultName, String childName) {
        this.adultName = adultName;
        this.childName = childName;
    }
    
    public String getAdultName() {
        return adultName;
    }

    public String getChildName() {
        return childName;
    }

    //변수형 final사용시 setter 사용 불가능

    public void updateChildName(String childName) {
        this.childName = childName;
    }

    public void updateChildNameFinalParm(String childName) {
        childName = "patricia";
        this.childName = childName;
        // this.childName = "patricia"; 변경됨
    }
}
