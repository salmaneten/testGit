public class Animal {
    public static String getDafultGreeting(){
            return"hello";
    }
    public static String getCatGreeting(){
            return"Meaow";
    }
    public static String getBirdGreeting(){
            return"tweet";
    }
    public static String getDogGreeting(){
        return"howhow";
    }
    public static String getNewCatGreeting(){
        return"MeowMeow";
    }
    public static void main(String[] args) {
        String firstArgument = args[0];
        String output = "";
        if(firstArgument.equalsIgnoreCase("cat")){
            output = getCatGreeting();
        }
        else if(firstArgument.equalsIgnoreCase("bird")){
            output = getBirdGreeting();
        }
        else if(firstArgument.equalsIgnoreCase("dog")){
            output = getDogGreeting();
        }
        else if(firstArgument.equalsIgnoreCase("newCat")){
            output = getNewCatGreeting();
        }
        else{
            output = getDafultGreeting();
        }
        System.out.println(output);
    }
}
