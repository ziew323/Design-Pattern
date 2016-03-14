package pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

  @Override
  public Map getUserBaseInfo() {
    HashMap baseInfoMap = new HashMap();
    baseInfoMap.put("userName", "这个员工叫");
    baseInfoMap.put("mobileNumber", "这个员工电话是");
    return null;
  }

  @Override
  public Map getUserOfficeInfo() {
    HashMap homeInfo = new HashMap();
    homeInfo.put("homeTelNumber", "这个员工家庭电话");
    homeInfo.put("homeAddress", "这个员工家庭地址");
    return null;
  }

  @Override
  public Map getUserHomeInfo() {
    HashMap officeInfo = new HashMap();
    officeInfo.put("jobPosition", "这个员工的职位");
    officeInfo.put("officeTelNumber", "这个员工办公电话");
    return null;
  }

}
