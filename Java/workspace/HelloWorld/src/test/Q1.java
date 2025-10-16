package test;

class Student {
    int sno;          // 학번
    String name;      // 이름
    String dept;      // 학과
    int[] scores;     // 성적 배열
    double avg;       // 평균
    int rank;         // 석차
    int total;        // 총점

    // 생성자
    public Student(int sno, String name, String dept, int s1, int s2, int s3) {
        this.sno = sno;
        this.name = name;
        this.dept = dept;
        this.scores = new int[]{s1, s2, s3};
    }

    // 총점과 평균 계산
    public void calcTotalAndAvg() {
        total = 0;
        for (int s : scores) {
            total += s;
        }
        avg = total / 3.0;
    }

    // 평균 getter
    public double getAvg() {
        return avg;
    }

    // 석차 setter
    public void setRank(int rank) {
        this.rank = rank;
    }

    // 출력 메소드
    public void printInfo() {
        System.out.printf("%d %s %s %d %d %d %d %.2f %d\n",
                sno, name, dept, scores[0], scores[1], scores[2], total, avg, rank);
    }
}

public class Q1 {
   public static void main(String[] args) {
        // 3명의 학생 객체 생성
        Student[] students = new Student[3];
        students[0] = new Student(1, "홍길동", "영문", 80, 70, 80);
        students[1] = new Student(2, "박경미", "컴공", 70, 80, 75);
        students[2] = new Student(3, "하성호", "전컴", 80, 85, 90);

        // 총점과 평균 계산
        for (Student s : students) {
            s.calcTotalAndAvg();
        }

        // 석차 계산
        for (int i = 0; i < students.length; i++) {
            int rank = 1;
            for (int j = 0; j < students.length; j++) {
                if (students[i].getAvg() < students[j].getAvg()) {
                    rank++;
                }
            }
            students[i].setRank(rank);
        }

        // 출력
        System.out.println("asdasd학번 이름 학과 성적1 성적2 성적3 총점 평균 석차");
        for (Student s : students) {
            s.printInfo();
        }
    }
}