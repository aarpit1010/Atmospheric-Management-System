/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreenForm;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author AYUSH
 */
public class mail {
     
       
      public static void main(String args[]) {
               
          final String username = "memberdummyid@gmail.com";
          final String password = "aarpit1010";
 
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
 
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
 
        try {
 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("memberdummyid@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("authority.iiita@gmail.com"));
            message.setSubject("WARNING: HAZARDOUS AIR QUALITY");
            message.setText("VERY HIGH Air Quality Index (AQI) is detected."
                    + "The authority is requested to"
                    + " please take required measures.");
 
            Transport.send(message);
            System.out.print("Message Sent");
 
        } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
      }
    }

