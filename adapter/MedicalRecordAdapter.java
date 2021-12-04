import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * An adaptor to change the medical records from the Carolina health to the SCMedical Record system
 * @author Reid Mozley
 */
public class MedicalRecordAdapter implements MedicalRecord{
    private HealthRecord record; 
    String[] name;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record; 
    }

    /**
     * Retrieves the patients first name
     * @return the first name of the patient
     */
    public String getFirstName() {
        String name[] = record.getName().split("\\s");
        return name[0];
    }

    /**
     * Retrieves the patients last name
     * @return the last name
     */
    public String getLastName() {
        String name[] = record.getName().split("\\s");
        return name[1]; 
    }

    /**
     * Retrieves the gender of the patient 
     */
    public Gender getGender() {
        String genderEnum = record.getGender().toUpperCase();
        Gender gender = Gender.valueOf(genderEnum); 
        return gender; 
    }

    /**
     * Retrieves and returns the birthday 
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * Updates the visitation sheet in carolina health record
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    } 

    /**
     * Creates a new Date 
     * using this from the driver class
     * 
     * @param year  The Year of the date
     * @param month The month of the date
     * @param day   The day of the date
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }
    
    /**
     * Parses through the array of old visits and converts them to type visit
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<>(); 
        for(int i = 0; i < record.getHistory().size(); i++) {
            String history = record.getHistory().get(i);
            boolean well = false; 
            String[] str = record.getHistory().get(i).split("\n");
            String[] date = str[0].split(": "); 

            date[1] = date[1].substring(4); 
            date = date[1].split(", "); 
            int y = Integer.parseInt(date[2]); 
            int d = Integer.parseInt(date[0]); 
            int m = Integer.parseInt(date[1]); 
            Date visitDate = makeDate(y, m, d);

            if (history.contains("true")) {
                well = true;
            } else if (history.contains("false")) {
                well = false;
            } 

            String[] desc = str[2].split(": ");
            String description = desc[1]; 

            Visit oldVisit = new Visit(visitDate, well, description);
            visits.add(oldVisit);
        }
        return visits;
    }

    /**
     * Formats the carolina health record with the SC medical records format
     */
    public String toString(){ 
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + getBirthday() + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";

        if(record.getHistory().size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : getVisitHistory()){
                result += visit.toString() + "\n";
            }
        }

        return result; 
    }
}
