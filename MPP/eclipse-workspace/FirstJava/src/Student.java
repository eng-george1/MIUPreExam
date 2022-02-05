
public class Student implements Comparable<Student> { 
	   
    private int id;
    private String firstName;
    private String  lastName;

    public Student(int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) { //Comparable interface
        //return this.id - o.id;  compare only by id
        
    //Suppose the comparison logic is sort by id then first name the second name
        int result = this.id - o.id;
       
        if (result == 0){ //the ids are same -> compare by first name
           result = this.firstName.compareTo(o.firstName);
           if (result == 0)//if first name same -> compare by last name
              result = this.lastName.compareTo(o.lastName);       
        }        
        return result;
    }
    
    public static Comparator<Student> FirstNameComparator = new Comparator<Student>(){

        @Override
        public int compare(Student o1, Student o2) {
            return o1.firstName.compareTo(o2.firstName); //compareTo implemented for String 
        }        
    };
    
    public static Comparator<Student> LastNameComparator = new Comparator<Student>(){
      @Override
         public int compare(Student o1, Student o2) {
           return o1.lastName.compareTo(o2.lastName); 
        }      
    };
    
    public static Comparator<Student> IdComparator = new Comparator<Student>(){

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id  - o2.id;
        }
            
    };
    
    
    
    
    
    @Override
    public String toString(){
        return "id = " + this.id + ", " + "firstName = " + this.firstName +  ", " + "lastName = " + this.lastName;
    }
    
  
    
    
}