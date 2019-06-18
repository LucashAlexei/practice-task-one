public class RemoveNumbers {

    private String line;

    public RemoveNumbers(){
        line="NaN";
    }

    public RemoveNumbers(String line){
        this.line=line;
    }
    public String removeNumbers(){
        line=line.replaceAll("\\d","");
        return line;
    }
    public void print(){
// System.out.println(line);
    }
}