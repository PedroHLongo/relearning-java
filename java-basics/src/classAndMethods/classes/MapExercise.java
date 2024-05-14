package classAndMethods.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int voteCount = Integer.parseInt(fields[1]);

                if(votes.containsKey(name)) {
                    int newVoteCount = votes.get(name) + voteCount;
                    votes.put(name, newVoteCount);
                } else {
                    votes.put(name, voteCount);
                }

                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

        System.out.println(votes);

        sc.close();
    }
}
