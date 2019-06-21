public class RemoveNumbers {

    private String line;

    public RemoveNumbers(){
        line="NaN";
    }

    public RemoveNumbers(String line){
        this.line=line;
    }
    public String removeNumbers() throws MyNullException {
        if (line==null) {
            throw new MyNullException();
        } else {
            line = line.replaceAll("\\d", "");
            return line;
        }
    }

}