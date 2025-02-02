package entity;

import javax.swing.*;
import java.sql.Date;

public class student {
    /*private Long id;
    private Long age;
    private Long klass;
    private String where;
    private String Familiya;
    private String Otchestvo;
    private Boolean Delet;*/


    private String Siral_number;
    private String Name_;
    private String Registr_number;
    private String Invent_number;
    private String Otdelenie;
    private Date Data_input;
    private Boolean Na_spisanie;
    private String Act_spisanie;
    private String Gurnal_TO;
    private String Where;


    /*public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }

    public String getWhere() {
        return where;
    }
    public void setWhere(String where) {
        where = where;
    }

    public Long getKlass() {
        return klass;
    }
    public void setKlass(Long klass) {
        this.klass = klass;
    }

    public String getFamiliya() {
        return Familiya;
    }
    public void setFamiliya(String familiya) {
        Familiya = familiya;
    }
    public String getOtchestvo() {
        return Otchestvo;
    }
    public void setOtchestvo(String otchestvo) {
        Otchestvo = otchestvo;
    }

    public Boolean getDelet(){return Delet;}
    public void setDelet(Boolean delet) {Delet = delet;}*/



    public String getSiral_number(){return Siral_number;}
    public void setSiral_number(String siral_number){Siral_number = siral_number;}

    public String getName_() {return Name_;}
    public void setName_(String name_) {Name_ = name_;}

    public String getRegistr_number(){return Registr_number;}
    public void setRegistr_number(String registr_number){Registr_number = registr_number;}

    public String getInvent_number(){return Invent_number;}
    public void setInvent_number(String invent_number){Invent_number = invent_number;}

    public String getOtdelenie(){return Otdelenie;}
    public void setOtdelenie(String otdelenie){Otdelenie = otdelenie;}

    public Date getData_input(){return Data_input;}
    public void setData_input(Date data_input){Data_input = data_input;}

    public Boolean getNa_spisanie(){return Na_spisanie;}
    public void setNa_spisanie(Boolean na_spisanie){Na_spisanie = na_spisanie;}

    public String getAct_spisanie(){return Act_spisanie;}
    public void setAct_spisanie(String act_spisanie){Act_spisanie = act_spisanie;}

    public String getGurnal_TO(){return Gurnal_TO;}
    public void setGurnal_TO(String gurnal_TO){Gurnal_TO = gurnal_TO;}
    public String getWhere() {return Where;}
    public void setWhere(String where) {Where = where;}






    public void setId(JTextField idField) {
    }

    public void setAge(JTextField ageField) {
    }

    public void setKlass(JTextField classField) {
    }

    public void setWhere(JTextField whereField){
    }

    public void setFamiliya(JTextField lastnameField) {
    }

    public void setName_(JTextField nameField) {
    }

    public void setOtchestvo(JTextField middlenameField) {
    }

    public void setDelet(JTextField deletField){
    }


    public void setSiral_number(JTextField siralnumberField) {}

}