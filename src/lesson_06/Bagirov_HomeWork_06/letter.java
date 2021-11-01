package lesson_06.Bagirov_HomeWork_06;

import javax.xml.crypto.Data;
import java.util.Date;

public class letter {
    private String sender;
    private String recipient;
    private String theme;
    private String textLetter;


    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setTheme(String theme){
        this.theme = theme;
    }

    public String getTheme(){
        return theme;
    }

    public void setTextLetter(String textLetter){
        this.textLetter = textLetter;
    }

    public String getTextLetter(){
        return  textLetter;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;
}
