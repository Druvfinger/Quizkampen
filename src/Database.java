import java.util.List;
import java.util.Random;

public class Database {

    List<String> categories = List.of("Technology","Replacement1","Replacement2","Replacement3");

    List<String> technologyQuestions = List.of(
            "What year was the very first model of the iPhone released?",
            "What’s the shortcut for the “copy” function on most computers?",
            "What is often seen as the smallest unit of memory?",
            "Is Java a type of OS?",
            "Who is often called the father of the computer?",
            "What does “HTTP” stand for?",
            "What is the name of the man who launched eBay back in 1995?",
            "Which email service is owned by Microsoft?",
            "Google Chrome, Safari, Firefox, and Explorer are different types of what?",
            "What was Twitter’s original name?");

    List<String> technologyAnswers = List.of(
            "2007",
            "Ctrl + c",
            "kilobyte",
            "no",
            "Charles Babbage",
            "Hyper Text Transfer Protocol",
            "Pierre Omidyar",
            "Hotmail",
            "Web browsers",
            "twttr");

    public List<String> getCategories() {
     return categories;
    }

    public List<String> getTechnologyQuestions() {
        return technologyQuestions;
    }

    public List<String> getTechnologyAnswers() {
        return technologyAnswers;
    }
}
