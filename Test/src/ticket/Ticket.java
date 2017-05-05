package ticket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Ticket {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jiaziwei\\Desktop\\sjz-bjx.json");
        try {
            String content = FileUtils.readFileToString(file);
            JSONObject root = JSONObject.fromObject(content);
            JSONObject data = root.getJSONObject("data");
            JSONArray datas = data.getJSONArray("datas");
            List<JSONObject> list = new ArrayList<JSONObject>();
            for (int i = 0; i < datas.size(); i++) {
                JSONObject node = datas.getJSONObject(i);
                if (doCheck(node)) {
                    list.add(node);
                }
            }
            printList(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printList(List<JSONObject> list) {
        for (JSONObject object : list) {
            System.out.println(object);
        }
    }

    private static boolean doCheck(JSONObject node) {
        String fromStationNo = node.getString("from_station_no");
        if (Integer.valueOf(fromStationNo) > 1) {
            return false;
        }
        return true;
    }
}
