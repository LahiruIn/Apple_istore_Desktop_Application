/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Study (ICBT)
 */
public class AddnewA {
    
    private String fname;
    private String age;
    private String gender;
    private String address;
    private String email;
    private int mobile;
    private String usernm;
    private String passwd;

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobile
     */
    public int getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the usernm
     */
    public String getUsernm() {
        return usernm;
    }

    /**
     * @param usernm the usernm to set
     */
    public void setUsernm(String usernm) {
        this.usernm = usernm;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
   
    public void addnacc (AddnewA nacc)
    {
        String naccString = nacc.getFname()+","+ nacc.getAge()+","+nacc.getGender()+","+ nacc.getAddress()+","+
               getEmail()+","+String.valueOf(nacc.getMobile())+","+ nacc.getUsernm()+","+ nacc.getPasswd();
        
        DBconnection2 dbacc = new DBconnection2();
        dbacc.writeconnection(naccString);
    }
      
}
