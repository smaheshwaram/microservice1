package com.microservice1.microservice1.dto;

import java.io.Serializable;

public class UserAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_account.userid
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_account.user_name
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_account.address
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_account.password
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.user_account
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_account.userid
     *
     * @return the value of public.user_account.userid
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_account
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public UserAccount withUserid(Integer userid) {
        this.setUserid(userid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_account.userid
     *
     * @param userid the value for public.user_account.userid
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_account.user_name
     *
     * @return the value of public.user_account.user_name
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_account
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public UserAccount withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_account.user_name
     *
     * @param userName the value for public.user_account.user_name
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_account.address
     *
     * @return the value of public.user_account.address
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_account
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public UserAccount withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_account.address
     *
     * @param address the value for public.user_account.address
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_account.password
     *
     * @return the value of public.user_account.password
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_account
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public UserAccount withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_account.password
     *
     * @param password the value for public.user_account.password
     *
     * @mbg.generated Sun Jan 27 12:10:19 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }
}