package OOP.Assignment03.ZhiJIe;

public class Info {
    String name;
    String id;
    String age;
    String mail;
    String phone;
    String address;
    String gender;
    String enrollment;
    String studies;
    String programme;
    String nationality;

    public Info(String name, String id,String age, String mail, String phone, String address, String gender, String enrollment, String studies, String programme, String nationality){
       this.name = name;
       this.id = id;
       this.age = age;
       this.mail = mail;
       this.phone = phone;
       this.address = address;
       this.gender = gender;
       this.enrollment = enrollment;
       this.studies = studies;
       this.programme = programme;
       this.nationality = nationality;
    }
    public Info(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
