package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// classes always capslock
public class Cookie {
    
    // for Windows it is "\\data2"
    // mac is just "data2"
    // variables always camelCase
    String dirPath = "\\data2";
    String fileName = "cookie.txt";

    List<String> cookieItems = null;

    public void readCookieFile() throws FileNotFoundException {
        cookieItems = new ArrayList<String>();

        // contains path, seperator and file name
        File file = new File(dirPath + File.separator + fileName);

        FileReader fr = new FileReader(file);
        // using file buffer stream
        BufferedReader br = new BufferedReader(new FileReader(file));


        String readString;

        try {
            while((readString = br.readLine()) != null) {
                cookieItems.add(readString);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }


    // create a function to return cookie
    public String returnCookie() {
        Random rand = new Random();

        if (cookieItems != null) {
            return cookieItems.get(rand.nextInt(cookieItems.size()));
        } else {
            return "There is no cookie found ";
        }

    }



    // create a function to show list of cookies
    public void showCookies() {
        if (cookieItems != null) {


            //this is one way to print out 
            // cookieItems.forEach(ci -> )



            // this is another way to print out 
            for (String s: cookieItems) {
                System.out.println(s);
            }

        }
    }









}
