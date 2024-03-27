package practice_edu;

class Classroom{

    public String registerStudent(Stud sob) {

        char c[] = sob.name.toCharArray();

        if(sob.score < 0 || sob.score > 100){
            return "Invalid score";
        }
        for(int i=0;i<c.length;){
            if(Character.isUpperCase(c[i])){
                i++;
            }
            else{
                return "Block letters needed";
            }
        }
        return "Registered";
    }

    public String studentCard(String card){
        if(!card.matches("^[0-9]+$+^[A-Z]+[a-z]")){
            return "Invalid card";
        }
        return "valid card";
    }
}

public class Stud {
    String name;
    int score;

    public Stud(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        
        Stud sob = new Stud("A", 6);
        Classroom cob = new Classroom();
        String out = cob.registerStudent(sob);
        System.out.println(out);
    }
}
