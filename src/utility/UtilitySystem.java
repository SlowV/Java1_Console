package utility;

public class UtilitySystem {

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String statusToString(int status){
        if (status == 1){
            return "Đã kích hoạt";
        }else if (status == 2){
            return "Đã khóa";
        }else {
            return "Đang chờ";
        }
    }
}
