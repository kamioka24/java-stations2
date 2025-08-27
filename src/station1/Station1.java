import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        ArrayList<String> list = q1();
        System.out.println(list);
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static ArrayList<String> q1() {
        // 問題1: ここから
        ArrayList<String> tt = new ArrayList<>();
        tt.add("Tech");
        tt.add("Train");
        return tt;
        // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 問題2: ここから
        int count = 0;
        for (int i = 0; i < searchWords.size(); i++) {
            if (list.contains(searchWords.get(i))) {
                count = count + 1;
            }
        }
        return count;
        // 問題2: ここまで
    }
}
