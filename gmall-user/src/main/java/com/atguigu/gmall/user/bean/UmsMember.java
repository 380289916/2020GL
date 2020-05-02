package com.atguigu.gmall.user.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class UmsMember implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer memberLevelId;
  private String username;
  private String password;
  private String nickname;
  private String phone;
  private Integer status;
  private java.sql.Timestamp createTime;
  private String icon;
  private Integer gender;
  private java.sql.Date birthday;
  private String city;
  private String job;
  private String personalizedSignature;
  private Integer sourceType;
  private Integer integration;
  private Integer growth;
  private Integer luckeyCount;
  private Integer historyIntegration;

  public UmsMember() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getMemberLevelId() {
    return memberLevelId;
  }

  public void setMemberLevelId(Integer memberLevelId) {
    this.memberLevelId = memberLevelId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }


  public String getPersonalizedSignature() {
    return personalizedSignature;
  }

  public void setPersonalizedSignature(String personalizedSignature) {
    this.personalizedSignature = personalizedSignature;
  }


  public Integer getSourceType() {
    return sourceType;
  }

  public void setSourceType(Integer sourceType) {
    this.sourceType = sourceType;
  }


  public Integer getIntegration() {
    return integration;
  }

  public void setIntegration(Integer integration) {
    this.integration = integration;
  }


  public Integer getGrowth() {
    return growth;
  }

  public void setGrowth(Integer growth) {
    this.growth = growth;
  }


  public Integer getLuckeyCount() {
    return luckeyCount;
  }

  public void setLuckeyCount(Integer luckeyCount) {
    this.luckeyCount = luckeyCount;
  }


  public Integer getHistoryIntegration() {
    return historyIntegration;
  }

  public void setHistoryIntegration(Integer historyIntegration) {
    this.historyIntegration = historyIntegration;
  }

  @Override
  public String toString() {
    return "UmsMember{" +
            "id=" + id +
            ", memberLevelId=" + memberLevelId +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", nickname='" + nickname + '\'' +
            ", phone='" + phone + '\'' +
            ", status=" + status +
            ", createTime=" + createTime +
            ", icon='" + icon + '\'' +
            ", gender=" + gender +
            ", birthday=" + birthday +
            ", city='" + city + '\'' +
            ", job='" + job + '\'' +
            ", personalizedSignature='" + personalizedSignature + '\'' +
            ", sourceType=" + sourceType +
            ", integration=" + integration +
            ", growth=" + growth +
            ", luckeyCount=" + luckeyCount +
            ", historyIntegration=" + historyIntegration +
            '}';
  }
}
