import java.util.Scanner;

public class Chapter05Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentNumber = "0";
        int[] scores = {};

        while (true) {
            System.out.print("선택> ");
            String option = scanner.nextLine();
            if (option.equals("5")) {
                break;
            }
            
            switch(option) {
                case "1" : 
                    System.out.print("학생수> ");
                    studentNumber = scanner.nextLine();
                    break;
                case "2" :
                    if (Integer.parseInt(studentNumber) == 0) {
                        System.out.println("1을 먼저 실행하세요.");
                        break;
                    }
                    scores = new int[Integer.parseInt(studentNumber)];
                    for (int i=0; i<Integer.parseInt(studentNumber); i++){
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case "3" :
                    if (Integer.parseInt(studentNumber) == 0 || scores.length == 0) {
                        System.out.println("1, 2를 먼저 실행하세요.");
                        break;
                    }
                    for (int i=0; i<Integer.parseInt(studentNumber); i++){
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                    break;
                case "4":
                    int maxValue = 0;
                    int sum = 0;
                    for (int i=0; i<Integer.parseInt(studentNumber); i++){
                        maxValue = scores[i] > maxValue ? scores[i] : maxValue;
                        sum += scores[i];
                    }
                    double avg = sum / Integer.parseInt(studentNumber);
                    System.out.println("최고 점수:" + maxValue);
                    System.out.println("평균 점수:" + avg);
                    break;
                default:
                    System.out.println("1 ~ 5 중의 숫자를 선택하세요.");
                    break;
            }
        }
    }
}
