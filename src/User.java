public class User {
    private String userId; //사용자 아이디 (학번)
    private String userPassword; // 사용자 비밀번호
    private String userName; // 사용자 이름
    private String userPhoneNum; // 사용자 비밀번호

    private int usingSeatNum=0; // 이용중인 좌석 (사용중이 아니라면 0)
    private int timeSum=0; // 누적 이용 시간부
    private String startTime=""; // 사용 시작 시간
    private String endTime=""; // 사용 종료 예정 시간
    //0000 ~ 2359


    public User(String userId, String userPassword, String userName, String userPhoneNum, int usingSeatNum, int timeSum, String startTime, String endTime) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPhoneNum = userPhoneNum;
        this.usingSeatNum = usingSeatNum;
        this.timeSum = timeSum;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public int getUsingSeatNum() {
        return usingSeatNum;
    }

    public int getTimeSum() {
        return timeSum;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }



    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public void setUsingSeatNum(int usingSeatNum) {
        this.usingSeatNum = usingSeatNum;
    }

    public void setTimeSum(int timeSum) {
        this.timeSum = timeSum;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    //csv = read.(askjdla.csv)  tiemSum=csv[4];

}
