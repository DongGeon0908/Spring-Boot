import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private final static Scanner scanner = new Scanner(System.in);

    public static String initMessage() {
        System.out.println("어서오세요. 자동차 타워입니다.");
        System.out.println("메뉴를 선택해주세요");
        System.out.println("입차");
        System.out.println("출차");
        System.out.println("조회");
        System.out.println("종료");
        return scanner.nextLine();
    }

    public static List<String> addCarMessage() {
        System.out.println("층-주차공간위치-차량사이즈-차량번호에 대해 작성해주새요");
        return Arrays.asList(scanner.nextLine().split("-"));
    }

    public static String outCarMessage() {
        System.out.println("출차할 자동차의 넘버를 입력하세요");
        return scanner.nextLine();
    }

    public static String findCarMessage() {
        System.out.println("조회할 자동차의 넘버를 입력하세요");
        return scanner.nextLine();
    }


}
