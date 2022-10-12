public class Information<VariableType>{
    
    private String Age;
    private String Quote;
    private String Birthdate;
    private VariableType Name;

    public void setName(VariableType Name) {
        this.Name = Name;
    }
    public VariableType getName() {
        return Name;
    }
    public void setAge(String Age) {
        this.Age = Age;
    }
    public String getAge() {
        return Age;
    }
    public void setQuote(String Quote) {
        this.Quote = Quote;
    }
    public String getQuote() {
        return Quote;
    }
    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }
    public String getBirthdate() {
        return Birthdate;
    }
    public void add(String string) {
    }
}