package com.ireald.wp.domain;

import java.util.Date;
import java.util.List;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.loginid
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String loginid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.salt
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile_phone_number
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String mobile_phone_number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pinyin
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String pinyin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.serialno
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private Integer serialno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private Date create_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.deleted
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.admin
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    private Boolean admin;
    
    private List<Dept> depts;
    
    public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}

	private List<Role> roles;

    public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	private String plainPassword;

	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param user_id the value for user.user_id
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.loginid
     *
     * @return the value of user.loginid
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.loginid
     *
     * @param loginid the value for user.loginid
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.salt
     *
     * @return the value of user.salt
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.salt
     *
     * @param salt the value for user.salt
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile_phone_number
     *
     * @return the value of user.mobile_phone_number
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getMobile_phone_number() {
        return mobile_phone_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile_phone_number
     *
     * @param mobile_phone_number the value for user.mobile_phone_number
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setMobile_phone_number(String mobile_phone_number) {
        this.mobile_phone_number = mobile_phone_number == null ? null : mobile_phone_number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pinyin
     *
     * @return the value of user.pinyin
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pinyin
     *
     * @param pinyin the value for user.pinyin
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.serialno
     *
     * @return the value of user.serialno
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public Integer getSerialno() {
        return serialno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.serialno
     *
     * @param serialno the value for user.serialno
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date
     *
     * @return the value of user.create_date
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date
     *
     * @param create_date the value for user.create_date
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.deleted
     *
     * @return the value of user.deleted
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.deleted
     *
     * @param deleted the value for user.deleted
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.admin
     *
     * @return the value of user.admin
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.admin
     *
     * @param admin the value for user.admin
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getLoginid() == null ? other.getLoginid() == null : this.getLoginid().equals(other.getLoginid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile_phone_number() == null ? other.getMobile_phone_number() == null : this.getMobile_phone_number().equals(other.getMobile_phone_number()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSerialno() == null ? other.getSerialno() == null : this.getSerialno().equals(other.getSerialno()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getAdmin() == null ? other.getAdmin() == null : this.getAdmin().equals(other.getAdmin()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getLoginid() == null) ? 0 : getLoginid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile_phone_number() == null) ? 0 : getMobile_phone_number().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSerialno() == null) ? 0 : getSerialno().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        return result;
    }
}