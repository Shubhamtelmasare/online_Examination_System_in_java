import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
class storedatateacher{
    public String teachername;
    private int teacherid;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTeachername() {
        return teachername;
    }
    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
    public int getTeacherid() {
        return teacherid;
    }
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }
}
class storedatastudent{
    public String studentname;
    private int studentid;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
class ans{
    int qpno=0;
    int no;
    LinkedList<String> qu1=new LinkedList<>();
    LinkedList<String> qu2=new LinkedList<>();
    LinkedList<String> qu3=new LinkedList<>();
    LinkedList<String> qu4=new LinkedList<>();
    LinkedList<String> qu5=new LinkedList<>();
    LinkedList<String> qu6=new LinkedList<>();
    LinkedList<String> qu7=new LinkedList<>();
    LinkedList<String> qu8=new LinkedList<>();
    LinkedList<String> qu9=new LinkedList<>();
    LinkedList<String> qu10=new LinkedList<>();
    LinkedList<String> answer2=new LinkedList<>();
    LinkedList<String> answer3=new LinkedList<>();
    LinkedList<String> answer4=new LinkedList<>();
    LinkedList<String> answer5=new LinkedList<>();
    LinkedList<String> answer6=new LinkedList<>();
    LinkedList<String> answer7=new LinkedList<>();
    LinkedList<String> answer8=new LinkedList<>();
    LinkedList<String> answer9=new LinkedList<>();
    LinkedList<String> answer10=new LinkedList<>();
    LinkedList<String> answer11=new LinkedList<>();
    LinkedList<String> ansstu=new LinkedList<>();
}
class que extends ans{
}
public class onlineExaminationSystem {
    public static int marks=0;
    public static LinkedList<storedatateacher> data = new LinkedList<>();
    public static LinkedList<storedatastudent> sdata = new LinkedList<>();
    public static LinkedList<que> QA = new LinkedList<>();
    public static LinkedList<ans> AA = new LinkedList<>();
    public static void register(int student_or_teacher) {
        storedatateacher d = new storedatateacher();
        storedatastudent e = new storedatastudent();
        Scanner sc = new Scanner(System.in);
        try {
            if (student_or_teacher == 1) {
                System.out.println("Enter your E-mail ID");
                String name = sc.next();
                d.setTeachername(name);
                Random r = new Random();
                int no = r.nextInt(1000, 9999);
                d.setTeacherid(no);
                System.out.println("Your unipue id is " + d.getTeacherid());
                System.out.println("Enter the password");
                String pass = sc.next();
                d.setPassword(pass);
                data.add(d);
                System.out.println("You have sucessfully registeres youself in portal" +
                        "\nYou information is \n" +
                        "Name :" + d.getTeachername() +
                        "\nID :" + d.getTeacherid() +
                        "\nPassword :" + d.getPassword()+
                        "\nNote down your ID and Password it will be required while login");
                System.out.println();
            } else if (student_or_teacher == 2) {
                System.out.println("Enter your E-mail ID");
                String name = sc.next();
                e.setStudentname(name);
                Random r = new Random();
                int no = r.nextInt(1000, 9999);
                e.setStudentid(no);
                System.out.println("Your unipue id is " + e.getStudentid());
                System.out.println("Enter the password :");
                String pass = sc.next();
                e.setPassword(pass);
                sdata.add(e);
                System.out.println("You have sucessfully registeres youself in portal\n" +
                        "\nYou information is \n" +
                        "Name :" + e.getStudentname() +
                        "\nID :" + e.getStudentid() +
                        "\nPassword :" + e.getPassword()+
                        "\nNote down your ID and Password it will be required while login");
                System.out.println();
            }
        } catch (Exception ex) {
            System.out.println("Enter a valid input");
        }
    }
    public static void login(int student_or_teacher) {
        ans an = new ans();
        que question = new que();
        try {
            if (student_or_teacher == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your four digit unique id");
                if (sc.hasNextInt()) {
                    int logid = sc.nextInt();
                    System.out.println("Enter your password");
                    if (sc.hasNext()) {
                        String logpass = sc.next();
                        for (int i = 0; i < data.size(); i++) {
                            if (data.get(i).getTeacherid() == logid && data.get(i).getPassword().equals(logpass)) {
                                System.out.println("login succesfull");
                                System.out.println("Enter 1 to set new question paper" +
                                        "\nEnter 2 to read old question paper");
                                if (sc.hasNextInt()) {
                                    int teacher_choice = sc.nextInt();
                                    switch (teacher_choice) {
                                        case 1:
                                            System.out.println("Enter how many question paper you want to set" +
                                                    "\n(You can set maximum 10 question paper)");
                                            if (sc.hasNextInt()) {
                                                question.qpno = sc.nextInt();
                                                if (question.qpno<=10){
                                                for (int h = 0; h < question.qpno; h++) {
                                                    System.out.println("Enter how many questions you want to set for question paper " + (h + 1));
                                                    if (sc.hasNextInt()) {
                                                        an.no = sc.nextInt();
                                                        for (int j = 0; j < an.no; j++) {
                                                            System.out.println("Enter the question no " + (j + 1));
                                                            if (sc.hasNext()) {
                                                                String q = sc.next();
                                                                if (h == 0) {
                                                                    question.qu1.add(q);
                                                                } else if (h == 1) {
                                                                    question.qu2.add(q);
                                                                }
                                                                else if (h == 2) {
                                                                    question.qu3.add(q);
                                                                }
                                                                else if (h == 3) {
                                                                    question.qu4.add(q);
                                                                }
                                                                else if (h == 4) {
                                                                    question.qu5.add(q);
                                                                }
                                                                else if (h == 5) {
                                                                    question.qu6.add(q);
                                                                }
                                                                else if (h == 6) {
                                                                    question.qu7.add(q);
                                                                }
                                                                else if (h == 7) {
                                                                    question.qu8.add(q);
                                                                }
                                                                else if (h == 8) {
                                                                    question.qu9.add(q);
                                                                }
                                                                else if (h == 9) {
                                                                    question.qu10.add(q);
                                                                }
                                                                else System.out.println("You have crossed limit");
                                                                System.out.println("Enter the answer of question no " + (j + 1));
                                                                if (sc.hasNext()) {
                                                                    String p = sc.next();
                                                                    if (h==0){
                                                                        question.answer2.add(p);
                                                                    } else if (h==1) {
                                                                        question.answer3.add(p);
                                                                    }
                                                                    else if (h==2) {
                                                                        question.answer4.add(p);
                                                                    }
                                                                    else if (h==3) {
                                                                        question.answer5.add(p);
                                                                    }
                                                                    else if (h==4) {
                                                                        question.answer6.add(p);
                                                                    }
                                                                    else if (h==5) {
                                                                        question.answer7.add(p);
                                                                    }
                                                                    else if (h==6) {
                                                                        question.answer8.add(p);
                                                                    }
                                                                    else if (h==7) {
                                                                        question.answer9.add(p);
                                                                    }
                                                                    else if (h==8) {
                                                                        question.answer10.add(p);
                                                                    }
                                                                    else if (h==9) {
                                                                        question.answer11.add(p);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        QA.add(question);
                                                        if (h==0){
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu1.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer2.get(j));
                                                            }
                                                        } else if (h==1) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu2.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer3.get(j));
                                                            }
                                                        }
                                                        else if (h==2) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu3.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer4.get(j));
                                                            }
                                                        }
                                                        else if (h==3) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu4.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer5.get(j));
                                                            }
                                                        }
                                                        else if (h==4) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu5.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer6.get(j));
                                                            }
                                                        }
                                                        else if (h==5) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu6.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer7.get(j));
                                                            }
                                                        }
                                                        else if (h==6) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu7.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer8.get(j));
                                                            }
                                                        }
                                                        else if (h==7) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu8.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer9.get(j));
                                                            }
                                                        }
                                                        else if (h==8) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu9.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer10.get(j));
                                                            }
                                                        }
                                                        else if (h==9) {
                                                            for (int j = 0; j < an.no; j++) {
                                                                System.out.print("Question " + (j + 1) + ")");
                                                                System.out.println(question.qu10.get(j));
                                                                System.out.print("Answer :-");
                                                                System.out.println(question.answer11.get(j));
                                                            }
                                                        }
                                                    }
                                                    else
                                                        System.out.println("Please enter valid input\n");break;
                                                }
                                            }
                                                else
                                                    System.out.println("You cant set more than 10 question paper\n");
                                            } else System.out.println("Invalid input");
                                            return;
                                        case 2:
                                            System.out.println("You have " + QA.get(0).qpno + " questions paper" +
                                                    "\nWhich one you want to read\n");
                                            for (int b=0;b<QA.get(0).qpno;b++){
                                                System.out.println("Enter "+(b+1)+" to read questions paper no "+(b+1));
                                            }
                                            int w=sc.nextInt();
                                            if (w==1){
                                            for (int j = 0; j < QA.get(0).qu1.size(); j++) {
                                                System.out.println("Question no " + (j + 1) + " is ");
                                                System.out.println(QA.get(0).qu1.get(j));
                                            }
                                            } else if (w==2) {
                                                for (int j = 0; j < QA.get(0).qu2.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu2.get(j));
                                            }
                                            }
                                            else if (w==3) {
                                                for (int j = 0; j < QA.get(0).qu3.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu3.get(j));
                                                }
                                            }
                                            else if (w==4) {
                                                for (int j = 0; j < QA.get(0).qu4.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu4.get(j));
                                                }
                                            }
                                            else if (w==5) {
                                                for (int j = 0; j < QA.get(0).qu5.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu5.get(j));
                                                }
                                            }
                                            else if (w==6) {
                                                for (int j = 0; j < QA.get(0).qu6.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu6.get(j));
                                                }
                                            }
                                            else if (w==7) {
                                                for (int j = 0; j < QA.get(0).qu7.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu7.get(j));
                                                }
                                            }
                                            else if (w==8) {
                                                for (int j = 0; j < QA.get(0).qu8.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu8.get(j));
                                                }
                                            }
                                            else if (w==9) {
                                                for (int j = 0; j < QA.get(0).qu9.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu9.get(j));
                                                }
                                            }
                                            else if (w==10) {
                                                for (int j = 0; j < QA.get(0).qu10.size(); j++) {
                                                    System.out.println("Question no " + (j + 1) + " is ");
                                                    System.out.println(QA.get(0).qu10.get(j));
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid input");
                                    }
                                } else System.out.println("Invalid input");
                            } else {
                                System.out.println("Please enter correct ID/Password\n");
                            }
                        }
                    }
                }
                else
                    System.out.println("ID can be only Integer\n");
            }
            if (student_or_teacher == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your four digit unique id");
                if (sc.hasNextInt()) {
                    int slogid = sc.nextInt();
                    System.out.println("Enter your password");
                    if (sc.hasNext()) {
                        String slogpass = sc.next();
                        for (int i = 0; i < sdata.size(); i++) {
                            if (sdata.get(i).getStudentid() == slogid && sdata.get(i).getPassword().equals(slogpass)) {
                                System.out.println("login succesfull");
                                System.out.println("Enter 1 to start the exam" +
                                        "\nEnter 2 to exit the exam");
                                if (sc.hasNextInt()) {
                                    int st1 = sc.nextInt();
                                    if (st1 == 1) {
                                        Random r = new Random();
                                        int no = r.nextInt(1, QA.get(0).qpno);
                                        System.out.println("\nYour exam started "+no);
                                        System.out.println("Your question set is \n" +
                                                "Answer the following question\n" +
                                                "1 mark for each question" +
                                                "\nBest of luck for your exam\n");
                                        switch (no){
                                            case 1:
                                        for (int k = 0; k < QA.get(0).qu1.size(); k++) {
                                            System.out.print("Question"+(k + 1) + ")");
                                            System.out.println(QA.get(0).qu1.get(k));
                                            System.out.println("Choose your answer");
                                            for (int q = 0; q < QA.get(0).answer2.size(); q++) {
                                                System.out.println((q + 1) + ")" + QA.get(0).answer2.get(q));
                                            }
                                            if (sc.hasNext()) {
                                                String answ = sc.next();
                                                question.ansstu.add(k, answ);
                                            }
                                            System.out.println();
                                        }
                                        AA.addFirst(question);
                                        marks = 0;
                                        for (int z = 0; z < QA.get(0).qu1.size(); z++) {
                                            if (QA.getFirst().answer2.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                marks++;
                                            }
                                        }
                                        System.out.println("Your score is " + marks + "/" + QA.get(0).qu1.size());
                                        break;
                                            case 2:
                                                for (int k = 0; k < QA.get(0).qu2.size(); k++) {
                                                    System.out.print("Question "+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu1.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer3.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer3.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu2.size(); z++) {
                                                    if (QA.getFirst().answer3.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu2.size());
                                                break;
                                            case 3:
                                                for (int k = 0; k < QA.get(0).qu3.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu3.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer4.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer4.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu3.size(); z++) {
                                                    if (QA.getFirst().answer4.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu3.size());
                                                break;
                                            case 4:
                                                for (int k = 0; k < QA.get(0).qu4.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu4.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer5.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer5.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu4.size(); z++) {
                                                    if (QA.getFirst().answer5.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu4.size());
                                                break;
                                            case 5:
                                                for (int k = 0; k < QA.get(0).qu5.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu5.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer6.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer6.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu5.size(); z++) {
                                                    if (QA.getFirst().answer6.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu5.size());
                                                break;
                                            case 6:
                                                for (int k = 0; k < QA.get(0).qu6.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu6.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer7.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer7.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu6.size(); z++) {
                                                    if (QA.getFirst().answer7.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu6.size());
                                                break;
                                            case 7:
                                                for (int k = 0; k < QA.get(0).qu7.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu7.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer8.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer8.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu7.size(); z++) {
                                                    if (QA.getFirst().answer8.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu7.size());
                                                break;
                                            case 8:
                                                for (int k = 0; k < QA.get(0).qu8.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu8.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer9.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer9.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu8.size(); z++) {
                                                    if (QA.getFirst().answer9.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu8.size());
                                                break;
                                            case 9:
                                                for (int k = 0; k < QA.get(0).qu9.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu9.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer10.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer10.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu9.size(); z++) {
                                                    if (QA.getFirst().answer10.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu9.size());
                                                break;
                                            case 10:
                                                for (int k = 0; k < QA.get(0).qu10.size(); k++) {
                                                    System.out.print("Question"+(k + 1) + ")");
                                                    System.out.println(QA.get(0).qu10.get(k));
                                                    System.out.println("Choose your answer");
                                                    for (int q = 0; q < QA.get(0).answer11.size(); q++) {
                                                        System.out.println((q + 1) + ")" + QA.get(0).answer11.get(q));
                                                    }
                                                    if (sc.hasNext()) {
                                                        String answ = sc.next();
                                                        question.ansstu.add(k, answ);
                                                    }
                                                    System.out.println();
                                                }
                                                AA.addFirst(question);
                                                marks = 0;
                                                for (int z = 0; z < QA.get(0).qu10.size(); z++) {
                                                    if (QA.getFirst().answer11.get(z).equals(AA.getFirst().ansstu.get(z))) {
                                                        marks++;
                                                    }
                                                }
                                                System.out.println("Your score is " + marks + "/" + QA.get(0).qu10.size());
                                                break;
                                    }
                                    } else if (st1==2){
                                        System.out.println("Exiting the exam\n");
                                    }
                                    else
                                        System.out.println("Invalid input");
                                }
                                else System.out.println("Invalid input");
                            }
                            else {
                                System.out.print("please enter correct ID/Password\n ");
                            }
                        }
                    }
                }
                else {
                System.out.println("ID can be only Integer\n");
                }
            }
        }catch (Exception e){
            System.out.println("Question paper is not set yet " +
                    "\nPlease set question paper first\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        System.out.println("\t\t\tWelcome to the online examination system");
        try {
        while (b) {
            System.out.println("Enter 1 to register" +
                    "\nEnter 2 to login" +
                    "\nEnter 3 to exit");
            if (sc.hasNext()) {
                int login_or_register = sc.nextInt();
                if (login_or_register == 1) {
                    System.out.println("Select one of below choice" +
                            "\nEnter 1 to register as teacher" +
                            "\nEnter 2 to register as student");
                    if (sc.hasNextInt()) {
                        int student_or_teacher = sc.nextInt();
                        if (student_or_teacher==1||student_or_teacher==2){
                            register(student_or_teacher);
                        }
                        else
                            System.out.println("Please enter valid input");
                    }
                    else{
                        System.out.println("You have entered invalid input " +
                                "\nExiting the program");
                        break;
                    }
                } else if (login_or_register == 2) {
                    System.out.println("Select one of below choice" +
                            "\nEnter 1 to login as teacher" +
                            "\nEnter 2 to login as student");
                    if (sc.hasNextInt()) {
                        int student_or_teacher = sc.nextInt();
                        if (student_or_teacher==1||student_or_teacher==2){
                        login(student_or_teacher);
                        }
                        else
                            System.out.println("Please enter valid input");
                    }
                } else if (login_or_register==3) {
                    System.out.println("Exiting the program...");
                    break;
                }else
                    System.out.println("Please enter valid input");
            }
        }
    }catch (Exception e){
            System.out.println("You have entered invalid input " +
                    "\nExiting the program...");
        }
    }
}