package bean;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/3 1:48
 */
public class Employee {

    private Integer id;
    private String  lastName;
    private String emial;
    private String gender;

    public Employee(){

    }

    public Employee(Integer id, String lastName, String emial, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.emial = emial;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", emial='" + emial + '\'' +
                ", gender=" + gender +
                '}';
    }
}
