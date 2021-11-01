package lesson_06;

import java.util.Locale;

public class PhoneBook {
    // характеристики данного типа (alt+insert)
    private Сontact[] contacts = new Сontact[1000];

    //способы прохода массива
    public void addContacts(Сontact contact){
        for(int i = 0; i< contacts.length;i++){
            if(contacts[i]==null){
                contacts[i]=contact;
                break;
            }

        }
    }
    public void search(String forSearch){
        for(Сontact c:contacts){
            if(c != null){
                String nameOfCurrentContact = c.getName().toLowerCase(Locale.ROOT);
                if(nameOfCurrentContact!=null){
                    if(nameOfCurrentContact.contains(forSearch)){
                        System.out.println(c.getName()+" "+c.getPhoneNumber());
                    }
                }
                String phoneOfCurrentContact = c.getPhoneNumber();
                if(phoneOfCurrentContact!=null){
                    if(phoneOfCurrentContact.contains(forSearch)){
                        System.out.println(c.getName()+" "+c.getPhoneNumber());
                    }
                }


            }

        }
    }
}
