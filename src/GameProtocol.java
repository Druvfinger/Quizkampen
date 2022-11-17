public class GameProtocol {

    protected final int WAITING = 0;
    protected final int QUESTION_1_SENT = 1;
    protected final int QUESTION_2_SENT = 2;
    protected final int ANSWER_SENT = 3;

    protected final int NUMQUESTIONS = 2;
    protected int state = WAITING;

    public int currentQuestion = 0;


    public String[] questions = {"What year was the very first model of the iPhone released?",
            "What’s the shortcut for the “copy” function on most computers?"};

    public String[] answers = {"2007","Ctrl + c"};


    public String processInput (String userInput){
        String output = null;

        if (state == WAITING){
            output = questions[currentQuestion];
            state = QUESTION_1_SENT;
        } else if (state == QUESTION_1_SENT) {
            if (userInput.trim().equalsIgnoreCase(answers[currentQuestion])){
                currentQuestion++;
                output = "correct, next question";
                state = ANSWER_SENT;
            }else{ output = "Wrong, try again";}
        } else if (state == ANSWER_SENT) {
            output =  questions[currentQuestion];
            state = QUESTION_2_SENT;
        } else if (state == QUESTION_2_SENT) {
            if (userInput.trim().equalsIgnoreCase(answers[currentQuestion])){
                output = "correct, you win!, game shutting down";
                System.exit(0);
            }
        }else {
            output = "unexpected error";
        }


        return output;
    }




}
