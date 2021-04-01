package com.encrypter.pdf_encrypter;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

public class pdfDecrypter {

    public static void main(String[] args) throws IOException {
        try {
            File f = new File("pdf path!!");
            PDDocument pd = PDDocument.load(f, "abcd");

            //It is used to find whether pdf is protected or not.
            //        Boolean ans=pd.isEncrypted();
            //        System.out.println(ans);
            
            //for finding no. of pages in pdf
//           int ans= pd.getNumberOfPages();
//            System.out.println(ans);

            //removing all security
            pd.setAllSecurityToBeRemoved(true);

            //save the file
            pd.save(f);

            //close the file
            pd.close();

            System.out.println("Decrypt Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
