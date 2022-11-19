public class Human {
    private String name;
    private int yearOfBirth;
    private String cityOfResidence;
    private String job;

    public Human(String name, int yearOfBirth, String cityOfResidence, String job) {
        this.name = (name.isEmpty() || name.isBlank() || name == null) ? "Информация не указана" : name;
        this.yearOfBirth = (yearOfBirth <= 0) ? 0 : yearOfBirth;
        this.cityOfResidence = (cityOfResidence.isEmpty() || cityOfResidence.isBlank() || cityOfResidence == null) ? "Информация не указана" : cityOfResidence;
        this.job = (job.isEmpty() || job.isBlank() || job == null) ? "Информация не указана" : job;
    }
    public String getName() {
        return this.name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getCityOfResidence() {
        return this.cityOfResidence;
    }

    public String getJob() {
        return this.job;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = (yearOfBirth <= 0) ? 0 : yearOfBirth;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = (cityOfResidence.isEmpty() || cityOfResidence.isBlank() || cityOfResidence == null) ? "Информация не указана" : cityOfResidence;
    }

    public void greeting() {
        System.out.println("Привет! Меня зовут "+this.getName()+". " +
                "Я из города "+this.getCityOfResidence()+". " +
                "Я родился в "+this.getYearOfBirth()+" году. " +
                "Я работаю на должности "+this.getJob()+". Будем знакомы!");
    }
}
