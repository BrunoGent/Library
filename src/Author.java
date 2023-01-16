public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender){
        super();
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //getters
    public String getName(){ return name;}
    public String getEmail(){ return email;}
    public char getGender(){ return gender;}

    //setters
    public void setName(String name){this.name = name;}
    public void setEmail(String email){this.email = email;}
    public void setGender(char gender){this.gender = gender;}


    public String toString(){
        return ("(By " + name + ", " + email + ", gender " + gender + ") ");
    }

}
