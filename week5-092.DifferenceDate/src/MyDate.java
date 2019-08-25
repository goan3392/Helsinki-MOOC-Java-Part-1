public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        //You can also convet it to year by month/12.0 and day/365.0 then return (int)difference
        if(Math.abs(this.year - comparedDate.year)>0){
           int difference = ((this.year*365 + this.month*30 + this.day) - (comparedDate.year*365 + comparedDate.month*30 + comparedDate.day));
           return Math.abs(difference/365);
        }
        return 0;
    }

}
