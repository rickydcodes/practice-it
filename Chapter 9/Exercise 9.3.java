public class HarvardLawyer extends Lawyer {
	public String getVacationForm() {
         String vacationForm = super.getVacationForm();
		 return vacationForm + vacationForm + vacationForm + vacationForm;
	}
    
    public double getSalary() {
        return super.getSalary() + (super.getSalary() * 0.2);
    }
    
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
}