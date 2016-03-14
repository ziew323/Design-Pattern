package pattern.adapter;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
  private Map baseInfo = super.getUserBaseInfo();

  private Map homeInfo = super.getUserHomeInfo();

  private Map officeInfo = super.getUserOfficeInfo();

  @Override
  public String getUserName() {
    String homeAddress = (String) this.homeInfo.get("homeAddress");
    System.out.println(homeAddress);
    return homeAddress;
  }

  @Override
  public String getHomeAddress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getMobileNumber() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getOfficeTelNumber() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getJobPosition() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getHomeTelNumber() {
    // TODO Auto-generated method stub
    return null;
  }

}
