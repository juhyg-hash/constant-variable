public class Main {
    public static void main(String[] args) {
        // "happy", "angry", "sad", etc.
        String mood = "sad";


        if (mood == "happy") {
            System.out.println("나는 행복해 왜냐 행복하니깐");
        } else if (mood == "angry") {
            System.out.println("나는 화나 왜냐 화나니깐");
        } else if (mood == "sad") {
            System.out.println("나는 슬퍼 왜냐 슬프니깐");
        } else{
            System.out.println("지금 내 기분은 표현 불가");
        }

        switch (mood) {
            case "happy":
                System.out.println("나는 행복해 왜냐 행복하니깐");
                break;
            case "angry" :
                System.out.println("나는 화나 왜냐 화나니깐");
                break;
            case "sad" :
                System.out.println("나는 슬퍼 왜냐 슬프니깐");
                break;
            default :
                System.out.println("지금 내 기분은 표현 불가");


        }

    }
}