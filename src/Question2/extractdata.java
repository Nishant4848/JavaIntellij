package Question2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class extractdata  {


    public static void main(String[] args)
            throws IOException
    {
        Path fileName
                = Path.of("./TextFile/Data.txt");


        String str = Files.readString(fileName);
        countAndPrintRepeatedWordOccurences(str);
    }


    public static void countAndPrintRepeatedWordOccurences(
            String strContent) {

        Map<String, Integer> mapOfRepeatedWord =
                new HashMap<String, Integer>();

        String[] words = strContent.split(" ");

        for(String word : words) {

            String tempUCword = word.toLowerCase();

            if(mapOfRepeatedWord.containsKey(tempUCword)){

                mapOfRepeatedWord.put(tempUCword,
                        mapOfRepeatedWord.get(tempUCword) + 1);
            }
            else {

                mapOfRepeatedWord.put(tempUCword, 1);
            }
        }

        System.out.println("Words" + "\t\t" + "Count");
        System.out.println("======" + "\t\t" + "=====");

        for(Map.Entry<String, Integer> entry :
                mapOfRepeatedWord.entrySet()){
            System.out.println(entry.getKey()
                    + "\t\t" + entry.getValue());
        }

    }

    public static Map<String, Integer> sortByCountValue(
            Map<String, Integer> mapOfRepeatedWord) {

        Set<Map.Entry<String, Integer>> setOfWordEntries =
                mapOfRepeatedWord.entrySet();

        List<Map.Entry<String, Integer>> listOfwordEntry =
                new ArrayList<Map.Entry<String, Integer>>(
                        setOfWordEntries);

        Collections.sort(listOfwordEntry,
                new Comparator<Map.Entry<String, Integer>>() {

                    @Override
                    public int compare(Entry<String, Integer> es1,
                                       Entry<String, Integer> es2) {
                        return es2.getValue().compareTo(es1.getValue());
                    }
                });

        Map<String, Integer> wordLHMap =
                new LinkedHashMap<String, Integer>();

        for(Map.Entry<String, Integer> map : listOfwordEntry){
            wordLHMap.put(map.getKey(), map.getValue());
        }

        return wordLHMap;
    }
}

