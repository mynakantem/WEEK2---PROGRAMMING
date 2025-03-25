class Course {
    String courseName;
    int duration; // Duration in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

class EducationalCourseSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("Basic Programming", 20);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 30, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 40, "Coursera", true, 200, 15);

        basicCourse.displayCourseInfo();
        System.out.println("--------------------");
        onlineCourse.displayCourseInfo();
        System.out.println("--------------------");
        paidOnlineCourse.displayCourseInfo();
    }
}
