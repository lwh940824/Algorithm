import java.util.*;

public class Question_2 {
    public static String[] solution(String[] rooms, int target) {

        String[] answer = {};
        HashMap<String, String[]> map = new HashMap();
        String isReady = "";
        String abs = "";

        // 새 자리가 생긴 방에 있는사람 제외
        // 지정자리가 많은 사람은 우선순위 뒤로
        // 가까운사람은 우선순위 앞으로
        // 우선순위가 같다면 사전순으로 sort


        List<Map<String, Integer>> listMap = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> nameMap = new HashMap<>();

        for (String value : rooms) {
            String[] result = value.split("]");
            String currentRoom = result[0];
            String[] nameList = result[1].split(",");

            String room = currentRoom.substring(1);

            for (String s : nameList) {
                nameMap.put(s, nameMap.getOrDefault(s, 0) + 1);
            }
            listMap.add(nameMap);
//            map.put(room, nameList);
        }


        // James : 1
        // Azad : 2
        // Louis : 1
        // Andy : 1
        // Guard : 1

        // 위 for문 결과
        // "403" : "James",
        // "404" : "Azad,Louis,Andy",
        // "101" : "Azad,Guard"

//        for (String room : map.keySet()) {
//            if (!Integer.toString(target).equals(room)) {
//                System.out.println(room);
//                for (String name : map.get(room)) {
//                    if (!Arrays.toString(map.get("403")).contains(name)) {
//                        if (!isReady.contains(name)) {
//                            isReady += name + ",";
//                            abs += Math.abs(target - Integer.parseInt(room)) + ",";
//                        }
//                    }
//                }
//            }
//        }




        return answer;
    }
}
