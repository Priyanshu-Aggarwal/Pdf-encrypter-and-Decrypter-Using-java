
package com.encrypter.pdf_encrypter;
import java.io.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class pdfEncrypter {
    public static void main(String[] args) throws IOException{
        
        //Loading pdf file
        File  f=new File("Pdf path!!");
      PDDocument pd=PDDocument.load(f); 
        
        // creating instance of AccessPermission  class
        
        AccessPermission ap=new AccessPermission();
        
        StandardProtectionPolicy spp=new StandardProtectionPolicy("Owner password", "User password", ap);   //both password will be same
        //setting encryption key length
        spp.setEncryptionKeyLength(128);
        
        //setting permission
        spp.setPermissions(ap);
        
        //protect
        pd.protect(spp);
        pd.save("pdf path!!");
        pd.close();
        
        System.out.println("Encrypted Successfully!!");
    }
    
}