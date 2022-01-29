import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

class ass11{
    HashSet<String> dictionary;

    ass11(String filename) throws FileNotFoundException{
        Scanner in=new Scanner(new File(filename));
        dictionary=new HashSet<>();
        while(in.hasNextLine()){
            String x=in.nextLine();
            if(x.trim().length()>2)
                dictionary.add(x.trim());
        }
    }

    private String addChar(String word)
    {
        StringBuilder sb=new StringBuilder("");
        for(char c='a';c<='z';c++)
        {
            if(dictionary.contains(Character.toString(c)+word))
                sb.append(Character.toString(c)+word+"\n");
        }
        for(char c='a';c<='z';c++)
        {
            if(dictionary.contains(word+Character.toString(c)))
                sb.append(word+Character.toString(c)+"\n");
        }
        return sb.toString();
    }

    private String removeChar(String word){
        StringBuilder sb=new StringBuilder("");
        if(dictionary.contains(word.substring(1)))
            sb.append(word.substring(1)+"\n");
        if(dictionary.contains(word.substring(0,word.length()-1)))
            sb.append(word.substring(0,word.length()-1)+"\n");
        return sb.toString();
    }

    private String adjacent(String word){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < word.length()-1; i++) {
            if (dictionary.contains(word.substring(0,i)+word.charAt(i+1)+word.charAt(i)+word.substring(i+2)))
                sb.append(word.substring(0,i)+word.charAt(i+1)+word.charAt(i)+word.substring(i+2)+"\n");
        }
        return sb.toString();
    }

    public String spellCheck(String word)
    {
        word=word.toLowerCase();
        if(dictionary.contains(word))
            return "no mistakes found";
        StringBuilder result=new StringBuilder();
        result.append(addChar(word));
        result.append(removeChar(word));
        result.append(adjacent(word));
        return result.toString();
    }
}

class driver{
    public static void main(String[] args) throws FileNotFoundException{
        ass11 dict=new ass11("/home/abir/Music/words.txt");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter new word: ");
        System.out.println(dict.spellCheck(in.nextLine()));
        //System.out.println(dict.dictionary.contains("hell"));
    }
}